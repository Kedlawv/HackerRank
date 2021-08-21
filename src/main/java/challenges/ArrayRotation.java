package challenges;

public class ArrayRotation {
    public static int[] solution(int[] a, int k) {
        // find the number of full rotations
        // rotate the array by remainder

        int fullCycleRemainder = k % a.length;

        for (int i = 0; i < fullCycleRemainder; i++) {
            rotateLeftOnce(a);
        }

        return a;
    }

    protected static int[] rotateLeftOnce(int[] arr) {
        int itemToMove = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = itemToMove;

        return arr;
    }

    public static int[] solutionNested(int[] a, int k) {

        int remainderOfFullRotation = k % a.length;

        for (int i = 0; i < remainderOfFullRotation; i++) {
            int lastItem = a[a.length - 1];
            for (int j = a.length - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }
            a[0] = lastItem;
        }

        return a;
    }


}
