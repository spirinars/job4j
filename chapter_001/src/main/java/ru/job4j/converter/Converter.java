package ru.job4j.converter;

/**
 *Class Converter Решение задачи части [41583]
 *@author Spirinars mailto:spirinars@ya.ru
 *since 09.07.2018
 */
public class Converter {
    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleuro(int value) {
        return value / 70;
    }
    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public int rubllar(int value) {
        return value / 60;
    }
    /**
     * Конвертируем евро в рубли.
     * @param value евро.
     * @return Рубли.
     */
    public int euruble(int value) {
        return value * 70;
    }
    /**
     * Конвертируем доллары в рубли.
     * @param value доллары.
     * @return Рубли.
     */
    public int dolle(int value) {
        return value * 60;
    }
}

