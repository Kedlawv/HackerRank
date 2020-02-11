package challenges.data_structures;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaListProblemTest {

    @Test
    public void listFromStringTest() {
        String input = "12 0 1 78 12";
        List<Integer> expected = Arrays.asList(12, 0, 1, 78, 12);

        List<Integer> actual = JavaListProblem.listFromString(input);

        assertEquals(expected, actual);
    }

    @Test
    public void addToListTest(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,6,2,3,4,5));

        JavaListProblem.addToList(1,6,list);

        assertEquals(expected,list);
    }

    @Test
    public void removeFromListTest(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,3,4,5));

        JavaListProblem.removeFromList(1,list);

        assertEquals(expected,list);
    }



}