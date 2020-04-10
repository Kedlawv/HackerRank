package challenges.practice_java;

public class DivisorSum {
    public int divisorSum(int n) {
        int sum = n;
        for (int i = n; i > 1; i--) {
            double divRes = (double) n / i;
            if (divRes == (int) divRes) {
                sum += divRes;
            }
        }
        return sum;

    }

    public int divisorSumModulo(int n) {
        int sum = 0;
        for (int i = n; i > 0; i--) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
