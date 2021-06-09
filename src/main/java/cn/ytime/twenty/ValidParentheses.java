package cn.ytime.twenty;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *
 * @author y-time
 * @version 1.0
 * @date 2021-06-07 20:57
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        // 字符串长度不是偶数，肯定不满足条件
        char[] chars = s.toCharArray();
        int length = chars.length;
        if ((length & 1) == 1) {
            return false;
        }
        Map<Character, Character> bracketMap = new HashMap<Character, Character>() {{
            put('(', ')');
            put('{', '}');
            put('[', ']');
        }};
        // 循环遇到左括号，放入栈中
        // 遇到右括号，根据栈先进后出，取出最后放入的左括号，根据哈希表存储的括号判断是否同类型
        // 同类型从栈移除取出的左括号并继续，不同类型返回false
        // 最后栈是空的则为满足条件
        Deque<Character> stack = new LinkedList<>();
        for (char c : chars) {
            if (bracketMap.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || bracketMap.get(stack.peek()) != c) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
