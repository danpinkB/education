package src.stack;

import java.util.*;
import java.util.function.Function;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numbers = new Stack<>();
        Integer firstArg;
        for (String token : tokens) {
            switch (token) {
                case "+":
                    numbers.push(numbers.pop() + numbers.pop());
                    break;
                case "-":
                    firstArg = numbers.pop();
                    numbers.push(numbers.pop()-firstArg);
                    break;
                case "*":
                    numbers.push(numbers.pop() * numbers.pop());
                    break;
                case "/":
                    firstArg = numbers.pop();
                    numbers.push(numbers.pop() / firstArg);
                    break;
                default:
                    numbers.push(Integer.parseInt(token));
            }
        }
        return numbers.pop();
    }
}
