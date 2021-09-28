package challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CodeCoolTest {

    @Test
    void findUniqueWhenFirstOneUniqueThenReturnFirstOne() {
        List<Integer> inputList = Arrays.asList(1,2,2,2,2);
        Integer expected = 1;

        Integer actual = CodeCool.findUnique(inputList);

        assertEquals(expected, actual);
    }

    @Test
    void findUniqueWhenSecondUniqueThenReturnSecond() {
        List<Integer> inputList = Arrays.asList(2,1,2,2,2);
        Integer expected = 1;

        Integer actual = CodeCool.findUnique(inputList);

        assertEquals(expected, actual);
    }

    @Test
    void findUniqueWhenThirdUniqueThenReturnThird() {
        List<Integer> inputList = Arrays.asList(2,2,1,2,2);
        Integer expected = 1;

        Integer actual = CodeCool.findUnique(inputList);

        assertEquals(expected, actual);
    }

    @Test
    void findUniqueWhenLastUniqueThenReturnLast() {
        List<Integer> inputList = Arrays.asList(2,2,2,2,1);
        Integer expected = 1;

        Integer actual = CodeCool.findUnique(inputList);

        assertEquals(expected, actual);
    }
}
