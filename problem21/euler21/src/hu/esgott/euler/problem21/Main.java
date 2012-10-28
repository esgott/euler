package hu.esgott.euler.problem21;

import java.util.Map;

public class Main {

	public static void main(String[] args) {
		DivisorCounter counter = new DivisorCounter(new DivisorsFactory());

		try {
			counter.calculate();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Map<Integer, Integer> store = counter.getStore();
		int sum = 0;
		// for "a" and "b", see euler problem 21
		for (int a = 1; a <= 10000; a++) {
			int b = store.get(a);
			Integer db = store.get(b);
			if (db != null) {
				if (a != b && db.equals(a)) {
					sum += a;
					System.out.println(a);
				}
			}
		}

		System.out.println("Sum=" + sum);
	}

}
