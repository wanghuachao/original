//测试文件
var allTestFiles = [];
//依赖的非测试文件
var allPath = {};
var TEST_REGEXP = /(spec|test)\.js$/i;

//获取js文件的路径绝对路径，用于requirejs加载
var pathToAbsModule = function(path){
  return path.replace(/\.js$/, '');
}
// Get a list of all the test files to include
Object.keys(window.__karma__.files).forEach(function (file) {
  if (TEST_REGEXP.test(file)) {
    // Normalize paths to RequireJS module names.
    // If you require sub-dependencies of test files to be loaded as-is (requiring file extension)
    // then do not normalize the paths
    var normalizedTestModule = file.replace(/\.js$/, '');
    allTestFiles.push(normalizedTestModule);
  }else{
    if(!file.startsWith('/base/src/main/webapp/WEB-INF/js')){
      //以文件名（无.js）当做module的名
      var moduleName = file.match('([^/.]+).js$')[1];
      allPath[moduleName] = pathToAbsModule(file);
    }
  }
});

var starMap = {};
allPath['test-javascript'] = '/base/src/test/javascript';

require.config({
  // Karma serves files under /base, which is the basePath from your config file
  baseUrl: '/base/src/main/webapp/WEB-INF/js',

  // dynamically load all test files
  deps: allTestFiles,

  paths: allPath,

  map:{
    '*': starMap
  },

  // we have to kickoff jasmine, as it is asynchronous
  callback: window.__karma__.start
})
