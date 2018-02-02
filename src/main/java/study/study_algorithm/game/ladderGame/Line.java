package study.study_algorithm.game.ladderGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Line {
    private List<Boolean> bars = new ArrayList<>();

    public Line(int entry) {
        for (int i = 0; i < entry; i++) {
            bars.add(createBar(i));
        }
    }
    public String print(){
        String printValue = "";
        printValue +="|";
        for(int i = 0; i < bars.size(); i++){
            printValue += printBar(bars.get(i)) + "|";
        }
        return printValue;
    }

    private String printBar(boolean bool){
        if(bool)
            return "-----";
        return "     ";
    }

    private boolean createBar(int index) {
        Random random = new Random();
        int rnd;
        if (index == 0) {
            rnd = random.nextInt(10);
            return rndCreateBar(rnd);
        }
        if (bars.get(index - 1)) {
            return false;
        }
        rnd = random.nextInt(10);
        return rndCreateBar(rnd);
    }

    private boolean rndCreateBar(int random) {
        if (random > 5) {
            return true;
        }
        return false;
    }
}
