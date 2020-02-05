package challenges.practice_java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MyCalculatorTest {


    @Test
    public void correctCalculatePower() throws Exception {
        int n = 5;
        int p = 2;
        long expected = 25;

        long actual = MyCalculator.power(n, p);

        assertEquals(expected, actual);
    }

    @Test
    public void throwsExceptionOnZeroOrNegativeArguments() throws Exception {
        assertThrows(Exception.class, () -> MyCalculator.power(0, 0));
        assertThrows(Exception.class, () -> MyCalculator.power(-1, -1));
    }
}