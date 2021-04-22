package challenges;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        Optional<Integer> maxValue = candles.stream().max(Comparator.naturalOrder());
        long count = candles.stream().filter(num -> num.equals(maxValue.get())).count();

        return (int) count;

    }

}
