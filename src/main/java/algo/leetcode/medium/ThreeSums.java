package algo.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 *
 * @author: lyc
 * @date: 2020/1/8 10:31
 * @since: 1.0.0
 */
public class ThreeSums {

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> rList = new ArrayList<>(nums.length);
		if (nums == null || nums.length < 3) return rList;
		Arrays.sort(nums);
		int length = nums.length;
		for (int i = 0; i < length - 2; i++) {
			if (nums[i] > 0) break;
			if (i > 0 && nums[i] == nums[i - 1]) continue;
			int left = i + 1;
			int right = length - 1;
			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if (sum == 0) {
					rList.add(Arrays.asList(nums[i], nums[left], nums[right]));
					while (left < right && nums[left] == nums[++left]);
					while (left < right && nums[right] == nums[--right]);
				} else if (sum > 0) right--;
				else left++;
			}
		}
		return rList;
	}
}
