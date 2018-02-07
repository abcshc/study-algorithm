package study.study_algorithm.dynamicProgramming;

import org.junit.Test;

import static org.junit.Assert.*;

public class CreatingOneTest {

    @Test
    public void test1(){
        assertEquals(CreatingOne.execute(2), 1);
        assertEquals(CreatingOne.execute(10), 3);
        assertEquals(CreatingOne.execute(1), 1);
    }

}