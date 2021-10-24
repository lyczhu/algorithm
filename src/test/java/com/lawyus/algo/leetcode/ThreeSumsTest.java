package com.lawyus.algo.leetcode;

import com.lawyus.algo.leetcode.medium.ThreeSums;
import org.junit.jupiter.api.Test;

class ThreeSumsTest {

	@Test
	void threeSum() {
		ThreeSums ts = new ThreeSums();
		int[] nums = {-1, 0, 1, 2, -1, -4};
		System.out.println(ts.threeSum(nums));
	}
}