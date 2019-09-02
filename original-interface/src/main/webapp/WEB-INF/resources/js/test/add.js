define(['test/minus'],function(minus){
    var add = {
        //两个数相加
        add: function(a, b){
            return a + b;
        },
        //将去一个固定的数
        useMinus: function(a){
            minus.minus(8, a);
        }
    };
    return add;
});