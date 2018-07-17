package ru.job4j.array;

/**
 *6.5. Создать программу для сортировки массива методом перестановки. [#195]
 *@author Spirin Arseny mailto:spirinars@ya.ru
 *@version $Id$
 *since 16.07.2018
 */
public class BubbleSort {
    /**
     *
     * @param array
     * @return sorted array.
     */
    public int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int smaller = array[i];
            for (int j = i - 1; j >= 0; j--) {
                int bigger = array[j];
                if (smaller < bigger) {
                    array[j + 1] = bigger;
                    array[j] = smaller;
                } else {
                    break;
                }
            }
        }
        return array;
    }
}