package com.example.regexutil;

import com.example.regexutil.util.RegexEnum;
import com.example.regexutil.util.RegexUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestPostalCode {

    @Test
    void nullParam() {
        assertFalse(RegexUtil.matcher(null, null));
    }

    // 邮政编码
    @Test
    void equalExp() {
        assertTrue(RegexUtil.matcher("123456", RegexEnum.REGEX_POSTALCODE));
    }

    @Test
    void notEqualExp() {
        assertFalse(RegexUtil.matcher("1234567", RegexEnum.REGEX_POSTALCODE));
        assertFalse(RegexUtil.matcher("w12345", RegexEnum.REGEX_POSTALCODE));
        assertFalse(RegexUtil.matcher("12345", RegexEnum.REGEX_POSTALCODE));
    }

    @Test
    void findStringList() {
        List<String> subStringList = RegexUtil.getMatcherString("123456, 789012; w34asd", RegexEnum.REGEX_POSTALCODE);
        subStringList.stream().forEach(System.out::println);
        assertEquals(subStringList.size(), 2);
    }
}
