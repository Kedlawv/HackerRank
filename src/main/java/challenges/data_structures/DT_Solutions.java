package challenges.data_structures;

import java.util.Arrays;

public class DT_Solutions {


    public static int subarrayNegativeSum(int[] ints) {
        int sumOfNegative = 0;

        for (int i = 1; i <= ints.length; i++) {
            int[][] subArrays = getSubarraysOfLength(i, ints);
            
            for (int[] outer : subArrays) {
                int sum = 0;
                for (int n : outer) {
                    sum += n;
                }

                if (sum < 0) {
                    sumOfNegative++;
                }
            }
        }

        return sumOfNegative;
    }

    public static int[][] getSubarraysOfLength(int n, int[] arr) {
        int resultLength;
        resultLength = (arr.length - n) + 1;

        int[][] subArrays = new int[resultLength][];

        for (int i = 0; i < resultLength; i++) {
            subArrays[i] = Arrays.copyOfRange(arr, i, i + n);
        }

        return subArrays;
    }

}
