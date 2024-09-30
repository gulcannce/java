package day06_stringManipulations;

public class C02_equals {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "java";
        String str3 = "Java";
        String str4 = new String(oroginal: "Java");
        String str5 = "Ja" + "va";
        String str6 = "Ja";
        String str7 = "va";
        String str8 = str6+str7;


        // eqals() String'lerin case sensitive olarak esitliğini kontrol eder

        System.out.println(str1.equals(str2)); //false
        System.out.println(str1.equals(str3)); //true
        System.out.println(str1.equals(str4)); // true
        System.out.println(str1.equals(str5)); // true
        System.out.println(str1.equals(str8)); //true
        /*
        bugune kadar karşılaşmaları hep == yapmıştık
        ancak non-primitive data turleri için == sağlıklı çalışmaz
        ilerdeString Pool konusunda asağıdaki =='lerin
        bazılarının true bazılarının false vermesinin sebebini öğrenecez

        ŞİMDİLİK
        equals() String'leri karşılaştırırken sadece metinlere bakar
        == ise hem metinlere, hemde referanslara bakar
        bundan dolayı aynı metin olsa bile bazen true bazen false verir
         */

        System.out.println(str1 == str2); //false
        System.out.println(str1 == str3); //true
        System.out.println(str1 ==str4); // false
        System.out.println(str1 == str5); // true
        System.out.println(str1 == str8); //false








    }
}
