package ru.job4j.array;

/**
 *6.0. 6.1. Классический поиск перебором. [#33489]
 *@author Spirin Arseny mailto:spirinars@ya.ru
 *@version $Id$
 *since 16.07.2018
 */
public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}