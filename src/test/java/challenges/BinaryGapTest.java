package challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryGapTest {

    @Test
    void solution() {
        int input = 1041;
        int expected = 5;

        int actual = BinaryGap.solution(input);

        assertEquals(expected, actual);
    }
}