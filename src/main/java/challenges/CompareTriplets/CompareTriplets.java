package challenges.CompareTriplets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompareTriplets {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(0);

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                result.set(0, result.get(0) + 1);
            }
            if (a.get(i) < b.get(i)) {
                result.set(1, result.get(1) + 1);
            }
        }
        return result;
    }

    static List<Integer> compareTripletsIterator(List<Integer> a, List<Integer> b) {

        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(0);

        Iterator<Integer> iteratorA = a.iterator();
        Iterator<Integer> iteratorB = b.iterator();

        while (iteratorA.hasNext()) {
            int n = iteratorA.next();
            int m = iteratorB.next();

            if (n > m) {
                result.set(0, result.get(0) + 1);
            } else if (n < m) {
                result.set(1, result.get(1) + 1);
            }
        }
        return result;
    }
}
