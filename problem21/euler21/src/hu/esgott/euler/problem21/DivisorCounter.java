package hu.esgott.euler.problem21;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DivisorCounter {

	private Map<Integer, Integer> store;
	private Thread[] threads;

	public DivisorCounter(DivisorsFactory divisorsFactory) {
		store = Collections.synchronizedMap(new HashMap<Integer, Integer>());

		threads = new Thread[5];
		for (int i = 0; i < 5; i++) {
			int from = (i * 2000) + 1;
			int until = (i * 2000) + 2000;
			Divisors divisors = divisorsFactory.create(from, until, store);
			threads[i] = new Thread(divisors);
		}
	}

	public void calculate() throws InterruptedException {
		for (Thread thread : threads) {
			thread.start();
		}

		for (Thread thread : threads) {
			thread.join();
		}
	}

	public Map<Integer, Integer> getStore() {
		return store;
	}

}
