package challenges.practice_java;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StringIntroductionTest {

    @Test
    public void sumLengthsTest() {
        String a = "Hello";
        String b = "Java";
        int expected = 9;

        int actual = StringIntroduction.sumLengths(a, b);

        assertEquals(expected, actual);
    }

    @Test
    public void compareLexReturnsCorrectValue() {
        String a = "Hello";
        String b = "Java";
        String c = new String("Java");

        int actualFirstLess = StringIntroduction.compareLex(a, b);
        int actualEqual = StringIntroduction.compareLex(c, b);

        assertTrue(actualFirstLess < 0);
        assertTrue(actualEqual == 0);
    }

    @Test
    public void capitalizeAndJoinTest() {
        String a = "hello";
        String b = "java";

        String expected = "Hello Java";
        String actual = StringIntroduction.capitalizeAndJoin(a, b);

        assertEquals(expected, actual);
    }

    @Test
    public void getSubstringTest() {
        String s = "Helloworld";
        int start = 3;
        int end = 7;

        String expected = "lowo";
        String actual = StringIntroduction.getSubstring(start, end, s);

        assertEquals(expected, actual);
    }


    @Test
    public void getSmallestLargestSubstring() {
        String s = "welcometojava";
        int k = 3;
        String[] expected = {"ava", "wel"};

        String[] actual = StringIntroduction.getSmallestLargestSubstring(s, k);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void getSmallestLargestSubstringNoImportsTest() {
        String s = "welcometojava";
        int k = 3;
        String[] expected = {"ava", "wel"};

        String[] execute = StringIntroduction.getSmallestLargestSubstringNoImports(s, k);
        String[] actual = {execute[0], execute[execute.length - 1]};

        assertArrayEquals(expected, actual);
    }


    @Test
    public void bubbleSortTest() {
        String[] ar = {"elc", "lco", "ava", "wel", "eto"};
        String[] expected = {"ava", "elc", "eto", "lco", "wel"};

        String[] actual = StringIntroduction.bubbleSort(ar);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void isPallindromeTest() {
        String pallindrome = "madam";
        String notPallindrome = "blabla";

        assertTrue(StringIntroduction.isPallindrome(pallindrome));
        assertFalse(StringIntroduction.isPallindrome(notPallindrome));
    }

    @Test
    public void calcFreqTest() {
        String s1 = "anagram";
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 3);
        expected.put('n', 1);
        expected.put('g', 1);
        expected.put('r', 1);
        expected.put('m', 1);

        Map<Character, Integer> freq1 = StringIntroduction.calcFreq(s1);

        assertEquals(expected, freq1);
    }

    @Test
    public void arrayEqualsTest() {
        String[] sAr1 = {"a", "b", "c"};
        String[] sAr2 = {"a", "c", "b"};
        String[] sAr3 = {"d", "e", "f"};

        assertTrue(StringIntroduction.sortedArrayEquals(sAr1, sAr2));
        assertFalse(StringIntroduction.sortedArrayEquals(sAr1, sAr3));
    }

    @Test
    public void tokenizeStringTest() {
        String input = "He is a very very good boy, isn't he?";
        String input2 = "           YES      leading spaces        are valid,    problemsetters are         evillllll";
        String[] expected = {"He", "is", "a", "very", "very", "good", "boy", "isn", "t", "he"};
        String[] expected2 = {"YES", "leading", "spaces", "are", "valid", "problemsetters", "are", "evillllll"};


        String[] actual = StringIntroduction.tokenizeString(input);
        String[] actual2 = StringIntroduction.tokenizeString(input2);

        assertEquals(10, actual.length);
        assertEquals(8, actual2.length);
        assertArrayEquals(expected, actual);
        assertArrayEquals(expected2, actual2);
    }

    @Test
    public void isValidIpTest() {
        String[] validIps = {"000.12.12.034", "121.234.12.12", "23.45.12.56"};
        String[] notValidIps = {"000.12.234.23.23", "666.666.23.23", ".213.123.23.32", "23.45.22.32."
                , "I.Am.not.an.ip"};

        for (String ip : validIps) {
            assertTrue(StringIntroduction.isValidIp(ip));
        }
        for (String ip : notValidIps) {
            assertFalse(StringIntroduction.isValidIp(ip));
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"Samantha", "Samantha21", "Samantha_21", "a123bcd456"})
    public void isValidUserNameTestTrueIfValid(String valid) {

            assertTrue(StringIntroduction.isValidUserName(valid));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/csvTestCase5",delimiter = '\n')
    public void isValidUserNameTestTrueIfInvalid(String invalid) {

        System.out.println(invalid);
        assertFalse(StringIntroduction.isValidUserName(invalid));
    }
}