package algo.letcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumsTest {

	@Test
	void threeSum() {
		ThreeSums ts = new ThreeSums();
		int[] nums = {-1, 0, 1, 2, -1, -4};
		System.out.println(ts.threeSum(nums));
	}
}