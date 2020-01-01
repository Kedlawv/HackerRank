package challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysLeftRotationTest {

    @Test
    void rotLeftTest() {
        int numOfRot = 54;
        int[] argArr = {1, 2, 3, 4, 5};
        int[] expected = {5, 1, 2, 3, 4};

        int[] actual = ArraysLeftRotation.rotLeft(argArr, numOfRot);

        assertArrayEquals(expected, actual);
    }
}