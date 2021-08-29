package challenges;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnagramDeletionsTest {

    @Test
    void makeAnagramWhenTwoAnagramsThenEquals() {
        String inputA = new String("restful");
        String inputB = new String("fluster");
        int expected = 0;

        int actual = AnagramDeletions.makeAnagram(inputA, inputB);

        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramWhenAbcdAndAbcThen1() {
        String inputA = new String("abcd");
        String inputB = new String("abc");
        int expected = 1;

        int actual = AnagramDeletions.makeAnagram(inputA, inputB);

        assertEquals(expected, actual);
    }

    @Test
    void makeAnagramWhenAAndBThen2() {
        String inputA = new String("a");
        String inputB = new String("b");
        int expected = 2;

        int actual = AnagramDeletions.makeAnagram(inputA, inputB);

        assertEquals(expected, actual);
    }


    @Test
    void countToMapABCOne() {
        String[] input = {"a", "b", "c"};
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 1);
        expected.put("b", 1);
        expected.put("c", 1);

        Map<String, Integer> actual = AnagramDeletions.countToMap(input);

        assertEquals(expected, actual);

    }

    @Test
    void countToMapABCMultiple() {
        String[] input = {"a", "b", "c", "a", "b", "c", "a", "a"};
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 4);
        expected.put("b", 2);
        expected.put("c", 2);

        Map<String, Integer> actual = AnagramDeletions.countToMap(input);

        assertEquals(expected, actual);

    }

    @Test
    void countToMap123Multiple() {
        Integer[] input = {1, 2, 3, 1, 2, 3, 1, 1, 1};
        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(1, 5);
        expected.put(2, 2);
        expected.put(3, 2);

        Map<Integer, Integer> actual = AnagramDeletions.countToMap(input);

        assertEquals(expected, actual);

    }
}