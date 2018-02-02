package study.study_algorithm.strings;

public class SuperReducedString {
    public String execute_(String str){
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
                str = str.substring(0, i-1) + str.substring(i+1);
                i = 0;
            }
        }
        if (str.length() == 0) {
           return "Empty String";
        } else {
            return str;
        }
    }

    public String execute(String value){
        String lastValue = "";
        String currentValue = value;
        boolean flag = true;
        while(flag){
            lastValue = remove(currentValue);;
            if(currentValue.equals(lastValue)){
                flag = false;
            }
            currentValue = lastValue;
        }
        if (lastValue.length() == 0) {
            return "Empty String";
        }
        return lastValue;
    }

    public String remove(String inputValue) {
        String result = "";
        for (int i = 0; i < inputValue.length(); i++) {
            Character c = inputValue.charAt(i);
            if (i == inputValue.length() - 1) {
                result += c;
                break;
            }
            Character nextC = inputValue.charAt(i + 1);
            if (c.equals(nextC)) {
                i++;
            } else {
                result += c;
            }
        }
        return result;
    }
}
