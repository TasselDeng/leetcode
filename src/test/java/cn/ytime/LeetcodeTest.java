package cn.ytime;


import cn.ytime.eleven.ContainerWithMostWater;
import cn.ytime.twenty.ValidParentheses;
import org.junit.Test;

public class LeetcodeTest {

    @Test
    public void test11(){
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int maxArea = containerWithMostWater.maxArea(arr);
        System.out.println(maxArea);
    }

    @Test
    public void test20(){
        ValidParentheses validParentheses = new ValidParentheses();
        String s = "({})";
        boolean result = validParentheses.isValid(s);
        System.out.println(result);
    }

}
