package day11_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C07_whileLoop {
    public static void main(String[] args) {

        //kullanıcıdan bir sayı ve hesaplamak istediği ussunu isteyin
        // while loop kullanarak verilen sayının istenen ussunu hesaplayıp yazdırın
        // bir method oluşturun

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir us hesaplamak ıstedğiniz pozitif tam sayıyı giriniz");
        int sayı = scanner.nextInt();

        System.out.println("lütfen bir us hesaplamak ıstedğiniz pozitif tam sayıyı giriniz");
        int us = scanner.nextInt();

        ushesapla(sayı, us);

    }
    public static void ushesapla(int sayı, int us){

        //sayı 3 us 5 olsa 3 * 3 * 3 * 3 * 3
        int sonuc =1;
        int geciciUs = us;

        while (geciciUs>0){
            sonuc *= sayı;
            geciciUs--;

        }
        System.out.println(sayı +" uzeri " + us + " : " + sonuc);
    }
}
