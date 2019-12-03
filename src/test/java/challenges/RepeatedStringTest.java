package challenges;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RepeatedStringTest {

    RepeatedString rs;

    @BeforeAll
    public void getJC(){
        rs = new RepeatedString();
    }

    @Test
    void repeatedStringSolution() {

        long expected = 7;
        long actual = rs.repeatedStringSolution("aba",10);

        assertEquals(expected, actual);
    }
}