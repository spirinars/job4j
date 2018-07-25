package ru.job4j.array;

/**
 *6.0. 6.1. Классический поиск перебором. [#33489]
 *@author Spirin Arseny mailto:spirinars@ya.ru
 *@version $Id$
 *since 16.07.2018
 */
public class FindLoop {
    public int index(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}