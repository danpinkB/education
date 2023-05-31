package src.stack;

import java.util.List;
import java.util.Stack;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        Stack<String> variants = new Stack<>();
        calculateParenthesis(0,0,n,"",variants);
        return variants;
    }
    public void calculateParenthesis(int opened, int closed, int n,String s, Stack<String> stack){
        if(opened == n && closed==n){
            stack.push(s);
            return;
        }
        if (opened < n) {
            calculateParenthesis(opened+1,closed,n,s+"(",stack);
        }
        if (closed < opened) {
            calculateParenthesis(opened,closed+1,n,s+")",stack);
        }

    }
}
