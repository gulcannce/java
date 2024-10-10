package day7_StringManipulations;

public class C04_LastindexOf {

    public static void main(String[] args) {

        String str = "Java Candır, Selenium heyecan";

        //str a ile mi başlar ?

        System.out.println(str.startsWith("a")); //false

        //a'nın ilk kullanıldığı index' yazdırın

        System.out.println(str.indexOf("a")); // 1

        //str a ile mi biter ?

        System.out.println(str.startsWith("a")); //false

        // a'nın son kullanımının index'ini yazdırın

        System.out.println(str.lastIndexOf("a")); // 27

        //can kelimesinin ilk index'ini bulun
        System.out.println(str.indexOf("can")); //5

        // can kelimesinin son kullanımının indexini yazdırın
        System.out.println(str.lastIndexOf("can")); //25

        // selenium kelimesnin ilk kullanım ve son kullanım indexini yazdırın
        System.out.println("Selenium"); // 13
        System.out.println(str.lastIndexOf("selenium"));




    }
}
