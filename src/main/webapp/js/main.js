function inputMoney(item) {
    $(item).unbind('input propertychange').bind('input propertychange', function() {
        var $this = $(this);
        var val = $this.val();
        var reg = /^(\d*)(\.?)(\d{0,2})/g;
        val.replace(reg,function(rs,$1,$2,$3){
            val = $1 + $2 + $3;
        });
        $this.val(val);
    });
}

function inputYear(item) {
    $(item).unbind('input propertychange').bind('input propertychange', function() {
        var $this = $(this);
        var val = $this.val();
        var year = parseInt(val);
        var reg = /^(\d{0,4})/g;
        val.replace(reg,function(rs,$1){
            val = $1;
        });
        $this.val(val);
    });
}

function checkMoney(item, defVal) {
    var reg = /^(\d*)(\.?)(\d{0,2})/g;
    $(item).val().replace(reg,function(rs,$1,$2,$3){
        var money = 0;
        if (defVal != undefined) money = defVal;
        if ($2) $3 = $3.length == 0 ? '00' : $3;
        if ($1) money = $1 + $2 + $3;
        $(item).val(money);
    });
}

function checkDate(item) {
    var date = $(item).val().replace(/[^\d-]/g);
    if (new Date(date).getDate() != date.substring(date.length-2)) $(item).val('');
}

function checkYear(item) {
    var year = $(item).val();
    var reg=/^(1949|19[5-9]\d|2\d{3})$/;
    if (!reg.test(year)) $(item).val('');
}