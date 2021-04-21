package challenges;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PlusMinusTest {

    private final PrintStream stdOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp(){
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void plusMinus() {
        int[] inputArr = {-4,3,-9,0,4,1};
        String expected = ("0.500000\r\n0.333333\r\n0.166667\r\n");

        PlusMinus.plusMinus(inputArr);
        String actual = outputStreamCaptor.toString();

        assertEquals(expected, actual);
    }

    @AfterEach
    public void tearDown(){
        System.setOut(stdOut);
    }
}
