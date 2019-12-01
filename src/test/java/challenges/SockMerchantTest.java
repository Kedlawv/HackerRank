package challenges;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SockMerchantTest {
    SockMerchant sm;


    @BeforeAll
    public void getSockMerchant() {
        sm = new SockMerchant();
    }

    @Test
    void sockMerchantTest1() {
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int n = 9;
        int expectedNumberOfPairs = 3;

        int numberOfPairs = sm.sockMerchantSolution(n, ar);

        assertEquals(expectedNumberOfPairs, numberOfPairs);

    }

    @Test
    void sockMerchantTest2() {
        int[] ar = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
        int n = 10;
        int expectedNumberOfPairs = 4;

        int numberOfPairs = sm.sockMerchantSolution(n, ar);

        assertEquals(expectedNumberOfPairs, numberOfPairs);
    }

    @Test
    void sockMerchantTest1Stream() {
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int n = 9;
        int expectedNumberOfPairs = 3;

        int numberOfPairs = sm.sockMerchantSolutionStream(n, ar);

        assertEquals(expectedNumberOfPairs, numberOfPairs);

    }

    @Test
    void sockMerchantTest2Stream() {
        int[] ar = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
        int n = 10;
        int expectedNumberOfPairs = 4;

        int numberOfPairs = sm.sockMerchantSolutionStream(n, ar);

        assertEquals(expectedNumberOfPairs, numberOfPairs);
    }


}