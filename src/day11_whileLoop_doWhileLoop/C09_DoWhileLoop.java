package day11_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C09_DoWhileLoop {
    public static void main(String[] args) {

        //kullanıcıdan toplanmak uzere sayılar isteyin
        //kullanıcı 0'a basıncaya kadar islemi tekrar ettirin
        //kullanıcı =2a bastığında girilen sayıların toplamını yazdırın

        Scanner scanner = new Scanner(System.in);
        int toplam= 0;
        int sayı ;


        do{
            System.out.println("lütfen toplanmak uzere bir sayı giriniz\nişlemi bitirmek için 0'a basın");
            sayı = scanner.nextInt();

            toplam += sayı;

        }while (sayı !=0);

        System.out.println("girilen sayıların toplamı:" + toplam);

    }
}
