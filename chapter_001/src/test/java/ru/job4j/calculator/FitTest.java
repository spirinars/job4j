package ru.job4j.calculator;

import org.junit.Test;
import ru.job4j.calculator.Fit;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 *Test.
 *
 *@author Spirin Arseny (mailto: spirinars@ya.ru)
 *version $id$
 *since 0.1
 */
public class FitTest {

    @Test
    public void manWeight() {
        Fit fit = new Fit();
        double weight = fit.manWeight(180);
        assertThat(weight, closeTo(92.0, 0.1));
    }

    @Test
    public void womanWeight() {
        Fit fit = new Fit();
        double weight = fit.womanWeight(170);
        assertThat(weight, closeTo(69.0, 0.1));
    }
}