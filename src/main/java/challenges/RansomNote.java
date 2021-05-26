package challenges;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RansomNote {

    public static boolean solution(List<String> magazine, List<String> note) {
        Map<String, Integer> magazineWordCount = new HashMap<>();
        Map<String, Integer> noteWordCount = new HashMap<>();

        for (String s : magazine) {
            magazineWordCount.merge(s, 1, (k, v) -> v + 1);
        }
        for (String s : note) {
            noteWordCount.merge(s, 1, (k, v) -> v + 1);
        }

        return magazineWordCount.entrySet().containsAll(noteWordCount.entrySet());
    }
}
