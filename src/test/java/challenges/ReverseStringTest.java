package challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void whenABCDthenDCBA() {
        String expected = "DCBA";

        String actual = ReverseString.reverseStringCharArr("ABCD");

        assertEquals(expected,actual);
    }

    @Test
    void whenABCDthenDCBAStringBuilder(){
        String expected = "DCBA";
        String actual = ReverseString.reverseStringBuilder("ABCD");
        assertEquals(expected,actual);
    }

    @Test
    void whenDEFGthenGFEDIterator(){
        String expected = "GFED";
        String actual  = ReverseString.reverseStringIterator("DEFG");

        assertEquals(expected,actual);
    }

    @Test
    void whenDEFGthenGFEDStream(){
        String expected = "GFED";
        String actual  = ReverseString.reverseStringStream("DEFG");

        assertEquals(expected,actual);
    }
}
