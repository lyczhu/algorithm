package algo.leetcode.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {

    @Test
    void majorityElement() {
        MajorityElement me = new MajorityElement();
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(me.sort(nums));
    }

    @Test
    void boyerMooerVote() {
        MajorityElement me = new MajorityElement();
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(me.boyerMooerVote2(nums));
    }

}