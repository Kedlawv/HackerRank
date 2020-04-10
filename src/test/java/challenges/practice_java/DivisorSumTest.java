package challenges.practice_java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisorSumTest {

    @Test
    public void divisorSumTest1(){
        int input = 6;
        int expected = 12;

        int result = new DivisorSum().divisorSum(input);

        assertEquals(expected,result);
    }

    @Test
    public void divisorSumTest2(){
        int input = 20;
        int expected = 42;

        int result = new DivisorSum().divisorSum(input);

        assertEquals(expected,result);
    }

    @Test
    public void divisorSumModuloTest1(){
        int input = 6;
        int expected = 12;

        int result = new DivisorSum().divisorSumModulo(input);

        assertEquals(expected,result);
    }

    @Test
    public void divisorSumModuloTest2(){
        int input = 20;
        int expected = 42;

        int result = new DivisorSum().divisorSumModulo(input);

        assertEquals(expected,result);
    }



}