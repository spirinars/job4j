package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

/**
 * @author SpirinArseny (spirinars@ya.ru)
 * @version $Id$
 * @since 0.1
 */
public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] input = new String[]{"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] result = arrayDuplicate.remove(input);
        String[] expect = new String[]{"Привет", "Мир", "Супер"};
        assertThat(result, arrayContainingInAnyOrder(expect));
    }
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicateTwo() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] input = new String[]{"Ку", "КУ", "КУ", "Ку", "Ку"};
        String[] result = arrayDuplicate.remove(input);
        String[] expect = new String[]{"Ку", "КУ"};
        assertThat(result, arrayContainingInAnyOrder(expect));
    }
    @Test
    public void whenNullThenNull() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] input = new String[]{};
        String[] result = arrayDuplicate.remove(input);
        String[] expect = new String[]{};
        assertThat(result, arrayContainingInAnyOrder(expect));
    }
}
