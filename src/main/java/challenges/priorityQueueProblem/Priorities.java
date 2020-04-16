package challenges.priorityQueueProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Priorities {

    private PriorityQueue<Student> pq;

    public Priorities(){
        pq = new PriorityQueue<>(new StudentComparator());
    }

    List<Student> getStudents(List<String> events){
        for(String event : events){
            String[] eventArray = event.split(" ");
            if(eventArray[0].equals("ENTER")){
                String name = eventArray[1];
                double cgpa = Double.parseDouble(eventArray[2]);
                int id = Integer.parseInt(eventArray[3]);

                pq.add(new Student(id,name,cgpa));
            }else{
                pq.poll();
            }
        }
        List<Student> result = new ArrayList<>();
        while(!pq.isEmpty()){
            result.add(pq.poll());
        }

        return result;
    }
}
