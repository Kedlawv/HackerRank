package challenges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CodeCoolTest {

    @Test
    void findUniqueWhenFirstOneUniqueThenReturnFirstOne() {
        List<Integer> inputList = Arrays.asList(1, 2, 2, 2, 2);
        Integer expected = 1;

        Integer actual = CodeCool.findUnique(inputList);

        assertEquals(expected, actual);
    }

    @Test
    void findUniqueWhenSecondUniqueThenReturnSecond() {
        List<Integer> inputList = Arrays.asList(2, 1, 2, 2, 2);
        Integer expected = 1;

        Integer actual = CodeCool.findUnique(inputList);

        assertEquals(expected, actual);
    }

    @Test
    void findUniqueWhenThirdUniqueThenReturnThird() {
        List<Integer> inputList = Arrays.asList(2, 2, 1, 2, 2);
        Integer expected = 1;

        Integer actual = CodeCool.findUnique(inputList);

        assertEquals(expected, actual);
    }

    @Test
    void findUniqueWhenLastUniqueThenReturnLast() {
        List<Integer> inputList = Arrays.asList(2, 2, 2, 2, 1);
        Integer expected = 1;

        Integer actual = CodeCool.findUnique(inputList);

        assertEquals(expected, actual);
    }

    @Test
    void findUniqueWhenListEmptyThenIllegalArgumentException() {
        List<Integer> inputList = new ArrayList<>();

        assertThrows(IllegalArgumentException.class, () -> CodeCool.findUnique(inputList));
    }

    @Test
    void findUniqueWhenListSize1ThenReturnElementAtIndex0() {
        List<Integer> inputList = Arrays.asList(1);
        Integer expected = 1;

        Integer actual = CodeCool.findUnique(inputList);

        assertEquals(expected, actual);
    }

    @Test
    void findUniqueWhenListSize2ThenReturnRandomNumberUnderIndex1or2() {
        List<Integer> inputList = Arrays.asList(2, 1);
        Integer expected = 1;

        Integer actual = CodeCool.findUnique(inputList);

        assertTrue(actual == 1 || actual == 2);
    }
}
