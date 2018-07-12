package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *@author Spirinars mailto:spirinars@ya.ru
 *@version $Id$
 *since 12.07.2018
 */
public class MaxTest {
    @Test
    public void whenThirdIsMaximum() {
        Max maxim = new Max();
        int result = maxim.max(1, 2, 3);
        assertThat(result, is(3));
    }
    @Test
    public void whenFirstIsMaximum() {
        Max maxim = new Max();
        int result = maxim.max(3, 1, 2);
        assertThat(result, is(3));
    }
    @Test
    public void whenSecondIsMaximum() {
        Max maxim = new Max();
        int result = maxim.max(1, 3, 2);
        assertThat(result, is(3));
    }
    @Test
    public void whenFirstSecondThirdEqualies() {
        Max maxim = new Max();
        int result = maxim.max(1, 1, 1);
        assertThat(result, is(1));
    }

}

