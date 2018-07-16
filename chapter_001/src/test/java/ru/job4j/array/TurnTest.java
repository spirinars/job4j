package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.turn(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {1, 3, 2, 5, 4};
        int[] result = turner.turn(input);
        int[] expect = new int[] {4, 5, 2, 3, 1};
        assertThat(result, is(expect));
    }
    @Test
    public void whenTurnArrayWithOneAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {1};
        int[] result = turner.turn(input);
        int[] expect = new int[] {1};
        assertThat(result, is(expect));
    }
    @Test
    public void whenTurnArrayWithManyAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {1, 165, 178, 96, 1000, 89, 16, 78, 98, 69, 36};
        int[] result = turner.turn(input);
        int[] expect = new int[] {36, 69, 98, 78, 16, 89, 1000, 96, 178, 165, 1};
        assertThat(result, is(expect));
    }
    @Test
    public void whenTurnArrayWithOutAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {};
        int[] result = turner.turn(input);
        int[] expect = new int[] {};
        assertThat(result, is(expect));
    }
}