package challenges.ComparatorChallenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CheckerTest {

    @Test
    void compareTest() {
        Player[] actual = {
                new Player("amy", 100),
                new Player("david", 100),
                new Player("heraldo", 50),
                new Player("aakansha", 75),
                new Player("aleksa", 150)
        };

        Player[] expected = {
                new Player("aleksa", 150),
                new Player("amy", 100),
                new Player("david", 100),
                new Player("aakansha", 75),
                new Player("heraldo", 50)
        };

        Arrays.sort(actual, new Checker());

        assertArrayEquals(expected,actual);
    }
}