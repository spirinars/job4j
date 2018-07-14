package ru.job4j.loop;

import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 *
 * @author Spirin Arseny (mailto:spirinars@ya.ru)
 * @version $Id$
 * @since 0.1
 */
public class PaintTest {
    @Test
    public void whenPyramid4() {
        Paint paint = new Paint();
        String rst = paint.pyramid(4);
        System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("   ^   ")
                                .add("  ^^^  ")
                                .add(" ^^^^^ ")
                                .add("^^^^^^^")
                                .toString()
                )
        );
    }
    @Test
    public void whenPyramid5() {
        Paint paint = new Paint();
        String rst = paint.pyramid(5);
        System.out.println(rst);
        assertThat(rst,
                is(
                new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                        .add("    ^    ")
                        .add("   ^^^   ")
                        .add("  ^^^^^  ")
                        .add(" ^^^^^^^ ")
                        .add("^^^^^^^^^")
                        .toString()
                )
        );
    }
}
