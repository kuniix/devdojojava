package devdojo.locale.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {

        Locale localeDefault = Locale.getDefault();
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeGR = Locale.GERMAN;

        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeBR);
        nfa[2] = NumberFormat.getInstance(localeGR);
        nfa[3] = NumberFormat.getInstance(localeJP);

        double valor = 100_000_000.2130;

        for (NumberFormat nf : nfa) {
            System.out.println(nf.format(valor));
        }


    }
}
