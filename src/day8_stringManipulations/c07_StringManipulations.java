package day8_stringManipulations;

import java.util.Scanner;

public class c07_StringManipulations {

    public static void main(String[] args) {

        //soru 4- : kullanıcıdan bir şifre isteyip,
        //aşagıdaki şartları kontrol edin ve
        //kullanıcıya düzeltmesi tüm eksikleri söyelyin,
        // eger tüm şartları sağlarsa, "şifre başarıyla kaydedildi" yazdırın
        //          -ilk harf kucuk harf olmaslı
        //          -son karakter rakam olmalı
        //          -şifre boşluk içermemeli
        //          -uzunluğu en az 10 karakter olmalı

        //flag kullanalım
        int flag = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("lüfen şifrenizi giriniz");
        String sifre = scanner.nextLine();

        //     -ilk harf kucuk harf olmalıdır
        char ilkHarf = sifre.charAt(0);

        if (!(ilkHarf >= 'a' && ilkHarf <= 'z')) {

            System.out.println("ilk karakter kücük harf olmalı");
            flag = 11;


            //       -son karakter rakam olmalı

            char sonKarakter = sifre.charAt(sifre.length() - 1);

            if (!(sonKarakter >= '0' && sonKarakter <= '9')) {
                System.out.println("son karakter rakam olmalı");

                flag = 11;


                //      -şifre boşluk içermemeli

                if (sifre.contains("")) {
                    System.out.println("şifre boşluk içermemeli");
                    flag = 11;

                    //     -uzunluğu en az 10 karakter olmalı

                    if (!(sifre.length() >= 10)) { // sifre.lenght()<10
                        System.out.println("şifrenin uzunluğu en az 10 karakter olmalı");
                        flag = 11;

                        //bağımsız if cümlelerinden sonra
                        //flag ya değerinde olacak yada 11
                        if (flag == 10) {
                            System.out.println("şifre başarıyla kaydedildi");
                        }

                    }
                }
            }
        }
    }
}






