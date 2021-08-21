package challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayRotationTest {

    @Test
    void rotateLeftOnceTest() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {4, 1, 2, 3};

        int[] actual = ArrayRotation.rotateLeftOnce(input);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void arrayRotationOf2() {
        int[] input = {1,2,3,4};
        int numberOfRotations = 2;
        int[] expected = {3,4,1,2};

        int[] actual = ArrayRotation.solution(input, numberOfRotations);

        assertArrayEquals(expected,actual);
    }

    @Test
    public void arrayRotationOf6() {
        int[] input = {1,2,3,4};
        int numberOfRotations = 6;
        int[] expected = {3,4,1,2};

        int[] actual = ArrayRotation.solution(input, numberOfRotations);

        assertArrayEquals(expected,actual);
    }

    @Test
    public void arrayRotationOf0() {
        int[] input = {1,2,3,4};
        int numberOfRotations = 0;
        int[] expected = {1,2,3,4};

        int[] actual = ArrayRotation.solution(input, numberOfRotations);

        assertArrayEquals(expected,actual);
    }

    @Test
    public void solutionNestedRotationOf2() {
        int[] input = {1,2,3,4};
        int numberOfRotations = 2;
        int[] expected = {3,4,1,2};

        int[] actual = ArrayRotation.solutionNested(input, numberOfRotations);

        assertArrayEquals(expected,actual);
    }
}