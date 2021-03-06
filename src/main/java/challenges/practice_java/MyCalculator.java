package challenges.practice_java;

public class MyCalculator {

    public static long power(int n, int p) throws Exception {
        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero");
        }
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative");
        }
        System.out.println();
        return (long) Math.pow(n, p);
    }
}
