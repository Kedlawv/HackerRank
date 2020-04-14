package challenges.practice_java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DequeChallangeTest {

    @Test
    void getMaxUniqueOfSubArrayTest() {
        int[] input = {5, 3, 5, 2, 3, 2};
        int expected = 3;

        int actual = new DequeChallange().getMaxUniqueOfSubArray(input, 3);

        assertEquals(expected,actual);
    }
}