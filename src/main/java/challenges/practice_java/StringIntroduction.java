package challenges.practice_java;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        String[] subStrings = new String[chars.length - k + 1];

        for (int i = 0; i <= chars.length - k; i++) {
            subStrings[i] = (s.substring(i, i + k));
        }
        return bubbleSort(subStrings);
    }

    public static String[] bubbleSort(String[] ar) {
        boolean swapped = true;
        while (swapped) {
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


    public static boolean isPallindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static Map<Character, Integer> calcFreq(String s) {
        String sL = s.toLowerCase();
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : sL.toCharArray()) {
            if (freq.containsKey(ch)) {
                freq.put(ch, freq.get(ch) + 1);
            } else {
                freq.put(ch, 1);
            }
        }
        return freq;
    }

    public static boolean isAnagramNoImports(String a, String b) {
        String[] arSa = a.toLowerCase().split("(?!^)");
        String[] arSb = b.toLowerCase().split("(?!^)");

        return sortedArrayEquals(arSa, arSb);
    }

    public static boolean sortedArrayEquals(String[] a, String[] b) {
        if (a.length != b.length) {
            return false;
        }

        a = bubbleSort(a);
        b = bubbleSort(b);

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }
        return true;
    }

    public static String[] tokenizeString(String s) {
        String[] tokStr = s.trim().split("[ !,?._'@]+");
        return tokStr;
    }

    public static boolean isValidIp(String s) {
        String zeroTo255 = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
        String ipValidationPattern = zeroTo255 + "\\." + zeroTo255 + "\\."
                + zeroTo255 + "\\." + zeroTo255;
        return s.matches(ipValidationPattern);
    }

    public static boolean isValidUserName(String s) {

        String userPattern = "^[a-zA-z&&[^_\\s]][\\w]{7,29}$";
        return s.matches(userPattern);
    }

    public static List<String> tagTextExtractor(String s){
        List<String> result = new ArrayList<>();
        Pattern tagPattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
        Matcher tagMatcher = tagPattern.matcher(s);

        while(tagMatcher.find()){
            result.add(tagMatcher.group(2));
        }

        return result;
    }

}

