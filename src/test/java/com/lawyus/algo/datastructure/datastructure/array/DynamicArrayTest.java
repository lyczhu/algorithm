<<<<<<< HEAD:src/test/java/com/lawyus/algo/array/DynamicArrayTest.java
package com.lawyus.algo.array;
=======
package algo.datastructure.array;
>>>>>>> 636cfc25a8ab7b070178c8211c92a1c0d52c03e0:src/test/java/com/lawyus/algo/datastructure/datastructure/array/DynamicArrayTest.java

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