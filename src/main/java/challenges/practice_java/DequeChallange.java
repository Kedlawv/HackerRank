package challenges.practice_java;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

public class DequeChallange {

    public int getMaxUniqueOfSubArrayStream(int[] arr, int subarraySize) {
        Deque<Integer> deque = new ArrayDeque<>();
        int maxUniqueNum = 0;
        int n = arr.length;
        int m = subarraySize;

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            if (i < m - 1) {
                deque.addLast(num);
                continue;
            }
            deque.addLast(num);
            List<Integer> list = deque.stream().distinct().collect(Collectors.toList());
            if (list.size() > maxUniqueNum) maxUniqueNum = list.size();
            deque.removeFirst();
        }
        return maxUniqueNum;
    }


}
