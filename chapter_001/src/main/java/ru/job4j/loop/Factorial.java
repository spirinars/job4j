package ru.job4j.loop;
/**
 *5.2. Создать программу вычисляющую факториал. [#193]
 *@author Spirinars mailto:spirinars@ya.ru
 *@version $Id$
 *since 13.07.2018
 */
public class Factorial {
    /**
     * Method add Считает факториал числа n.
     * @param n int/
     * @return result.              .
     */
    public int add(int n) {
        int result = 1;
        for (int index = 1; index <= n; index++) {
                result *= index;
            }
        return result;
    }
}

