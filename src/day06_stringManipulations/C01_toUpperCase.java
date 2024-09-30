package day06_stringManipulations;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Locale;

public class C01_toUpperCase {
    public static void main(String[] args) {

        String str = "Java Candır";

        System.out.println(str.toUpperCase());  // JAVA CANDIR

        //String method'ları yapılan değişikler
        // String'i kalıcı olarak değiştirmez

        System.out.println(str);  //Java Candır

        //değişikliklerin kalıcı olmasını isterseniz
        //7String'de atama yapmalısınız

        str =str.toUpperCase();

        System.out.println(str); //JAVA CANDIR

        System.out.println(str.toLowerCase()); // java candir

        // I yerine kücük harf seçtiğimizde i gelir
        // I yerine Turkçe karakter olarak ı gelmesini isterseniz

        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR"))); // java candır






    }
}
