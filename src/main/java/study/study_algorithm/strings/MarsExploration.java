package study.study_algorithm.strings;

public class MarsExploration {
    public static int execute_(String message) {
        String sos = "SOS";
        int count = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) != sos.charAt(i % 3)) count++;
        }
        return count;
    }

    public static int execute(String inputValue) {
        int lastIndex = inputValue.length() - 1;
        int cnt = 0;
        String collectValue = "SOS";
        String checkValue;
        for (int i = 0; i < lastIndex; i += collectValue.length()) {
            checkValue = inputValue.substring(i, i + collectValue.length());
            if (!collectValue.equals(checkValue)) {
                for (int j = 0; j < collectValue.length(); j++) {
                    if (collectValue.charAt(j) != checkValue.charAt(j))
                        cnt++;
                }
            }
        }
        return cnt;
    }
}
