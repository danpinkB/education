package src.stack;

import java.util.Arrays;
import java.util.Stack;

public class LargestReq {
    public int largestRectangleArea(int[] heights) {
        if (heights.length==1)return heights[0];
        int N = heights.length;
        int maxRange = 0;
        int[] stack = new int[N];
        Arrays.fill(stack,-1);
        int pointer = -1;
        int counter=0;
        for (int i=0; i<N;i++) {
            counter=0;
            while (pointer>-1 && stack[pointer] > heights[i]) maxRange = Math.max(maxRange,++counter*stack[pointer--]);
            while (counter-->=0) stack[++pointer]=heights[i];
        }
        counter=0;
        while (pointer>=0){
            maxRange = Math.max(maxRange, ++counter*stack[pointer--]);
        };
        return maxRange;
    }
}