<<<<<<< HEAD:src/main/java/com/lawyus/algo/array/DynamicArray.java
package com.lawyus.algo.array;
=======
package algo.datastructure.array;
>>>>>>> 636cfc25a8ab7b070178c8211c92a1c0d52c03e0:src/main/java/algo/datastructure/array/DynamicArray.java

import lombok.Data;

/**
 * 动态扩容数组
 *
 * @author: lyc
 * @date: 2020/1/7 10:52
 * @since: 1.0.0
 */
@Data
public class DynamicArray {

	private int index = 0;

	private int[] data;

	private int capacity = 16;

	public DynamicArray() {
		data = new int[capacity];
	}

	public DynamicArray(int capacity) {
		this.capacity = capacity;
		data = new int[capacity];
	}

	public boolean add(int value) {
		if (this.index >= capacity) {
			capacity *= 2;
			int[] newData = new int[capacity];
			for (int i = 0; i < data.length; i++) {
				newData[i] = data[i];
			}
			data = newData;
			newData = null;
		}
		data[this.index++] = value;
		return true;
	}

	public int get(int index) {
		if (index < 0 || index == this.index) {
			throw new IndexOutOfBoundsException("out of bound");
		}
		return data[index];
	}

	public boolean remove(int index) {
		if (index < 0 || index > this.index) {
			throw new IndexOutOfBoundsException("out of bound");
		}
		if (index < this.index) {
			data[index] = data[index + 1];
		}
		this.index--;
		return true;
	}
}
