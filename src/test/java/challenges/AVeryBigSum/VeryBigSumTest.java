package challenges.AVeryBigSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeryBigSumTest {

    @Test
    void aVeryBigSum() {
        long[] inputAr = {1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L};
        long expected = 5000000015L;

        long actual = VeryBigSum.aVeryBigSum(inputAr);

        assertEquals(expected,actual);
    }
}
