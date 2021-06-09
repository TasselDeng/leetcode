package cn.ytime;


import cn.ytime.twenty.ValidParentheses;
import org.junit.Test;

public class LeetcodeTest {

    @Test
    public void test20(){
        ValidParentheses validParentheses = new ValidParentheses();
        String s = "({})";
        boolean result = validParentheses.isValid(s);
        System.out.println(result);
    }
}
