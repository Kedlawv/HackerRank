package challenges;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class StaircaseTest {

    private final PrintStream stdOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setup(){
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void staircase() {
        String expected = "    #\r\n   ##\r\n  ###\r\n ####\r\n#####\r\n";

        Staircase.staircase(5);
        String actual = outputStreamCaptor.toString();

        assertEquals(expected,actual);

    }

    @AfterEach
    public void tearDown(){
        System.setOut(stdOut);
    }
}
