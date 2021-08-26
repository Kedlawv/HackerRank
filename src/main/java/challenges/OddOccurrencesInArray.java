package challenges;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

    /*
        A non-empty array A consisting of N integers is given.
         The array contains an odd number of elements, and each element of the array can be paired
         with another element that has the same value, except for one element that is left unpaired.
         Return the value of the unpaired element.

         N is an odd integer within the range [1..1,000,000];
         Each element of array A is an integer within the range [1..1,000,000,000];
         all but one of the values in A occur an even number of times.
     */

    // add all elements of the array to a HashMap
    // count all occurrences of a number, set as key and number of occurrences as value
    // iterate over the HashMap and find a key with a value of 1
    // return the key
    // O(2n) => O(n)

    public static int solutionForLoopIfPresent(int[] A) {
        Map<Integer, Integer> occurCount = new HashMap<>();
        for (int i : A) {
            if (occurCount.get(i) == null) {
                occurCount.put(i, 1);
                continue;
            }
            occurCount.computeIfPresent(i, (key, value) -> value + 1);
        }

        for (Map.Entry<Integer, Integer> e : occurCount.entrySet()) {
            if (e.getValue() % 2 != 0) {
                return e.getKey();
            }
        }

        return -1;
    }

    public static int solutionForLoopMerge(int[] A) {
        Map<Integer, Integer> occurCount = new HashMap<>();
        for (int i : A) {
            occurCount.merge(i, 1, (existingValue, one) -> existingValue + one);
        }

        for (Map.Entry<Integer, Integer> e : occurCount.entrySet()) {
            if (e.getValue() % 2 != 0) {
                return e.getKey();
            }
        }

        return -1;
    }

    public static int solutionStream(int[] A) {
        Map<Integer, Integer> occurCount = new HashMap<>();
        Arrays.stream(A).forEach(i -> occurCount.merge(i, 1, (v, one) -> v + one));

        return occurCount.entrySet()
                .stream()
                .filter(e -> e.getValue() % 2 != 0)
                .map(Map.Entry::getKey).findFirst().orElse(-1);
    }
}
