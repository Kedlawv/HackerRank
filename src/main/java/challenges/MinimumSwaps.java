package challenges;

public class MinimumSwaps {
    /*
    You are given an unordered array consisting of consecutive integers  [1, 2, 3, ..., n]
    without any duplicates. You are allowed to swap any two elements. Find the minimum number
    of swaps required to sort the array in ascending order.
    */

    public static int minimumSwaps(int[] arr) {
        int numSwaps = 0;
        boolean sorted = checkIfSorted(arr);

        while (!sorted) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != i + 1) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[j] == i + 1) {
                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                            numSwaps++;
                        }
                    }
                }
            }
            sorted = checkIfSorted(arr);
        }

        return numSwaps;
    }

    private static boolean checkIfSorted(int[] arr) {
        boolean sorted;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return false;
            }
        }
        return true;
    }
}
