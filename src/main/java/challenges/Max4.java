package challenges;

import java.util.TreeSet;

public class Max4 {

    public static int solution(int[] A) {
        TreeSet<Integer> multiplesOf4 = new TreeSet<>();
        for (int n : A) {
            if (n % 4 == 0) {
                multiplesOf4.add(n);
            }
        }
        return multiplesOf4.last();
    }
}
