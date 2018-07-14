package ru.job4j.loop;

/**
 *5.4. Построить пирамиду в псевдографике. [#4412]
 *@author Spirin Arseny mailto:spirinars@ya.ru
 *@version $Id$
 *since 12.07.2018
 */
public class Paint {
    public String pyramid(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}