package ru.job4j.max;

/**
 *4.2. Максимум из трех чисел [#190]
 *@author Spirinars mailto:spirinars@ya.ru
 *@version $Id$
 *since 12.07.2018
 */


public class Max {

    /**
     * Метод максимум их двух чисел.
     * @param first  первое значение
     * @param second второе значение
     * @return наибольшее значение.
     */
    public int max(int first, int second) {
      return first > second ? first : second;
    }
    /**
     * Метод максимум их трех чисел.
     *
     * @param first  первое значение
     * @param second второе значение
     * @param third третье значене
     * @return наибольшее значение.
     */
        public int max(int first, int second, int third) {
            int temp = this.max(first, second);
            return max(temp, third);
    }
}
