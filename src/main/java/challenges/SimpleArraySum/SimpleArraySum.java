package challenges.SimpleArraySum;

import java.util.Arrays;

public class SimpleArraySum {

    int simpleArraySum(int[] ar) {

        int sum = 0;

        for (int num : ar) {
            sum += num;
        }
        return sum;
    }

    int simpleArraySumStreamReduce(int[] ar) {
        return Arrays.stream(ar).reduce(0, (a, b) -> a + b);
    }

    int simpleArraySumStreamSum(int[] ar){
        return Arrays.stream(ar).sum();
    }

}
