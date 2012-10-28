package hu.esgott.euler.problem21;

public class Divisors implements Runnable {

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
	}

}
