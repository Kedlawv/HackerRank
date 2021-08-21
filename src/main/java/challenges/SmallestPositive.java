package challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SmallestPositive {
//    Write a function:
//
//    class Solution { public int solution(int[] A); }
//    that, given an array A of N integers, returns the smallest positive integer (greater than 0)
//    that does not occur in A.
//    For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//    Given A = [1, 2, 3], the function should return 4.
//    Given A = [−1, −3], the function should return 1.
//    Write an efficient algorithm for the following assumptions:
//    N is an integer within the range [1..100,000];
//    each element of array A is an integer within the range [−1,000,000..1,000,000].

    //filter out duplicates
    //sort the array
    //filter out all negative numbers

    //iterate from 1
    //if i != item at [i] return i

    public static int solution(int[] a) {

        Set<Integer> noDuplicates = new TreeSet<>();
        for (int n : a) {
            noDuplicates.add(n);  // filter out duplicates and sort
        }

        List<Integer> justPositive = new ArrayList<>();
        for (Integer n : noDuplicates) {
            if (n > 0) {
                justPositive.add(n);
            }
        }

        for (int i = 0; i < justPositive.size(); i++) {
            if (justPositive.get(i) > i + 1) {
                return i + 1;
            }
        }
        return 1;
    }
}
