package study.study_algorithm.game.ladderGame;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    private List<Line> lines = new ArrayList<>();

    public Ladder(int entry, int height) {
        for (int i = 0; i < height; i++) {
            lines.add(new Line(entry));
        }
    }

    public StringBuilder print() {
        StringBuilder result = new StringBuilder();
        for (Line line : lines) {
            result.append(line.print() + "\n");
        }
        return result;
    }
}
