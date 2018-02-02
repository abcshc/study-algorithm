package study.study_algorithm.sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {
    @Test
    public void test1(){
        InsertionSort.execute(5, new int[]{2, 4, 6, 8, 3});
    }

    @Test
    public void test2(){
        InsertionSort.execute(14, new int[]{1, 3, 5, 9, 13, 22, 27, 35, 46, 51, 55, 83, 87, 23});
    }

    @Test
    public void test3(){
        InsertionSort.execute(10, new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 1});
    }

}