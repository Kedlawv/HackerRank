package challenges.practice_java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddVarargsTest {

    @Test
    void addIteratorTest() {
        AddVarargs obj = new AddVarargs();

        assertEquals("1+2=3", obj.addIterator(1, 2));
        assertEquals("1+2+3=6", obj.addIterator(1, 2, 3));
        assertEquals("1+2+3+4=10", obj.addIterator(1, 2, 3, 4));
        assertEquals("1+2+3+4+5=15", obj.addIterator(1, 2, 3, 4, 5));
        assertEquals("1+2+3+4+5+6=21", obj.addIterator(1, 2, 3, 4, 5, 6));

    }

    @Test
    void addTest() {
        AddVarargs obj = new AddVarargs();

        assertEquals("1+2=3", obj.add(1, 2));
        assertEquals("1+2+3=6", obj.add(1, 2, 3));
        assertEquals("1+2+3+4=10", obj.add(1, 2, 3, 4));
        assertEquals("1+2+3+4+5=15", obj.add(1, 2, 3, 4, 5));
        assertEquals("1+2+3+4+5+6=21", obj.add(1, 2, 3, 4, 5, 6));

    }
}