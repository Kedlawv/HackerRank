package challenges.practice_java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringIntroductionTest {

    @Test
    public void sumLengthsTest(){
        String a = "Hello";
        String b = "Java";
        int expected = 9;

        int actual = StringIntroduction.sumLengths(a,b);

        assertEquals(expected,actual);
    }

    @Test
    public void compareLexReturnsCorrectValue(){
        String a = "Hello";
        String b = "Java";
        String c = new String("Java");

        int actualFirstLess = StringIntroduction.compareLex(a,b);
        int actualEqual = StringIntroduction.compareLex(c,b);

        assertTrue(actualFirstLess<0);
        assertTrue(actualEqual == 0);
    }

    @Test
    public void capitalizeAndJoinTest(){
        String a = "hello";
        String b = "java";

        String expected = "Hello Java";
        String actual = StringIntroduction.capitalizeAndJoin(a,b);

        assertEquals(expected,actual);
    }

    @Test
    public void getSubstringTest(){
        String s = "Helloworld";
        int start = 3;
        int end = 7;

        String expected = "lowo";
        String actual = StringIntroduction.getSubstring(start,end,s);

        assertEquals(expected, actual);
    }


    @Test
    public void getSmallestLargestSubstring(){
        String s = "welcometojava";
        int k = 3;
        String[] expected = {"ava","wel"};

        String[] actual = StringIntroduction.getSmallestLargestSubstring(s,k);

        assertArrayEquals(expected,actual);
    }

    @Test
    public void getSmallestLargestSubstringNoImportsTest(){
        String s = "welcometojava";
        int k = 3;
        String[] expected = {"ava","wel"};

        String[] execute = StringIntroduction.getSmallestLargestSubstringNoImports(s,k);
        String[] actual = {execute[0],execute[execute.length-1]};

        assertArrayEquals(expected,actual);
    }


    @Test
    public void bubbleSortTest(){
        String[] ar = {"elc","lco","ava","wel","eto"};
        String[] expected = {"ava","elc","eto","lco","wel"};

        String[] actual = StringIntroduction.bubbleSort(ar);

        assertArrayEquals(expected,actual);
    }

}