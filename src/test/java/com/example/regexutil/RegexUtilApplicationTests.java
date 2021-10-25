package com.example.regexutil;

import com.example.regexutil.util.RegexEnum;
import com.example.regexutil.util.RegexUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class RegexUtilApplicationTests {

    // 手机号
    @Test
    void matcherMobile() {
        assertTrue(RegexUtil.matcher("13511112222", RegexEnum.REGEX_MOBILE));
    }

    @Test
    void findMobileList() {
        List<String> mobileList = RegexUtil.getMatcherString("13511112222; 13533334444, 1234567", RegexEnum.REGEX_MOBILE);
        mobileList.stream().forEach(System.out::println);
        assertEquals(mobileList.size(), 2);
    }


}
