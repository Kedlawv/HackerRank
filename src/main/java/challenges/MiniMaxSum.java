package challenges;

public class MiniMaxSum {
    /*
    Given five positive integers, find the minimum and maximum values that can be calculated
     by summing exactly four of the five integers. Then print the respective minimum and maximum
     values as a single line of two space-separated long integers.
     */
    static void miniMaxSum(int[] arr) {
        long minSum = Long.MAX_VALUE;
        long maxSum = Long.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            long sum = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }
                sum += arr[j];
            }
            if (minSum > sum) {
                minSum = sum;
            }
            if (maxSum < sum) {
                maxSum = sum;
            }
        }
        System.out.println(minSum + " " + maxSum);

    }
}
