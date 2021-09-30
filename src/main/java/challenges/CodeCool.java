package challenges;

import java.util.List;
import java.util.Random;

public class CodeCool {

    /**
     * Given a list of some elements
     * write a method that will find unique element.
     * For edge case handling see provided tests.
     * <p>
     * [1, 1, 2, 1, 1]  => 2
     * ['a', 'b', 'b']  => 'a'
     * <p>
     * There always will be just one unique element
     *
     * @author Wojciech Makieła
     */

    static <T extends Comparable<T>> T findUnique(List<T> list) {

        T notUnique;

        // edge cases

        if (list.size() == 0) throw new IllegalArgumentException("list can't be empty");
        if (list.size() == 1) return list.get(0);
        if (list.size() == 2) return list.get(new Random().nextInt(2));


        // assumption was made from the ambiguous documentation that the argument list will be at
        // least 3 elements | add edge cases above

        if (list.get(0).compareTo(list.get(1)) != 0) {
            return list.get(0).compareTo(list.get(2)) == 0 ? list.get(1) : list.get(0);
        } else {
            notUnique = list.get(0);
        }

        for (T elem : list) {
            if (elem.compareTo(notUnique) != 0) return elem;
        }

        return null;
    }
}
