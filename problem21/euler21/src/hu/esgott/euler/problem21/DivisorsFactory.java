package hu.esgott.euler.problem21;

import java.util.Map;

public class DivisorsFactory {

	public Divisors create(int startNumber, int endNumber,
			Map<Integer, Integer> store) {
		return new Divisors(startNumber, endNumber, store);
	}

}
