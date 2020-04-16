package challenges.priorityQueueProblem;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StudentComparatorTest {

    @Test
    public void studentComparatorTestCGPANotEqual() {
        Student s1 = new Student(1, "John", 12.3);
        Student s2 = new Student(2, "Anna", 15.5);

        StudentComparator sc = new StudentComparator();

        int actual = sc.compare(s1, s2);

        assertTrue(actual > 0);
    }

    @Test
    public void studentComparatorTestCGPAEqualNameNotEqual() {
        Student s1 = new Student(1, "John", 12.3);
        Student s2 = new Student(2, "Anna", 12.3);

        StudentComparator sc = new StudentComparator();

        int actual = sc.compare(s1, s2);

        assertTrue(actual > 0);
    }

    @Test
    public void studentComparatorTestCGPAEqual_NameEqual_IDNotEqual() {
        Student s1 = new Student(1, "Anna", 12.3);
        Student s2 = new Student(2, "Anna", 12.3);

        StudentComparator sc = new StudentComparator();

        int actual = sc.compare(s1, s2);

        assertTrue(actual < 0);
    }

    @Test
    public void studentComparatorTestAllSame() {
        Student s1 = new Student(1, "Anna", 12.3);
        Student s2 = new Student(1, "Anna", 12.3);

        StudentComparator sc = new StudentComparator();

        int actual = sc.compare(s1, s2);

        assertTrue(actual == 0);
    }

    @Test
    public void studentComparatorTestList() {
        List<Student> list = new ArrayList<>();

        list.add(new Student(16, "Bob", 17.3));
        list.add(new Student(7, "Anna", 17.3));
        list.add(new Student(12, "Bob", 17.3));
        list.add(new Student(4, "John", 19.3));

        List<Student> listExpected = new ArrayList<>();

        listExpected.add(new Student(4, "John", 19.3));
        listExpected.add(new Student(7, "Anna", 17.3));
        listExpected.add(new Student(12, "Bob", 17.3));
        listExpected.add(new Student(16, "Bob", 17.3));


        Collections.sort(list, new StudentComparator());

        assertEquals(listExpected,list);


    }

}