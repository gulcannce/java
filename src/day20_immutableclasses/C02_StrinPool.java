package day20_immutableclasses;

public class C02_StrinPool {

    public static void main(String[] args) {


        String str1 = "Java";
        String str2 = "java";
        String str3 = "Java";
        String str4 = new String("java");
        String str5 = "Ja" + "va";
        String str6 = "Ja";
        String str7 = "va";
        String str8 = str6+str7;

        // equals () sadece metne bakar
        // == ise hem metne hme de referansa bakar


        System.out.println(str1 == str2); //false
        System.out.println(str1 == str3); //true
        System.out.println(str1 ==str4); // false
        System.out.println(str1 == str5); // true
        System.out.println(str1 == str8); //false

        /*
          basit şekılde olusturulan  string objeler için
          Java öncelikle Stringb Pool'u kontrol eder
          eger Pool'da ayne degere sahip baska bir String varsa
          yeni obje ile eski objenin referansını ve degerini eslsştırır

          == kullanımında havuzda olan ve degeri aynı olanlar true verir
          havuzda olmayanların true verme ihtimali yoktur
         */
    }
}
