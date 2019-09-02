(function ($) {
  var util = {
    doAjax: function (settingOpt) {
      var defaultSetting = {
        url: settingOpt.url || "", // 请求地址
        method: (settingOpt.method || "GET").toUpperCase(), //请求方式
        async: settingOpt.async || true, // 是否异步
        contentType: settingOpt.contentType
            || "application/x-www-form-urlencoded",
        dataType:
            settingOpt.dataType || "json", // 解析方式
        data:
            settingOpt.data || "" // 参数
      };
      var newOpt = $.extend(true, defaultSetting, settingOpt);
      return $.ajax(newOpt);
    }
  };
  //这里确定了插件的名称
  this.commonUtil = util;
})($);