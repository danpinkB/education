package src;



import org.junit.Assert;
import org.junit.Test;
import src.stack.EvaluateReversePolishNotation;
import src.stack.GenerateParentheses;

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
}
