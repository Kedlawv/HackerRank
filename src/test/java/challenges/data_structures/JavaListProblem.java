package challenges.data_structures;

import java.util.ArrayList;
import java.util.List;

public class JavaListProblem {

    public static List<Integer> listFromString(String s) {
        List<Integer> list = new ArrayList<>();
        String[] sa = s.split(" ");
        for (String number : sa) {
            list.add(Integer.parseInt(number));
        }

        return list;
    }

    public static void addToList(int x, int y, List<Integer> list){
        list.add(x,y);
    }

    public static void removeFromList(int x, List<?> list){
        list.remove(x);
    }
}
