package challenges.practice_java;

import java.text.NumberFormat;

public class CurrencyFormatter {

    public static String formatCurrency(double amount, NumberFormat nf) {
        return nf.format(amount);
    }
}
