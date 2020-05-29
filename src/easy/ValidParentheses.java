package easy;

import java.util.Scanner;

/**
 * @Author someone
 * @Classname ValidParentheses
 * @Description This Class is for excise
 * @Date 2020/5/29 上午10:59
 * @Created by someone
 * @Version 1.0
 */
public class ValidParentheses {
    public static boolean isValid(String s) {
        char[] stack = new char[s.length() + 1];
        int top = 1;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{' ) {
               stack[top++]=c;
            } else if (c == ')' && stack[--top] != '(') {
                return false;
            } else if (c == ']' && stack[--top] != '[') {
                return false;
            } else if(c == '}' && stack[--top] != '{') {
                return false;
            }
        }
        return top == 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        System.out.println(isValid(line));
    }
}
