package challenges.practice_java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddVarargs {

    public String addIterator(int... args) {
        String returnStr = "";
        int sum = 0;

        List<Integer> list = new ArrayList<Integer>();
        for (int i : args) {
            list.add(i);
        }

        Iterator<Integer> it = list.listIterator(0);

        while (it.hasNext()) {
            Integer num = it.next();
            if (it.hasNext()) {
                returnStr += num + "+";
            } else {
                returnStr += num + "=";
            }
            sum += num;
        }

        return returnStr += sum;
    }

    public String add(int... args) {
        String returnStr = "";
        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            int num = args[i];
            if (!(i == args.length - 1)) {
                returnStr += num + "+";
            } else {
                returnStr += num + "=";
            }
            sum += num;
        }

        return returnStr += sum;
    }
}
