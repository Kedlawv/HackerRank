package challenges.DiagonalDifference;

import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int sumLeftDiag = 0;
        int sumRightDiag = 0;

        for (int i = 0; i < arr.size(); i++) {
            sumLeftDiag += arr.get(i).get(i);
        }

        for (int i = 0; i < arr.size(); i++) {
            sumRightDiag += arr.get(i).get(arr.size()-i-1);
        }

        return Math.abs(sumLeftDiag - sumRightDiag);

    }
}
