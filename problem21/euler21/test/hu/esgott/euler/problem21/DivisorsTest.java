package hu.esgott.euler.problem21;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisorsTest {

	@Test
	public void sumFor220() {
		int answer = Divisors.getSumOfDivisors(220);
		assertEquals(284, answer);
	}
	
	@Test
	public void sumFor284() {
		int answer = Divisors.getSumOfDivisors(284);
		assertEquals(220, answer);
	}

}
