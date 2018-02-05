package study.study_algorithm.strings;

import java.util.ArrayList;
import java.util.Scanner;

public class MinKyunPassword {
    public static void main(String[] args) {
        ArrayList<String> passList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int passLength = in.nextInt();

        for (int i = 0; i < passLength; i++) {
            passList.add(in.next());
        }
        System.out.println(execute(passList));
    }

    public static String execute(ArrayList<String> values) {
        int resultLength = 0;
        char resultChar = ' ';

        for(int i = 0; i < values.size(); i++){
            for(int j = 0; j < values.size(); j++){
                if(checkReverseValue(values.get(i), values.get(j))){
                    resultLength = values.get(i).length();
                    resultChar = values.get(i).charAt(resultLength/2);
                }
            }
        }
        return resultLength + " " + resultChar;
    }

    public static boolean checkReverseValue(String value1, String value2) {
        if (value1.length() != value2.length()) {
            return false;
        }
        int size = value1.length();
        for (int i = 0; i < size; i++) {
            if (value1.charAt(i) != value2.charAt(size - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
