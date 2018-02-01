package study.study_algorithm.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class SuperReducedStringTest {
    SuperReducedString superReducedString = new SuperReducedString();
    @Test
    public void example1(){
        assertEquals(superReducedString.execute("aaabccddd"), "abd");
    }

    @Test
    public void example2(){
        assertEquals(superReducedString.execute("baab"), "Empty String");
    }

    @Test
    public void example3(){
        assertEquals(superReducedString.execute("aa"), "Empty String");
    }
}