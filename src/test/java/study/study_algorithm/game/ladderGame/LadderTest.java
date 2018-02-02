package study.study_algorithm.game.ladderGame;

import org.junit.Test;

public class LadderTest {
    @Test
    public void test1(){
        Ladder ladder = new Ladder(9, 14);
        StringBuilder printValue = ladder.print();
        System.out.println(printValue);
    }

}