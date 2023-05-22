package src.arrays_hashing;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> inds = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(inds.containsKey(target-nums[i]))return new int[]{inds.get(target-nums[i]),i};
            inds.put(nums[i],i);
        }
        return new int[]{};
    }
}
