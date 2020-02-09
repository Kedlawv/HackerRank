package challenges.practice_java;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

    public static String[] sortBigDec(String[] sarr){
        Arrays.sort(sarr,Collections.reverseOrder((s1,s2) -> {
            BigDecimal bd1 = new BigDecimal(s1);
            BigDecimal bd2 = new BigDecimal(s2);
            return bd1.compareTo(bd2);
        }));

        return sarr;
    }

    public static String[] sortBigDecAnon(String[] sarr){
        Arrays.sort(sarr,Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                BigDecimal bd1 = new BigDecimal(s1);
                BigDecimal bd2 = new BigDecimal(s2);
                return bd1.compareTo(bd2);
            }
        }));

        return sarr;
    }
}
