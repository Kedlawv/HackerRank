package challenges;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class HourGlass2DArraySolverTest {

    private int[][] arr = new int[6][6];

    @BeforeAll
    private void initTestArray() {
        arr[0] = new int[]{1, 1, 1, 0, 0, 0};
        arr[1] = new int[]{0, 1, 0, 0, 0, 0};
        arr[2] = new int[]{1, 1, 1, 0, 0, 0};
        arr[3] = new int[]{0, 0, 2, 4, 4, 0};
        arr[4] = new int[]{0, 0, 0, 2, 0, 0};
        arr[5] = new int[]{0, 0, 1, 2, 4, 0};
    }

    @Test
    void hourglassMaxSumTest() {

        int expected = 19;


        int actual = HourGlass2DArraySolver.hourglassMaxSum(arr);


        assertEquals(expected, actual);
    }

    @Test
    void getHourGlassSumAtIndexTest() {
        int expected = 7;

        int actual = HourGlass2DArraySolver.getHourGlassSumAtIndex(0, 0, arr);

        assertEquals(expected, actual);
    }
}






