package study.study_algorithm.strings;

public class StringUtils {
    public static String remove(String value, int index) {
        String result = "";
        result += value.substring(0, index);
        result += value.substring(index + 1, value.length());
        return result;
    }
    public static String remove(String value, int startIndex, int lastIndex) {
        String result = "";
        result += value.substring(0, startIndex);
        result += value.substring(lastIndex + 1, value.length());
        return result;
    }
}
