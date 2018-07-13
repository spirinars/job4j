package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *@author Spirinars mailto:spirinars@ya.ru
 *@version $Id$
 *since 12.07.2018
 */
    public class CounterTest {
        @Test
        public void whenSumEvenNumbersFromOneToTenThenThirty() {
            Counter count = new Counter();
            int resul = count.add(0, 10);
            assertThat(resul, is(30));
        }
        @Test
        public void whenSumEvenNumbersFromTwentyToThirtyThen150() {
        Counter count = new Counter();
        int resul = count.add(20, 30);
        assertThat(resul, is(150));
        }
    }

