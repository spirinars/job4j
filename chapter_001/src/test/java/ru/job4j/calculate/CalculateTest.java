package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
*Test.
*
*@author Spirin Arseny (mailto: spirinars@ya.ru
*version $id$
*since 0.1
*/
public class CalculateTest {
/**
*Test ecgo.
*/@Test
public void whenTakeNamaThenTreeEchoPlusName() {
	String input = "Spirin Arseny";
	String expect = "Echo, echo, echo : Spirin Arseny";
	Calculate calc = new Calculate();
	String result = calc.echo(input);
	assertThat(result, is(expect));
	}
	
}