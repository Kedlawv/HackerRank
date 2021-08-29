package challenges;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramDeletions {
    /*
    Given two strings,  and , that may or may not be of the same length, determine the minimum number
    of character deletions required to make  and  anagrams. Any characters can be deleted from either
    of the strings.

    Constraints
    1<=|a|,|b|<=10^4
    The strings  and  consist of lowercase English alphabetic letters, ascii[a-z].
     */

    // Strategy
    // Tokenize both strings to array of letters
    // Count occurrences of letters in a Map
    // We need to compare and delete from the larger count
    // we sort the letters and delete and record the subtractions
    // but one string might not have any of the letters of the other string

    // we could initialize a HashMap to contain all the lowercase letters with value of 0
    // and then add letters from the two strings sort and compare so a TreeMap
    // or we could do it in a LinkedHashMap as we know the order no need to sort

    // [Chosen]
    // or we create an array of all the letters iterate over it and get() from both
    // HashMaps an array element as key get absolute value and add to a deletion counter

    // or we can iterate over HashMap and get() from the other Map by key and compare value
    // if null delete from first map if not null compare and subtract from larger

    public static int makeAnagram(String a, String b) {
        String asciiAZLower = new String("abcdefghijklmnopqrstuvwxyz");
        String[] arrAZ = asciiAZLower.split("");
        int deletionsCount = 0;

        Map<String, Integer> mapA = countToMap(a.split(""));
        Map<String, Integer> mapB = countToMap(b.split(""));

        for (String s : arrAZ) {
            Integer fromMapA = mapA.get(s);
            Integer fromMapB = mapB.get(s);

            if (fromMapA == null) fromMapA = 0;
            if (fromMapB == null) fromMapB = 0;

            deletionsCount += Math.abs(fromMapA - fromMapB);
        }

        return deletionsCount;
    }

    // Just for fun make a generic method that will return a Map with generic key and Integer count

    public static <T> Map<T, Integer> countToMap(T[] arr) {
        Map<T, Integer> countMap = new HashMap<>();

        Arrays.stream(arr).forEach(e -> countMap.merge(e, 1, Integer::sum)); // (v,one) -> v + one

        return countMap;
    }
}
