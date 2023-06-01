package src;



import org.junit.Assert;
import org.junit.Test;
import src.stack.DailyTemperatures;
import src.stack.EvaluateReversePolishNotation;
import src.stack.GenerateParentheses;

import java.util.Arrays;

public class StackTests {

    @Test
    public void testParenthesesGeneration(){
        GenerateParentheses generateParentheses = new GenerateParentheses();
        String[] validResult = new String[]{"((()))", "(()())", "(())()", "()(())", "()()()"};
        Assert.assertArrayEquals(generateParentheses.generateParenthesis(3).toArray(), validResult);
    }

    @Test
    public void testEvaluateReversePolishNotation(){
        EvaluateReversePolishNotation ev = new EvaluateReversePolishNotation();
        Assert.assertEquals(ev.evalRPN(new String[]{"2","1","+","3","*"}),9);
        Assert.assertEquals(ev.evalRPN(new String[]{"4","13","5","/","+"}),6);
    }
    @Test
    public void  testDailyTemperatures(){
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        System.out.println(Arrays.toString(dailyTemperatures.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }
}
