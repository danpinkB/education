package src.two_pointers;

import java.util.*;

public class Sum3 {
    public List<List<Integer>> threeSum(int[] nums) {
        LinkedList<List<Integer>> list = new LinkedList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(i>0&&nums[i]==nums[i-1])continue;
            int target = 0-nums[i];
            int start = i+1;
            int end = nums.length-1;
            while (start<end){
                int sum = nums[start]+nums[end];
                if(sum==target){
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[start]);
                    l.add(nums[end]);
                    list.add(l);
                    while (start<end&&nums[end]==nums[--end]);
                    while (start<end&&nums[start]==nums[++start]);
                }
                else if(sum>target)end--;
                else start++;
            }
        }
        return list.stream().toList();
    }
}
