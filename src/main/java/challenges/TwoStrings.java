package challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoStrings {

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
}
