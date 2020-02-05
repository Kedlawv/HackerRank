package challenges.practice_java;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {

    public static boolean isBalanced(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
                continue;
            }
            if (ch == ')' || ch == ']' || ch == '}') {
                if(stack.isEmpty()){
                    return false;
                }
                if (isMatchingBracketPair(stack.peek(), ch)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }

    public static boolean isMatchingBracketPair(char first, char second) {
        if (first == '(' && second == ')') {
            return true;
        } else if (first == '[' && second == ']') {
            return true;
        } else if (first == '{' && second == '}') {
            return true;
        } else {
            return false;
        }
    }
}
