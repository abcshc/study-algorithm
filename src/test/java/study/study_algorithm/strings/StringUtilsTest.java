package study.study_algorithm.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {

    @Test
    public void remove() {
        assertEquals(StringUtils.remove("hello", 2), "helo");
        assertEquals(StringUtils.remove("abcdefg", 0), "bcdefg");
        assertEquals(StringUtils.remove("good", 3), "goo");
        assertEquals(StringUtils.remove("qwertyuiopasdfghjklzxcvbnm", 22), "qwertyuiopasdfghjklzxcbnm");
    }

    @Test
    public void removeRange() {
        assertEquals(StringUtils.remove("hello", 2, 4), "he");
        assertEquals(StringUtils.remove("abcdefg", 0, 0), "bcdefg");
        assertEquals(StringUtils.remove("good", 0, 3), "");
        assertEquals(StringUtils.remove("qwertyuiopasdfghjklzxcvbnm",0 ,22), "bnm");
    }
}