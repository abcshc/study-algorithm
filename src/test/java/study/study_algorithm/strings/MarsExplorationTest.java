package study.study_algorithm.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class MarsExplorationTest {
    @Test
    public void test1(){
        assertEquals(MarsExploration.execute("SOSSPSSQSSOR"), 3);
        assertEquals(MarsExploration.execute("SOSSOT"), 1);
    }

}