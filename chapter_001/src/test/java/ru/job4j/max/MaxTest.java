package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *@author Spirinars mailto:spirinars@ya.ru
 *@version $Id$
 *since 11.07.2018
 */
public class MaxTest {
    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenSecondLessFirst() {
        Max maxim = new Max();
        int result = maxim.max(3, 1);
        assertThat(result, is(3));
    }
    @Test
    public void whenFirstEqualiesSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 1);
        assertThat(result, is(1));
    }
           }
