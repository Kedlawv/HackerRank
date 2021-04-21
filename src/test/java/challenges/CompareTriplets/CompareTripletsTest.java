package challenges.CompareTriplets;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CompareTripletsTest {

    @Test
    void compareTripletsForTest1() {
        List<Integer> inputAList = new ArrayList<Integer>(Arrays.asList(5,6,7));
        List<Integer> inputBList = new ArrayList<Integer>(Arrays.asList(3,6,10));
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1,1));

        List<Integer> actual = CompareTriplets.compareTriplets(inputAList, inputBList);

        assertEquals(expected,actual);

    }

    @Test
    void compareTripletsForTest2() {
        List<Integer> inputAList = new ArrayList<Integer>(Arrays.asList(17,28,30));
        List<Integer> inputBList = new ArrayList<Integer>(Arrays.asList(99,16,8));
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(2,1));

        List<Integer> actual = CompareTriplets.compareTriplets(inputAList, inputBList);

        assertEquals(expected,actual);

    }

    @Test
    void compareTripletsIteratorTest1() {
        List<Integer> inputAList = new ArrayList<Integer>(Arrays.asList(5,6,7));
        List<Integer> inputBList = new ArrayList<Integer>(Arrays.asList(3,6,10));
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1,1));

        List<Integer> actual = CompareTriplets.compareTripletsIterator(inputAList, inputBList);

        assertEquals(expected,actual);

    }

    @Test
    void compareTripletsIteratorTest2() {
        List<Integer> inputAList = new ArrayList<Integer>(Arrays.asList(17,28,30));
        List<Integer> inputBList = new ArrayList<Integer>(Arrays.asList(99,16,8));
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(2,1));

        List<Integer> actual = CompareTriplets.compareTripletsIterator(inputAList, inputBList);

        assertEquals(expected,actual);

    }
}
