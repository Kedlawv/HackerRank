package challenges.ComparatorChallenge;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentComparatorTest {

    @Test
    void compareComparatorTest() {
        List<Student> studentListActual = new ArrayList<>(
                Arrays.asList(
                        new Student(33, "Rumpa", 3.68),
                        new Student(85, "Ashis", 3.85),
                        new Student(56, "Samiha", 3.75),
                        new Student(19, "Samara", 3.75),
                        new Student(22, "Fahim", 3.76)
                ));

        List<Student> studentListExpected = new ArrayList<>(
                Arrays.asList(
                        new Student(85, "Ashis", 3.85),
                        new Student(22, "Fahim", 3.76),
                        new Student(19, "Samara", 3.75),
                        new Student(56, "Samiha", 3.75),
                        new Student(33, "Rumpa", 3.68)
                ));

        studentListActual.sort(new StudentComparator());

        assertEquals(studentListExpected, studentListActual);
    }

    @Test
    void compareLambdaTest() {
        List<Student> studentListActual = new ArrayList<>(
                Arrays.asList(
                        new Student(33, "Rumpa", 3.68),
                        new Student(85, "Ashis", 3.85),
                        new Student(56, "Samiha", 3.75),
                        new Student(19, "Samara", 3.75),
                        new Student(22, "Fahim", 3.76)
                ));

        List<Student> studentListExpected = new ArrayList<>(
                Arrays.asList(
                        new Student(85, "Ashis", 3.85),
                        new Student(22, "Fahim", 3.76),
                        new Student(19, "Samara", 3.75),
                        new Student(56, "Samiha", 3.75),
                        new Student(33, "Rumpa", 3.68)
                ));

        studentListActual.sort((s1, s2) ->
        {
            if (new BigDecimal(s1.getCgpa()).compareTo(new BigDecimal(s2.getCgpa())) == 0) {
                if (s1.getFname().equals(s2.getFname())) {
                    return s1.getId() > s2.getId() ? 1 : -1;
                } else {
                    return s1.getFname().compareTo(s2.getFname());
                }
            } else {
                return new BigDecimal(s1.getCgpa()).compareTo(new BigDecimal(s2.getCgpa())) * -1;
            }
        });

        assertEquals(studentListExpected, studentListActual);
    }
}