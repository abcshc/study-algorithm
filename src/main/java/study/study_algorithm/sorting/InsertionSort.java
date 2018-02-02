package study.study_algorithm.sorting;

public class InsertionSort {
    public static void execute(int size, int[] array) {
        int selectedIndex = size - 1;
        int selectedValue = array[selectedIndex];
        boolean solved = false;
        for (int i = 0; i < size - 1; i++) {
            if (array[selectedIndex - (i + 1)] > selectedValue) {
                array[selectedIndex - i] = array[selectedIndex - (i + 1)];
            } else {
                array[selectedIndex - i] = selectedValue;
                i = size;
                solved = true;
            }

            printResult(array);
        }
        if(!solved){
            array[0] = selectedValue;
            printResult(array);
        }
    }

    public static void printResult(int[] array) {
        String result = "";
        for (int value : array) {
            result += value + " ";
        }
        System.out.println(result);
    }
}
