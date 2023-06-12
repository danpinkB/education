package src;



import org.junit.Assert;
import org.junit.Test;
import src.stack.*;

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
    public void testDailyTemperatures(){
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        System.out.println(Arrays.toString(dailyTemperatures.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }

    @Test
    public void carFleet(){
        CarFleet fleet = new CarFleet();
        Assert.assertEquals(fleet.carFleet(12, new int[]{10,8,0,5,3},new int[]{2,4,1,1,3}),3);
        Assert.assertEquals(fleet.carFleet(10, new int[]{6,8},new int[]{3,2}),2);
    }

    @Test
    public void largestReqTest(){
        LargestReq largestReq = new LargestReq();
        Assert.assertEquals(largestReq.largestRectangleArea(new int[]{2,1,5,6,2,3}),10);
    }
}
