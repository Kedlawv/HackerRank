package challenges.ComparatorChallenge;

import java.math.BigDecimal;
import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (new BigDecimal(s1.getCgpa()).compareTo(new BigDecimal(s2.getCgpa())) == 0) {
            if (s1.getFname().equals(s2.getFname())) {
                return s1.getId() > s2.getId() ? 1 : -1;
            } else {
                return s1.getFname().compareTo(s2.getFname());
            }
        } else {
            return new BigDecimal(s1.getCgpa()).compareTo(new BigDecimal(s2.getCgpa())) * -1;
        }
    }
}
