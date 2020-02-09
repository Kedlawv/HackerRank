package challenges.practice_java;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class BigNumberTest {

    @ParameterizedTest
    @ValueSource(strings = {"2","3","5","7","13"})
    void primalityTestTestTrueForPrime(String prime) {
        assertTrue(BigNumber.primalityTest(prime));
    }

    @ParameterizedTest
    @ValueSource(strings = {"4","6","8","9","14"})
    void primalityTestTestTrueForNotPrime(String notPrime) {
        assertFalse(BigNumber.primalityTest(notPrime));
    }

}