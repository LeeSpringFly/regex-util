package com.example.regexutil.util;

public enum RegexEnum {

    REGEX_EMAIL("电子邮件", "[\\w-_]+(\\.[\\w-]+)*@[\\w-]+(\\.[\\w-]+)+?"),
    REGEX_POSTALCODE("邮编", "[1-9]\\d{5}?"),
    REGEX_TEL("电话号码", "((13|14|15|16|18|17|19)+\\d{9})|(0\\d{2,3}-?\\d{6,9})?"),
    REGEX_MOBILE("手机号", "((13[0-9])|(14[579])|(15([0-3]|[5-9]))|(16[6])|(17[0135678])|(18[0-9])|(19[89]))\\d{8}?"),
    REGEX_IP("IPv4地址", "(([1-9]|([1-9]\\d)|(1\\d\\d)|(2([0-4]\\d|5[0-5])))\\.)(([1-9]|([1-9]\\d)|(1\\d\\d)|(2([0-4]\\d|5[0-5])))\\.){2}([1-9]|([1-9]\\d)|(1\\d\\d)|(2([0-4]\\d|5[0-5])))?"),
    REGEX_PWD("密码", "(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,16}?"),
    REGEX_USERNAME("用户名", "[A-Za-z0-9]+?");

    private String expression;
    private String description;

    RegexEnum(String description, String expression) {
        this.expression = expression;
        this.description = description;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return super.name();
    }
}
