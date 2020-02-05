package challenges.practice_java;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaEndOfFileTest {

    @Test
    public void printsLineWithNumber(){
        String input = "FirstLine\nSecondLine\nThirdLine";
        Scanner scan = new Scanner(input);
        JavaEndOfFile jeof = new JavaEndOfFile();

        List<String> list = jeof.getLineAndEnumerate(scan);

        assertEquals("1 FirstLine", list.get(0));
        assertEquals("2 SecondLine", list.get(1));
        assertEquals("3 ThirdLine", list.get(2));

    }

}