package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test.
 *
 *@author Spirin Arseny (mailto: spirinars@ya.ru)
 *version $id$
 *since 0.1
 */
public class BubbleSortTest {
    @Test
    public void whenSortArrayWithFourAmountOfElementsSortedArray() {
       BubbleSort bubble = new BubbleSort();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = bubble.sort(input);
        int[] expect = new int[] {1, 2, 4, 6};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSortArrayWithFiveAmountOfElementsSortedArray() {
        BubbleSort bubble = new BubbleSort();
        int[] input = new int[] {4, 1, 6, 2, 9};
        int[] result = bubble.sort(input);
        int[] expect = new int[] {1, 2, 4, 6, 9};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSortArrayWithTenAmountOfElementsSortedArray() {
        BubbleSort bubble = new BubbleSort();
        int[] input = new int[] {4, 1, 6, 2, 9, 3, 7, 8, 10, 5};
        int[] result = bubble.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSortArrayWithNullAmountOfElementsSortedArray() {
        BubbleSort bubble = new BubbleSort();
        int[] input = new int[] {};
        int[] result = bubble.sort(input);
        int[] expect = new int[] {};
        assertThat(result, is(expect));
    }
}