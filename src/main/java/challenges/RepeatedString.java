package challenges;

// https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

public class RepeatedString {
    public long repeatedStringSolution(String s, int n) {

        long numOfAsTotal = 0;
        long numOfAsInOne = 0;
        long numOfAsInRemainder = 0;
        long namOfFullRepetitions = n / s.length();
        int remainderChars = (int) (n % s.length());

        for (char ch : s.toCharArray()) {
            if (ch == 'a') {
                numOfAsInOne++;
            }
        }

        for (char ch : s.substring(0, remainderChars).toCharArray()) {
            if (ch == 'a') {
                numOfAsInRemainder++;
            }
        }

        numOfAsTotal += numOfAsInOne * namOfFullRepetitions + numOfAsInRemainder;

        return numOfAsTotal;
    }

}
