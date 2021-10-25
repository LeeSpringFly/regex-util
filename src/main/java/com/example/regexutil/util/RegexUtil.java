package com.example.regexutil.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtil {
    /**
     * 获取匹配的字符串
     * @param str 源字符串
     * @param regexEnum 要匹配的正则表达式
     */
    public static List<String> getMatcherString(String str, RegexEnum regexEnum) {
        if (!(str instanceof String))
            return null;

        if (!(regexEnum instanceof RegexEnum))
            return null;

        Pattern pattern = Pattern.compile(regexEnum.getExpression());
        Matcher matcher = pattern.matcher(str);
        List<String> result = new ArrayList<>();
        while (matcher.find())
            result.add(matcher.group());
        return result;
    }

    /**
     * 匹配字符串是否符合规则
     * @param str 源字符串
     * @param regexEnum 要匹配的正则表达式
     */
    public static boolean matcher(String str, RegexEnum regexEnum) {
        if (!(str instanceof String))
            return false;

        if (!(regexEnum instanceof RegexEnum))
            return false;

        return Pattern.compile(regexEnum.getExpression()).matcher(str).matches();
    }
}
