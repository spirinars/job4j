package ru.job4j.array;

import java.util.Arrays;
/**
 * @author SpirinArseny (spirinars@ya.ru)
 * @version $Id$
 * @since 0.1
 */
public class ArrayDuplicate {
    /**
     * Метод удаляет дубликаты из массива.
     *
     * @param array заданный массив.
     * @return массив без дубликатов.
     */
    public String[] remove(String[] array) {
        int l = array.length;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (array[i].equals(array[j])) {
                    array[j] = array[l - 1];
                    l--;
                    j--;
                }
            }
        }
        return Arrays.copyOf(array, l);
    }
}