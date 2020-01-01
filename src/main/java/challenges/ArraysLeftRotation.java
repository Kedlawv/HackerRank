package challenges;

public class ArraysLeftRotation {

    static int[] rotLeft(int[] a, int d) {

        int fullCycleRem = d % a.length;
        int[] rotatedArr = new int[a.length];

        System.arraycopy(a, 0, rotatedArr
                , a.length - fullCycleRem, fullCycleRem);
        System.arraycopy(a, fullCycleRem, rotatedArr, 0
                , a.length - fullCycleRem);

        return rotatedArr;
    }
}
