package ru.job4j.array;

/**
 *6.0. 6.1. Классический поиск перебором. [#33489]
 *@author Spirin Arseny mailto:spirinars@ya.ru
 *@version $Id$
 *since 16.07.2018
 */
public class Turn {
    public int[] turn(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int newIndex = array[index];
            array[index] = array[array.length - 1 - index];
            array[array.length - 1 - index] = newIndex;
            }
        return array;
    }
}
