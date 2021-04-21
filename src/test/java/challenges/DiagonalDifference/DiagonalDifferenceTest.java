package challenges.DiagonalDifference;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DiagonalDifferenceTest {

    @Test
    void diagonalDifference() {
        List<List<Integer>> inputMatrix = new ArrayList<>();
        inputMatrix.add(new ArrayList<>(Arrays.asList(11,2,4)));
        inputMatrix.add(new ArrayList<>(Arrays.asList(4,5,6)));
        inputMatrix.add(new ArrayList<>(Arrays.asList(10,8,-12)));

        int expected = 15;
        int actual = DiagonalDifference.diagonalDifference(inputMatrix);

        assertEquals(expected,actual);
    }
}
