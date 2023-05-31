package src.stack;

import java.util.Stack;

class MinStack {
    Stack<Integer> stack;
    int min;
    public MinStack() {
        stack = new Stack<>();
        min=Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        stack.push(val);
        min = Math.min(min,val);
    }
    
    public void pop() {
        if(min == stack.pop()) {
            min = stack.size()>0?stack.get(0):Integer.MAX_VALUE;
            for (int i = 1; i < stack.size(); i++) {
                min = Math.min(min, stack.get(i));
            }
        }
    }
    
    public int top() {
        return stack.get(stack.size());
    }
    
    public int getMin() {
        return min;
    }
}