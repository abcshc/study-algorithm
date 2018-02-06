package study.study_algorithm.sorting;

import org.junit.Test;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class BreadTest {

    @Test
    public void executeTest() {
        LinkedList<String> values = convertInputValue("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40");
        Bread.convertInputValue(Bread.convertOutputValue(values));
        LinkedList<String> check = convertInputValue("1 2 3 40 39 38 37 36 35 34 33 32 31 30 29 28 27 26 25 24 23 22 21 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4");
        Bread.convertInputValue(Bread.convertOutputValue(check));
        assertFalse(Bread.execute(values, check));
    }

    @Test
    public void getAndSortTest() {
        LinkedList<String> temp1 = convertInputValue("1 2 3 4");
        temp1 = Bread.getAndSort(temp1, 2);
        assertEquals(convertOutputValue(temp1), "1 4 2 3");
        temp1 = Bread.getAndSort(temp1, 1);
        assertEquals(convertOutputValue(temp1), "2 1 4 3");
    }

    @Test
    public void moveMatchingIndexTest1() {
        LinkedList<String> current = convertInputValue("1 2 3 4 5");
        LinkedList<String> lastValue = convertInputValue("5 4 3 2 1");
        current = Bread.moveMatchingIndex(current, lastValue, 0);
        assertEquals(convertOutputValue(current), "5 1 2 3 4");
    }

    @Test
    public void moveMatchingIndexTest2() {
        LinkedList<String> current = convertInputValue("5 1 2 3 4");
        LinkedList<String> lastValue = convertInputValue("5 4 3 2 1");
        current = Bread.moveMatchingIndex(current, lastValue, 1);
        assertEquals(convertOutputValue(current), "5 4 2 1 3");
    }

    @Test
    public void moveMatchingIndexTest3() {
        LinkedList<String> current = convertInputValue("5 4 2 1 3");
        LinkedList<String> lastValue = convertInputValue("5 4 3 2 1");
        current = Bread.moveMatchingIndex(current, lastValue, 2);
        assertEquals(convertOutputValue(current), "5 4 3 2 1");
    }
    @Test
    public void moveMatchingIndexTest4() {
        LinkedList<String> current = convertInputValue("6 5 4 1 2 3");
        LinkedList<String> lastValue = convertInputValue("6 5 4 3 1 2");
        current = Bread.moveMatchingIndex(current, lastValue, 3);
        assertEquals(convertOutputValue(current), "6 5 4 3 1 2");
    }

    @Test
    public void moveMatchingIndexTestThree1(){
        LinkedList<String> current = convertInputValue("1 2 3");
        LinkedList<String> lastValue = convertInputValue("3 1 2");
        current = Bread.moveMatchingIndex(current, lastValue, 0);
        assertEquals(convertOutputValue(current), "3 1 2");
    }

    @Test
    public void moveMatchingIndexTestThree2(){
        LinkedList<String> current = convertInputValue("1 2 3");
        LinkedList<String> lastValue = convertInputValue("2 3 1");
        current = Bread.moveMatchingIndex(current, lastValue, 0);
        assertEquals(convertOutputValue(current), "2 3 1");
    }

    private LinkedList<String> convertInputValue(String value) {
        return Bread.convertInputValue(value);
    }

    private String convertOutputValue(LinkedList<String> inputValue) {
        return Bread.convertOutputValue(inputValue);
    }
}