package challenges.practice_java;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CurrencyFormatterTest {

    @Test
    public void returnCorrectCurrencyFormatForLocale() {
        NumberFormat nfUS = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nfIn = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat nfCh = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nfFr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        double amount = 12324.134;
        String usString;
        String inString;
        String chString;
        String frString;
        String expectedUS = "US: $12,324.13";
        String expectedIn = "India: Rs.12,324.13";
        String expectedCh = "China: ￥12,324.13";
        String expectedFr = "France: 12 324,13 €";

        usString = "US: " + CurrencyFormatter.formatCurrency(amount, nfUS);
        inString = "India: " + CurrencyFormatter.formatCurrency(amount, nfIn);
        chString = "China: " + CurrencyFormatter.formatCurrency(amount, nfCh);
        frString = "France: " + CurrencyFormatter.formatCurrency(amount, nfFr);

        assertEquals(expectedUS, usString);
        assertEquals(expectedIn, inString);
        assertEquals(expectedCh, chString);
        assertEquals(expectedFr, frString);
    }

}