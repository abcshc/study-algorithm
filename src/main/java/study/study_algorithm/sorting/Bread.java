package study.study_algorithm.sorting;

import java.util.*;
import java.util.stream.Collectors;

public class Bread {
    public static String result;
    public static int size;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        size = in.nextInt();
        in.nextLine();
        String current = in.nextLine();
        result = in.nextLine();
        LinkedList currentValue = convertInputValue(current);
        LinkedList check = convertInputValue(result);
        if (execute(currentValue, check)) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
    }

    public static boolean execute(LinkedList<String> values, LinkedList<String> check) {
        for (int i = 0; i < size - 2; i++) {
            values = moveMatchingIndex(values, check, i);
        }
        if (convertOutputValue(values).equals(result))
            return true;
        return false;
    }

    public static LinkedList<String> moveMatchingIndex(LinkedList<String> current, LinkedList<String> goal, int index) {
        String goalValue = goal.get(index);
        int currentIndex = current.indexOf(goalValue);
        while (index != currentIndex) {
            if (currentIndex - index == 1) {
                current = getAndSort(current, currentIndex);
                current = getAndSort(current, currentIndex);
                currentIndex = currentIndex - 1;
            } else {
                current = getAndSort(current, currentIndex - 1);
                currentIndex = currentIndex - 2;
            }
        }
        return current;
    }

    public static LinkedList<String> getAndSort(LinkedList<String> values, int index) {
        String moveValue = values.get(index + 1);
        values.remove(index + 1);
        values.add(index - 1, moveValue);
        return values;
    }

    public static LinkedList<String> convertInputValue(String value) {
        return new LinkedList<>(Arrays.asList(value.split(" ")));
    }

    public static String convertOutputValue(LinkedList<String> value) {
        return value.stream().map(e -> e.toString()).collect(Collectors.joining(" "));
    }
}
