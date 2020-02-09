package challenges.practice_java;

import java.math.BigInteger;

public class BigNumber {

    public static boolean primalityTest(String n){
        return new BigInteger(n).isProbablePrime(1);
    }

    
}
