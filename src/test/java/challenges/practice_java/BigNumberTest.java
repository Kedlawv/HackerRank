package challenges.practice_java;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class BigNumberTest {

    @ParameterizedTest
    @ValueSource(strings = {"2", "3", "5", "7", "13"})
    void primalityTestTestTrueForPrime(String prime) {
        assertTrue(BigNumber.primalityTest(prime));
    }

    @ParameterizedTest
    @ValueSource(strings = {"4", "6", "8", "9", "14"})
    void primalityTestTestTrueForNotPrime(String notPrime) {
        assertFalse(BigNumber.primalityTest(notPrime));
    }

    @Test
    public void addAndMultiplyBigIntTest() {
        String a = "12345";
        String b = "67";

        BigInteger[] expected = {new BigInteger("12412"), new BigInteger("827115")};
        BigInteger[] actual = BigNumber.addAndMultiplyBigInt(a, b);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void sortBigDecTest(){
        String[] input = {"-100","50","0","56.6","90","0.12",".12","02.34","000.000"};
        String[] expected = {"90","56.6","50","02.34","0.12",".12","0","000.000","-100"};

        String[] actual = BigNumber.sortBigDec(input);

        assertArrayEquals(expected,actual);
    }

    @Test
    public void sortBigDecAnonTest(){
        String[] input = {"-100","50","0","56.6","90","0.12",".12","02.34","000.000"};
        String[] expected = {"90","56.6","50","02.34","0.12",".12","0","000.000","-100"};

        String[] actual = BigNumber.sortBigDecAnon(input);

        assertArrayEquals(expected,actual);
    }

}