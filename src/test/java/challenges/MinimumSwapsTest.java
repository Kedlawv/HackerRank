package challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSwapsTest {

    @Test
    public void test1() {
        int[] input = {4, 3, 1, 2};
        int expected = 3;

        int actual = MinimumSwaps.minimumSwaps(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        int[] input = {2, 3, 4, 1, 5};
        int expected = 3;

        int actual = MinimumSwaps.minimumSwaps(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        int[] input = {1, 3, 5, 2, 4, 6, 7};
        int expected = 3;

        int actual = MinimumSwaps.minimumSwaps(input);

        assertEquals(expected, actual);
    }

}
