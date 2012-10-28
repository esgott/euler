package hu.esgott.euler.problem21;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class DivisorsTest {

	@Mock
	private Map<Integer, Integer> mockStore;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

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

	@Test
	public void containerUsedProperly() {
		Divisors divisors = new Divisors(1, 10, mockStore);
		divisors.run();
		verify(mockStore).put(1, 0);
		verify(mockStore).put(2, 1);
		verify(mockStore).put(3, 1);
		verify(mockStore).put(4, 3);
		verify(mockStore).put(5, 1);
		verify(mockStore).put(6, 6);
		verify(mockStore).put(7, 1);
		verify(mockStore).put(8, 7);
		verify(mockStore).put(9, 4);
		verify(mockStore).put(10, 8);
	}

}
