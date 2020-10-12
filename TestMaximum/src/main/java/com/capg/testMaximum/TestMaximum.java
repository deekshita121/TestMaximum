package com.capg.testMaximum;

import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestMaximum<T extends Comparable<T>> {
	List<T> inputs;
	private static final Logger log = LogManager.getLogger(TestMaximum.class);
	T x, y, z;

	public TestMaximum(T... inputs) {
		this.inputs = Arrays.asList(inputs);
	}

	public T toMax() {
		T max = TestMaximum.toMax(inputs);
		printMax(inputs, max);
		return max;

	}

	public static <T extends Comparable<T>> T toMax(List<T> inputs) {

		T max;
		List<T> sortedList = new ArrayList<>(inputs);
		Collections.sort(sortedList);
		max = sortedList.get(sortedList.size() - 1);
		return max;
	}

	public static <T> void printMax(List<T> inputs, T max) {
		log.info("Maximum among the list is " + max);
	}

	public static void main(String[] args) {

		Integer a = 40, b = 20, c = 55, d = 2, e = 43;
		new TestMaximum<Integer>(a, b, c, d, e).toMax();
		String m = "apple", n = "orange", o = "banana", p = "grape", q = "mango";
		new TestMaximum<String>(m, n, o, p, q).toMax();

	}
}
