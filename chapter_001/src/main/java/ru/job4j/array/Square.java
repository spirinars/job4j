package ru.job4j.array;

/**
 *6.0. Заполнить массив степенями чисел. [#33488]
 *@author Spirin Arseny mailto:spirinars@ya.ru
 *@version $Id$
 *since 16.07.2018
 */
public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < rst.length; i++) {
            rst[i] = (int) Math.pow((i + 1), 2);
        }
        return rst;
    }
}
