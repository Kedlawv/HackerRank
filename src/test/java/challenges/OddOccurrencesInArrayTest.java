package challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OddOccurrencesInArrayTest {

    @Test
    void solutionForLoopIfPresent() {
        int[] input = {9, 3, 9, 3, 9, 7, 9, 7, 7};
        int expected = 7;

        int actual = OddOccurrencesInArray.solutionForLoopIfPresent(input);

        assertEquals(expected, actual);
    }

    @Test
    void solutionForLoopMerge() {
        int[] input = {9, 3, 9, 3, 9, 7, 9, 7, 7};
        int expected = 7;

        int actual = OddOccurrencesInArray.solutionForLoopMerge(input);

        assertEquals(expected, actual);
    }

    @Test
    void solutionStream() {
        int[] input = {9, 3, 9, 3, 9, 7, 9};
        int expected = 7;

        int actual = OddOccurrencesInArray.solutionStream(input);

        assertEquals(expected, actual);
    }

    @Test
    void solutionStreamNonUniqueNoPair() {
        int[] input = {9, 3, 9, 3, 9, 7, 9, 7, 7};
        int expected = 7;

        int actual = OddOccurrencesInArray.solutionStream(input);

        assertEquals(expected, actual);
    }

    @Test
    void solutionForLoopMergeNonUniqueNoPair() {
        int[] input = {9, 3, 9, 9, 9, 3, 9, 7, 9, 7, 7};
        int expected = 7;

        int actual = OddOccurrencesInArray.solutionForLoopMerge(input);

        assertEquals(expected, actual);
    }


}