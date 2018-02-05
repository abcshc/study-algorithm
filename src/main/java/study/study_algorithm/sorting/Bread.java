package study.study_algorithm.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Bread {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        in.nextLine();
        String current = in.nextLine();
        String result = in.nextLine();

        result(current, result);
    }

    public static void result(String current, String result) {
        String currentValue[] = current.split(" ");
        ArrayList<String[]> resultList = allT(currentValue);

        if (resultList.contains(result.replace(" ", ""))) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
    }

    public static ArrayList<String[]> allT(String[] values) {
        ArrayList<String[]> results = new ArrayList<>();
        results.add(values);
        int index = 0;

        for (int j = 0; j < results.size(); j++) {
            for (int i = 1; i < values.length - 1; i++) {
                String[] tempValue = getAndSort(results.get(index), i);
                if (!results.contains(tempValue)) {
                    results.add(tempValue);
                }
            }
            index++;
        }
        return results;
    }

    public static String[] getAndSort(String inputValue[], int index) {
        LinkedList<String> values = new LinkedList<>(Arrays.asList(inputValue));
        String moveValue = values.get(index + 1);

        values.remove(index + 1);
        values.add(index - 1, moveValue);

        return values.toArray(inputValue);
    }
}
