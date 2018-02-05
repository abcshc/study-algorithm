package study.study_algorithm.strings;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MinKyunPasswordTest {

    @Test
    public void test0(){
        ArrayList<String> values = new ArrayList<String>();
        values.add("sas");
        assertEquals(MinKyunPassword.execute(values), "3 a");
    }

    @Test
    public void test1(){
        ArrayList<String> values = new ArrayList<String>();
        values.add("las");
        values.add("god");
        values.add("psala");
        values.add("sal");
        values.add("hello");
        values.add("qweeera");
        values.add("goodw");
        values.add("sdfgsde");
        assertEquals(MinKyunPassword.execute(values), "3 a");
    }

    @Test
    public void test3(){
        ArrayList<String> values = new ArrayList<String>();
        values.add("edsgfds");
        values.add("god");
        values.add("psala");
        values.add("sal");
        values.add("hello");
        values.add("qweeera");
        values.add("goodw");
        values.add("sdfgsde");
        assertEquals(MinKyunPassword.execute(values), "7 g");
    }

    @Test
    public void test2(){
        assertTrue(MinKyunPassword.checkReverseValue("hello", "olleh"));
        assertTrue(MinKyunPassword.checkReverseValue("las", "sal"));
        assertTrue(MinKyunPassword.checkReverseValue("tulipan", "napilut"));
    }

}