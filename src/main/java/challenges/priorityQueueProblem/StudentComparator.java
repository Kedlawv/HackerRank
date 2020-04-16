package challenges.priorityQueueProblem;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getCGPA() > s2.getCGPA()) {return -1;}
        else if (s1.getCGPA() < s2.getCGPA()) {return 1;}
        else {
            int nameCompare = s1.getName().compareTo(s2.getName());
            if(!(nameCompare == 0)){
                return nameCompare;
            }else{
                return s1.getID() - s2.getID();
            }
        }

    }
}
