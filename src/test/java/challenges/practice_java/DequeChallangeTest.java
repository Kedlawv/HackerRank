package challenges.practice_java;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class DequeChallangeTest {

    @Test
    void getMaxUniqueOfSubArrayTest() {
        int[] input = {5, 3, 5, 2, 3, 2};
        int expected = 3;

        int actual = new DequeChallange().getMaxUniqueOfSubArrayStream(input, 3);

        assertEquals(expected, actual);
    }

    @Test
    void getMaxUniqueOfSubArrayLargeTest() throws FileNotFoundException {
        int[] input = new int[100000];
        Scanner scanner = new Scanner(new File("src\\main\\resources\\Deque_input09.txt"));
        for (int i = 0; i < 100000; i++) {
            input[i] = scanner.nextInt();
        }

        int expected = 94531;

        int actual = new DequeChallange().getMaxUniqueOfSubArrayStream(input, 99277);

        assertEquals(expected, actual);
    }
}