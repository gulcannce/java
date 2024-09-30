package day03_WrapperClass_Matematikselislemler;

import java.util.Scanner;

public class C03_SayınıRakamToplamınıBulma {

    public static void main(String[] args) {

        // kullanıcıdan 3 basamaklı pozitif bir tam sayı alıp
        // sayının rakamlar toplamını yazdırın

        Scanner scanner  = new Scanner(System.in);

        System.out.println("lütfen 3 basamaklı pozitif bir tam sayı giriniz");

        int girilenSayi = scanner.nextInt();

        int rakamlarToplamı = 0;
        int rakam = 0;

        rakam = girilenSayi % 10 ;
        rakamlarToplamı = rakamlarToplamı + rakam ;
        girilenSayi = girilenSayi / 10;


        // girilen sayı: 257, oldu rakam  : 0 , rakamlar toplama = 0

        rakam = girilenSayi % 10 ; //7
        rakamlarToplamı = rakamlarToplamı + rakam ; // 0 + 7= 7
        girilenSayi = girilenSayi / 10; // 257 / 10 ==> 25,7 ==> 25

        // girilen sayı: 25, oldu rakam  : 7  , rakamlar toplama = 7

        rakam = girilenSayi % 10 ; // 25 % 10 ==> 5
        rakamlarToplamı = rakamlarToplamı + rakam ; // 7+ 5 ==>12
        girilenSayi = girilenSayi / 10 ; // 25 / ==> 2

        System.out.println("girilen sayının rakamları toplamı : "  + rakamlarToplamı);






    }
}
