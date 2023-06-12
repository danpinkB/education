package src.stack;

import java.util.Stack;

public class LargestReq {
    public int largestRectangleArea(int[] heights) {
        if (heights.length==1)return heights[0];
        int maxRange = 0;
        Stack<Integer> rectangles = new Stack<>();
        int counter;
        int min = Integer.MAX_VALUE;
        for (int i=0; i<heights.length;i++){
            int height = heights[i];
            counter = 0;
            min = Integer.MAX_VALUE;
            while (!rectangles.isEmpty()&&rectangles.peek()>height){
                counter++;
                min = Math.min(rectangles.pop(),min);
                maxRange = Math.max(maxRange,min*counter);
            }
            while (counter-->0)
                rectangles.push(min);
            rectangles.push(height);
        }
        counter = 0;
        while (!rectangles.isEmpty()){
            min = Math.min(min,rectangles.pop());
            counter++;
            maxRange = Math.max(min*counter,maxRange);
        }
        return maxRange;
    }
}