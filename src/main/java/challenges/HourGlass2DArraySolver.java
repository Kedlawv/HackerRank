package challenges;

public class HourGlass2DArraySolver {

    static int hourglassMaxSum(int[][] arr) {

        int maxSum = Integer.MIN_VALUE;

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                int currentSum = getHourGlassSumAtIndex(i, j, arr);
                maxSum = currentSum > maxSum ? currentSum : maxSum;
            }
        }
        return maxSum;
    }

    static int getHourGlassSumAtIndex(int i, int j, int[][] arr) {
        if (i + 2 > arr.length || j + 2 > arr[0].length)
            return -1000;

        int sum = 0;
        for (int q = 0; q < 3; q++) {
            if (q == 1) {
                sum += arr[i + 1][j + q];
                continue;
            }
            for (int p = 0; p < 3; p++) {
                sum += arr[i + q][j + p];
            }
        }

        return sum;
    }
}
