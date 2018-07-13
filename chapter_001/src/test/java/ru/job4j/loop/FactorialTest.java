package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *@author Spirinars mailto:spirinars@ya.ru
 *@version $Id$
 *since 13.07.2018
 */
public class FactorialTest {
    @Test
    public void whenAdd5ResultIs120() {
        Factorial fact = new Factorial();
        int resul = fact.add(5);
        assertThat(resul, is(120));
    }
    @Test
    public void whenAdd0ResultIs1() {
        Factorial fact = new Factorial();
        int resul = fact.add(0);
        assertThat(resul, is(1));
    }
}


