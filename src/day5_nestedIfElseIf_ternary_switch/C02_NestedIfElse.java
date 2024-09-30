package day5_nestedIfElseIf_ternary_switch;

import java.util.Scanner;

public class C02_NestedIfElse {
    public static void main(String[] args) {

        //soru 1- kullanıcıdan cinsiyetini ve yasını giriniz
        //        kadın,60 yas üzeri, erkek 65 yas ve üzeri emekli olabilir
        //        cinsiyet ve yasını dikkate alarak
        //        "Emekli olabilirisn" ve ya "emekli olmak için .. yıl daha çalışman gerekir" yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi girinizi E : Erkek K :Kadın ");
        char cinsiyet = scanner.next().toUpperCase().charAt(0); //kullanıcı nasıl girerse girsin büyük

        System.out.println("lütfen yaşınızı giriniz");
        double yas = scanner.nextDouble();


        if (cinsiyet == 'E') { // sadee erkekler

            if (yas < 20 || yas > 80) {
                System.out.println("yas girişi hatalı");
            } else if (yas >= 65) {
                System.out.println("Erkek emekli olabilir");
            } else {
                System.out.println("erkek emkeli olmak için daha " + (65 - yas) + "yıl çalışmalıdır");
            }


            } else if (cinsiyet == 'K') { // sadece kadınlar

                if (yas < 20 || yas > 80) {
                    System.out.println("yas girişi hatalı");
                } else if (yas >= 60) {
                    System.out.println("kadın emekli olabilir");
                } else {
                    System.out.println("kadın emekli olmak için daha" + (60 - yas) + "yıl çalışmalıdır");
                }
                } else{
                    System.out.println("cinsiyet için girilen deger yanlış");
                }
            }
        }













