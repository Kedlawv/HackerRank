package challenges.practice_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringIntroduction {

    public static int sumLengths(String a, String b) {
        return a.length() + b.length();
    }

    public static int compareLex(String a, String b) {
        return a.compareTo(b);
    }

    public static String capitalizeAndJoin(String a, String b) {
        return a.substring(0, 1).toUpperCase() + a.substring(1) + " "
                + b.substring(0, 1).toUpperCase() + b.substring(1);
    }

    public static String getSubstring(int start, int end, String s) {
        return s.substring(start, end);
    }

    public static String[] getSmallestLargestSubstring(String s, int k) {
        char[] chars = s.toCharArray();
        List<String> subStrings = new ArrayList<>();

        for (int i = 0; i <= chars.length - k; i++) {
            subStrings.add(s.substring(i, i + k));
        }

        Collections.sort(subStrings);

        return new String[]{subStrings.get(0), subStrings.get(subStrings.size() - 1)};
    }

    public static String[] getSmallestLargestSubstringNoImports(String s, int k) {
        char[] chars = s.toCharArray();
        String[] subStrings = new String[chars.length - k +1];

        for (int i = 0; i <= chars.length - k; i++) {
            subStrings[i] = (s.substring(i, i + k));
        }
        return bubbleSort(subStrings);
    }

    public static String[] bubbleSort(String[] ar) {
        boolean swapped = true;
        while(swapped) {
            swapped = false;
            for (int i = 0; i < ar.length - 1; i++) {
                if (ar[i].compareTo(ar[i + 1]) > 0) {
                    String tmp = ar[i];
                    ar[i] = ar[i + 1];
                    ar[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
        return ar;
    }

}

