package src;

import src.stack.EvaluateReversePolishNotation;

public class Main {
    public static void main(String[] args){
        System.out.println(13/5);
        EvaluateReversePolishNotation ev = new EvaluateReversePolishNotation();
        System.out.println(ev.evalRPN(new String[]{"2","1","+","3","*"}));
        System.out.println(ev.evalRPN(new String[]{"4","13","5","/","+"}));
    }
}
