/**
 * 搜索 input 输入框，匹配 inputType 值，限制输入内容
 * 要使用 js，需要配合 jquery
 */

let numberType = 'number';
let pointNumberType = 'pointNumber';
let postalCodeType = 'postalCode';

$(function () {
    let inputType;

    // 只能输入数字
    $('input').each(function () {
        inputType = $(this).attr('inputType');
        if (inputType === numberType)
            number(this);

        if (inputType === pointNumberType)
            pointNumber(this);

        if (inputType === postalCodeType)
            postalCode(this);
    });
});

// 仅0-9数字
function number(dom) {
    $(dom).on('input propertychange', function(e) {
        let text = $(this).val().replace(/[^\d]/g, "");
        $(this).val(text)
    });
}

// 带小数点的数字
function pointNumber(dom) {
    $(dom).on('input propertychange', function(e) {
        $(this).val($(this).val().replace(/[^\d^\.]/g, ''));
        let text = $(this).val().match(/^\d*\.?\d{0,3}/g)[0];
        $(this).val(text);
    });
}

// 邮箱
function postalCode(dom) {
    $(dom).on('input propertychange', function(e) {
        $(this).val($(this).val().replace(/[^\d]/g, ''));
        let i = 0;
        let index = 'mark';
        for (i = 0; i < $(this).val().length; i++) {
            if ($(this).val().substring(i, 1) != 0) {
                index = i;
                break;
            }
        }
        if (typeof(index) === 'string')
            $(this).val($(this).val().substring(1, 1));

        if ($(this).val().length > 6)
            $(this).val($(this).val().substring(0,6));
    });
}
