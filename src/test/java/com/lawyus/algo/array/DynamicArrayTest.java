package com.lawyus.algo.array;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class DynamicArrayTest {

	DynamicArray da = new DynamicArray(4);

	@BeforeAll
	static void gen() {

	}

	@Test
	void add() {
		da.add(1);
		da.add(2);
		da.add(3);
		da.add(4);
		da.add(5);
		da.add(6);
		da.add(7);
		da.add(8);
		da.add(9);
		da.add(10);
		System.out.println(da);
	}

	@Test
	void get() {
		add();
		System.out.println(da.get(3));
	}

	@Test
	void remove() {
		add();
		da.remove(2);
		System.out.println(da);
	}
}