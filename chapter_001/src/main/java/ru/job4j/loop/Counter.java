package ru.job4j.loop;

/**
 *5.1. Подсчет суммы чётных чисел в диапазоне [#192]
 *@author Spirinars mailto:spirinars@ya.ru
 *@version $Id$
 *since 12.07.2018
 */
public class Counter {
    /**
     * Method add.
     * @param start int.
     * @param finish int.
     * @return result.              .
     */
    public int add(int start, int finish) {
            int result = 0;
            for (int index = start; index <= finish; index++) {
                if (index % 2 == 0) {
                    result += index;
                }
            }
            return result;
        }
}

