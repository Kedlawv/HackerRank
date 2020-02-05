package challenges.practice_java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {

    @Test
    public void trueIfBalanced(){
        String stringBalanced = "([{}])";
        String stringBalanced2 = "(){}[]";

        assertTrue(BalancedBrackets.isBalanced(stringBalanced));
        assertTrue(BalancedBrackets.isBalanced(stringBalanced2));
    }

    @Test
    public void trueIfUnbalanced(){
        String stringUnBalanced = "([{})";
        String stringUnBalanced2 = "{}(";
        String stringUnBalanced3 = "(({()})))";

        assertFalse(BalancedBrackets.isBalanced(stringUnBalanced));
        assertFalse(BalancedBrackets.isBalanced(stringUnBalanced2));
        assertFalse(BalancedBrackets.isBalanced(stringUnBalanced3));
    }

}