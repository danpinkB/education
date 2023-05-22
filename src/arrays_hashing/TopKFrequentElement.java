package src.arrays_hashing;

import java.util.*;

public class TopKFrequentElement {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] res = new int[k];
        ArrayList<Integer>[] repeats = new ArrayList[nums.length];
        for (int i = 0; i < nums.length; i++) {
            map.merge(nums[i], 1, Integer::sum);
            repeats[i] = new ArrayList<>();
        }
        for (var key:map.keySet()){
            repeats[map.get(key)-1].add(key);
        }
        for (int i = repeats.length-1; i >=0&&k>0 ; i--) {
            for (int el:repeats[i]){
                k--;
                res[k]=el;
            }
        }
        return res;
    }
}
