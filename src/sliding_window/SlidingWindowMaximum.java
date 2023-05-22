package src.sliding_window;

import java.util.*;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0) return new int[0];
        int n = nums.length;
        int [] arr = new int[n-k+1];
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0,l=0; i < nums.length; i++) {
            while (!queue.isEmpty() && queue.peekFirst() < i - k + 1) {
                queue.pollFirst();
            }
            while (!queue.isEmpty() && nums[queue.peekLast()] < nums[i]) {
                queue.pollLast();
            }
            queue.offerLast(i);

            if (i >= k - 1) {
                arr[l++] = nums[queue.peekFirst()];
            }
        }
        return arr;
    }
}
