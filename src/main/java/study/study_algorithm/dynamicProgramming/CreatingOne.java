package study.study_algorithm.dynamicProgramming;

import java.util.ArrayList;
import java.util.HashSet;

public class CreatingOne {

    public static int execute(int inputValue) {
        HashSet<Integer> memo = new HashSet<>();
        ArrayList<ArrayList<Integer>> layer = new ArrayList<>();
        layer.add(new ArrayList<>());
        layer.get(0).add(inputValue);
        memo.add(inputValue);
        for (int i = 0; i < layer.size(); i++) {
            ArrayList<Integer> currentLayer = layer.get(i);
            for (int j = 0; j < currentLayer.size(); j++) {
                ArrayList<Integer> nextLayer = new ArrayList<>();
                int currentValue = currentLayer.get(j);
                if ((!memo.contains(currentValue)) && currentValue % 3 == 0) {

                }
                nextLayer.add();
            }
        }
        if (inputValue % 2 == 0) {

        }
        if (inputValue)

            int count = 0;
        return count;
    }
}
