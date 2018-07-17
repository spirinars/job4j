package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
        *Test.
        *
        *@author Spirin Arseny (mailto: spirinars@ya.ru)
        *version $id$
        *since 0.1
        */
public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        ArrayChar word = new ArrayChar("Hello");
        boolean result = word.startWith("He");
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        ArrayChar word = new ArrayChar("Hello");
        boolean result = word.startWith("Hi");
        assertThat(result, is(false));
    }

    @Test
    public void whenStartWithPrefixThenTrueTwo() {
        ArrayChar word = new ArrayChar("Job4j — it's a life!");
        boolean result = word.startWith("Job4j — it's");
        assertThat(result, is(true));
    }

    @Test
    public void whenStartWithPrefixThenFalseTwo() {
        ArrayChar word = new ArrayChar("Job4j — it's a life!");
        boolean result = word.startWith("Job4j - it's");
        assertThat(result, is(false));
    }
}