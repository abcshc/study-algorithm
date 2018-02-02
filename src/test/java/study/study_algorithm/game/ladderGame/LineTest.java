package study.study_algorithm.game.ladderGame;

import org.junit.Test;

import static org.junit.Assert.*;

public class LineTest {
    @Test
    public void test1(){
        Line line = new Line(5);
        String printValue = line.print();
        System.out.println(printValue);
    }

}