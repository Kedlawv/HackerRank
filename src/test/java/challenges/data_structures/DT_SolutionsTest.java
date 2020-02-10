package challenges.data_structures;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class DT_SolutionsTest {

    static int[] testValues;

    @BeforeAll
    public static void testValuesFromFile() {
        try (Scanner scanner = new Scanner(
                new File("I:/Java_Learning_Repo/hackerrank/src/main/resources/DT_Solutions_SubArrayNegSum"))) {

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

    @Test
    public void filePathTest(){
        File file = new File("src\\main\\resources\\DT_Solutions_Arrays");

        System.out.println(file.getAbsolutePath());
        System.out.println(file.toString());
        System.out.println(file.exists());
        assertTrue(file.exists());
    }

    @Test
    public void csvToListTest(){
        File file = new File("src\\main\\resources\\DT_Solutions_Arrays");

        List<List<Integer>> expected = Arrays.asList(Arrays.asList(7,43,35,26,34,78,99,70),
                Arrays.asList(3,71,11,16),Arrays.asList(8,70,19,42,30,84,20,57,45),Arrays.asList(),
                Arrays.asList(1,20),Arrays.asList(),Arrays.asList(),Arrays.asList());

        List<List<Integer>> actual = DT_Solutions.csvToList(file);

        assertTrue(expected.equals(actual));
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/DT_Solutions_Arrays_find",delimiter = ' ')
    public void findIn2dListTest(int a, int b, int expected){
        File file = new File("src\\main\\resources\\DT_Solutions_Arrays");
        List<List<Integer>> listInput = DT_Solutions.csvToList(file);

        int actual = DT_Solutions.findIn2dList(a,b,listInput);

        assertEquals(expected, actual);
    }


}