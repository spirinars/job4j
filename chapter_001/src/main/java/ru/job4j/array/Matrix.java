package ru.job4j.array;

/**
 *6.6. Двухмерный массив. Таблица умножения. [#33491]
 *@author Spirin Arseny mailto:spirinars@ya.ru
 *@version $Id$
 *since 17.07.2018
 */
public class Matrix {
    int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table [i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
