package src.stack;

import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] days = new int[len];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty()&&temperatures[stack.peek()]<temperatures[i]){
                int prevDay = stack.pop();
                days[prevDay] = i-prevDay;
            }
            stack.add(i);
        }
        return days;
    }
}
