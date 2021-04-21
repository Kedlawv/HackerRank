package challenges.SimpleArraySum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleArraySumTest {

    @Test
    void simpleArraySum() {
        int[] inputArr = {1,2,3};
        int expected = 6;

        SimpleArraySum simpleArraySum = new SimpleArraySum();
        int actual = simpleArraySum.simpleArraySum(inputArr);

        assertEquals(expected, actual, "Sum of the integers is incorrect");

    }
}
