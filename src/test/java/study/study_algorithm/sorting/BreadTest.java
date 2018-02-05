package study.study_algorithm.sorting;

import org.junit.Test;


import java.util.ArrayList;

import static org.junit.Assert.*;

public class BreadTest {
    private Bread bread = new Bread();

    @Test
    public void result() {
        bread.result("1 2 3 4", "4 3 2 1");
        bread.result("1 2 3 4 5 6", "6 5 4 3 2 1");
        bread.result("1 2 3 4 5 6 7", "1 2 3 4 7 5 6");
    }

    @Test
    public void stringTest() {
        assertEquals("1 2 3 4".replace(" ", ""), "1234");
    }

//    @Test
//    public void getAndSortTest() {
//        assertEquals(bread.getAndSort(new String[]{"1", "2", "3", "4", "5"}, 3), "12534");
//        assertEquals(bread.getAndSort(new String[]{"1", "2", "3", "4", "5"}, 1), "31245");
//        assertEquals(bread.getAndSort(new String[]{"1", "2", "3", "4"}, 1), "3124");
//        assertEquals(bread.getAndSort(new String[]{"1", "2", "3", "4"}, 2), "1423");
//    }

    @Test
    public void total() {
        ArrayList<String[]> results = bread.allT(new String[]{"1", "2", "3", "4"});
        for (String[] value : results) {
            System.out.println(value);
        }
    }

}