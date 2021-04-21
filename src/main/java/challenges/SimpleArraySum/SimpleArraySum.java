package challenges.SimpleArraySum;

public class SimpleArraySum {

    int simpleArraySum(int[] ar) {

        int sum = 0;

        for (int num : ar) {
            sum += num;
        }
        return sum;
    }
}
