package oop;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by Le on 11/5/2016 0005.
 */
public class NumberFormatExample {
    public static void main(String[] args) {
        double amount = 1350978.27854;
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(amount));

        nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println(nf.format(amount));

        System.out.println(nf.getClass().getName());
    }
}
