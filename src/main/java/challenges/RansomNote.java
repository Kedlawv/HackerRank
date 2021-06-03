package challenges;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RansomNote {

    public static boolean solution(List<String> magazine, List<String> note) {
        Map<String, Integer> magazineWordCount = new HashMap<>();
        Map<String, Integer> noteWordCount = new HashMap<>();

        // map.merge(word, 1, (prev, one) -> prev + one)
        // map.merge(key, defaultValueIfAbsent, (valueOfKey, defaultValue) -> ).
        // First argument of the BiFunction is a Value for the Key not the Key itself .

        for (String s : magazine) {
            magazineWordCount.merge(s, 1, (valueOfK, v) -> valueOfK + 1);
        }
        for (String s : note) {
            noteWordCount.merge(s, 1, (valueOfK, v) -> valueOfK + 1);
        }
        // note map does not have to be a subset of magazine map
        // magazine needs to have all the keys of note map but values can be larger !

        for (Map.Entry<String, Integer> entry : noteWordCount.entrySet()) {
            if (!magazineWordCount.containsKey(entry.getKey())) {
                return false;
            }
            if (entry.getValue() > magazineWordCount.get(entry.getKey())) {
                return false;
            }
        }

        return true;
    }
}
