package challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FrogJumpTest {

    @Test
    void solution() {
        int X = 10;
        int Y = 85;
        int D = 30;
        int expected = 3;

        int actual = FrogJump.solution(X, Y, D);

        assertEquals(expected, actual);
    }

    @Test
    void solution2() {
        int X = 15;
        int Y = 234;
        int D = 7;
        int expected = 32;

        int actual = FrogJump.solution(X, Y, D);

        assertEquals(expected, actual);
    }
}