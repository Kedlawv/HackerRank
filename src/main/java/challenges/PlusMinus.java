package challenges;

import java.util.Arrays;
/*
    Print the ratios of positive, negative and zero values in the array.
    Each value should be printed on a separate line with  digits after the decimal.
    The function should not return a value.
*/

public class PlusMinus {
    static void plusMinus(int[] arr) {
        long positiveCount = Arrays.stream(arr).filter(n -> n > 0).count();
        long negativeCount = Arrays.stream(arr).filter(n -> n < 0).count();
        long zeroCount = Arrays.stream(arr).filter(n -> n == 0).count();

        double positiveRatio = positiveCount / (double) arr.length;
        double negativeRatio = negativeCount / (double) arr.length;
        double zeroRatio = zeroCount / (double) arr.length;

        System.out.println(String.format("%.6f", positiveRatio));
        System.out.println(String.format("%.6f", negativeRatio));
        System.out.println(String.format("%.6f", zeroRatio));

    }
}
