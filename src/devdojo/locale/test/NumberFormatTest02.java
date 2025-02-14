package devdojo.locale.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {

        Locale localeDefault = Locale.getDefault();
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeGR = Locale.GERMAN;

        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeBR);
        nfa[2] = NumberFormat.getCurrencyInstance(localeGR);
        nfa[3] = NumberFormat.getCurrencyInstance(localeJP);

        double valor = 100_000_000.2130;

        for (NumberFormat nf : nfa) {
            System.out.println(nf.format(valor));
        }
    }
}
