package src.arrays_hashing;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int c = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num: nums) set.add(num);
        for (int num: set) {
            if(set.contains(num-1))continue;
            int count = 1;
            int x = num;
            while (set.contains(x+1)){
                x++;
                count++;
            }
            c = Math.max(c,count);
        }
        return c;
    }
}
