package challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SmallestPositiveTest {

    @Test
    void solutionTest() {
        int[] input = {1, 3, 6, 4, 1, 2};
        int expected = 5;

        int actual = SmallestPositive.solution(input);

        assertEquals(expected, actual);
    }

    @Test
    void solutionTest2() {
        int[] input = {0, 1, 3, 6, 4, 1, 2, -1, -5};
        int expected = 5;

        int actual = SmallestPositive.solution(input);

        assertEquals(expected, actual);
    }

    @Test
    void solutionTest3() {
        int[] input = {0, 1, 3, 6, 5, 1, 2, -1, -5};
        int expected = 4;

        int actual = SmallestPositive.solution(input);

        assertEquals(expected, actual);
    }
}