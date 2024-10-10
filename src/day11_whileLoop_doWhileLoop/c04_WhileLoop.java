package day11_whileLoop_doWhileLoop;

import day10_methodOlusturma_methodOverloading.C05_AsalSayıMıDondur;

import java.util.Scanner;

public class c04_WhileLoop {
    public static void main(String[] args) {

        //kullanıcıdan bir asal sayı girmesini isteyin
        //kullanıcı asal sayı girmezse "bu asal değil , tekrar denen" yazdrın
        //kullanıcı asal sayı girdiğinde, "islem basarılı olarak tamamlandı" yazdırın

        Scanner scanner =new Scanner(System.in);
        int sayı =6;

        while (C05_AsalSayıMıDondur.asalMıDondur(sayı)){

            System.out.println("lütfen asal bir sayı giriniz");
            sayı = scanner.nextInt();

            if (C05_AsalSayıMıDondur.asalMıDondur(sayı)) {
                System.out.println("işlem basarılı olarak tamamlandı");
            }else {
                System.out.println("bu asal sayı degil tekrar dene");

            }

        }
    }
}
