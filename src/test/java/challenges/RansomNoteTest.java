package challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {

    @Test
    void solutionTest1() {
        List<String> magazine = Arrays.asList("give", "me", "one", "grand", "today", "night");
        List<String> note = Arrays.asList("give", "one", "grand", "today");

        boolean actual = RansomNote.solution(magazine, note);

        assertTrue(actual);
    }

    @Test
    void solutionTest2() {
        List<String> magazine = Arrays.asList("two", "times", "three", "is", "not", "four");
        List<String> note = Arrays.asList("two", "times", "two", "is", "four");

        boolean actual = RansomNote.solution(magazine, note);

        assertFalse(actual);
    }

    @Test
    void solutionTest3() {
        List<String> magazine = Arrays.asList("apgo", "clm", "w", "lxkvg", "mwz", "elo", "bg", "elo", "lxkvg",
                "elo", "apgo", "apgo", "w", "elo", "bg");
        List<String> note = Arrays.asList("elo", "lxkvg", "bg", "mwz", "clm", "w");

        boolean actual = RansomNote.solution(magazine, note);

        assertTrue(actual);
    }


}
