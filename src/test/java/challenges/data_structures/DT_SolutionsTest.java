package challenges.data_structures;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DT_SolutionsTest {

    static int[] testValues;

    @BeforeAll
    public static void testValuesFromFile() {
        try (Scanner scanner = new Scanner(new File("I:/Java_Learning_Repo/hackerrank/src/main/resources/DT_Solutions_SubArrayNegSum"))) {

            int numOfTestValues = scanner.nextInt();
            testValues = new int[numOfTestValues];
            for (int i = 0; i < numOfTestValues; i++) {
                testValues[i] = scanner.nextInt();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void subarrayNegativeSumTest() {
        int[] input = {1, -2, 4, -5, 1};
        int expected = 9;

        int actual = DT_Solutions.subarrayNegativeSum(input);

        assertEquals(expected, actual);
    }

    @Test
    public void subarrayNegativeSumTest3() {

        int expected = 953;

        int actual = DT_Solutions.subarrayNegativeSum(testValues);

        assertEquals(expected, actual);
    }

    @Test
    public void getSubarraysOfLengthOnesTest() {
        int[] input = {3, 3, 3, 3, 3};
        int[][] expected = {{3}, {3}, {3}, {3}, {3}};

        int[][] actual = DT_Solutions.getSubarraysOfLength(1, input);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void getSubarraysOfLengthTwosTest() {
        int[] input = {1, 2, 3, 4, 5};
        int[][] expected = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};

        int[][] actual = DT_Solutions.getSubarraysOfLength(2, input);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void getSubarraysOfLengthThreesTest() {
        int[] input = {1, 2, 3, 4, 5};
        int[][] expected = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};

        int[][] actual = DT_Solutions.getSubarraysOfLength(3, input);

        assertArrayEquals(expected, actual);
    }


}