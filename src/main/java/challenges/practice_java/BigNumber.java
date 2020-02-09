package challenges.practice_java;

import java.math.BigInteger;

public class BigNumber {

    public static boolean primalityTest(String n) {
        return new BigInteger(n).isProbablePrime(1);
    }

    public static BigInteger[] addAndMultiplyBigInt(String a, String b) {
        BigInteger aBI = new BigInteger(a);
        BigInteger bBI = new BigInteger(b);
        BigInteger[] result = {aBI.add(bBI), aBI.multiply(bBI)};

        return result;
    }
}
