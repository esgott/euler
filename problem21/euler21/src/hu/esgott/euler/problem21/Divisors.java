package hu.esgott.euler.problem21;

import java.util.Map;

public class Divisors implements Runnable {

	private int from;
	private int until;
	private Map<Integer, Integer> numberToSum;

	public Divisors(int startNumber, int endNumber, Map<Integer, Integer> store) {
		from = startNumber;
		until = endNumber;
		numberToSum = store;
	}

	public static int getSumOfDivisors(int number) {
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

	@Override
	public void run() {
		for (int i = from; i <= until; i++) {
			int sum = getSumOfDivisors(i);
			numberToSum.put(i, sum);
		}
	}

}
