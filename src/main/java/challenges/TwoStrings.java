package challenges;

import java.util.*;

public class TwoStrings {
    // Given two strings, determine if they share a common substring.
    // A substring may be as small as one character.

    // Given two strings, determine if they share a common substring.
    // A substring may be as small as one character.

    // Approach => Tokenize both substrings in to an array of all possible substrings and check if they contain
    // a common substring

    public static String twoStrings(String s1, String s2) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1 = tokenizeAllPosSub(s1);
        list2 = tokenizeAllPosSub(s2);

        boolean bool = list1.stream().anyMatch(list2::contains);

        return bool ? "YES" : "NO";
    }

    protected static List<String> tokenizeAllPosSub(String s) {
        // a nested for loop where outer loop i will be the length of the substring
        // and inner loop j will be the starting index of the substring

        List<String> list = new ArrayList<>();

        for (int length = 1; length <= s.length(); length++) {
            for (int start = 0; start <= s.length() - length; start++) {
                list.add(s.substring(start, start + length));
            }
        }

        return list;
    }

    // After reading the editorial turns out that this was a trick question lol
    // We don't actually need to check all the substrings
    // Because return is only YES or NO we only need to check if the two strings contain one character that
    // is common
    // Understanding the requirements was the key here

    // Solution is to put all characters from two strings in to sets and check if the intersection is empty

    public static String twoStringsNotNaive(String s1, String s2) {

        Set<String> setOne = new HashSet<>(Arrays.asList(s1.split("")));
        Set<String> setTwo = new HashSet<>(Arrays.asList(s2.split("")));

        Set<String> intersection = new HashSet<>(setOne);
        intersection.retainAll(setTwo);

        return intersection.size() != 0 ? "YES" : "NO";


    }
}
