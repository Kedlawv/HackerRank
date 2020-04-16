package challenges.priorityQueueProblem;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrioritiesTest {

    @Test
    void getStudentsTest() {
        List<String> events = new ArrayList<>();
        events.add("ENTER John 3.75 50");
        events.add("ENTER Mark 3.8 24");
        events.add("ENTER Shafaet 3.7 35");
        events.add("SERVED");
        events.add("SERVED");
        events.add("ENTER Samiha 3.85 36");
        events.add("SERVED");
        events.add("ENTER Ashley 3.9 42");
        events.add("ENTER Maria 3.6 46");
        events.add("ENTER Anik 3.95 49");
        events.add("ENTER Dan 3.95 50");
        events.add("SERVED");

        List<Student> expected = new ArrayList<>();
        expected.add( new Student(50,"Dan", 3.95 ));
        expected.add( new Student(42,"Ashley", 3.9));
        expected.add( new Student(35,"Shafaet", 3.7));
        expected.add( new Student(46,"Maria", 3.6));

        List<Student> actual = new Priorities().getStudents(events);

        assertEquals(expected,actual);



    }
}