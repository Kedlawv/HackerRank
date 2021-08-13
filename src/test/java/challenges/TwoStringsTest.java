package challenges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoStringsTest {

    @Test
    void twoStringsTestOne() {
        String s1 = new String("and");
        String s2 = new String("art");
        String expected = "YES";

        String actual = TwoStrings.twoStrings(s1,s2);

        assertEquals(expected,actual);
    }

    @Test
    void tokenizeAllPosSubTestOne(){
        String s = new String("1234");
        List<String> expected = new ArrayList<>(Arrays.asList(
                "1","2","3","4",
                "12","23","34",
                "123","234",
                "1234"
        ));

        List<String> actual = TwoStrings.tokenizeAllPosSub(s);

        assertEquals(expected, actual);
    }
}