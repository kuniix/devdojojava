package devdojo.resourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundle01 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("messages",new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        ResourceBundle bundle1 = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle1.getString("hello"));
        System.out.println(bundle1.getString("good.morning"));

//        byte e = "letra";
//        double 1c = 123;
        Float b1 = 123f;
//        String 1d = palavra;
        int a1 = 123;
        System.out.println(b1 + " " + a1);
    }
}
