package challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BirthdayCakeCandlesTest {

    @Test
    void birthdayCakeCandles() {
        List<Integer> inputArr = Arrays.asList(3, 2, 1, 3);
        int expected = 2;

        int actual = BirthdayCakeCandles.birthdayCakeCandles(inputArr);

        assertEquals(expected, actual);
    }
}
