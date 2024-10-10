package day11_whileLoop_doWhileLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {


        //kullanıcıdan toplanmak uzere sayılar isteyin
        //kullanıcı 0'a basıncaya kadar islemi tekrar ettirin
        //kullanıcı =2a bastığında girilen sayıların toplamını yazdırın


        //dongunun kaç kere çalışacağı belli olmayan islemlerde while loop tercih edilir

        Scanner scanner = new Scanner(System.in);
        double sayı = 1;
        double toplam = 0;
    /*
        kullanıcıdan alacağımız sayı 0 olmadığı sürece kod calışacak
        Loop'da once bu sayıyı olusturmamız gerekir ki
        while() içinde kullanabilelim

        NOT : ilk deger ataması yaparken
        Loop'un ilk çalışmasını angellemeyecek bir deger atamaya
        DİKKAT EDİLMELİDİR
     */


        while (sayı != 0) {

        }

        {//kullanıcı 0'a basıncaya kadar

            System.out.println("toplanmak üzere sayılar giriniz\nbitirmek için 0'a basınız");

            sayı = scanner.nextDouble();

            toplam += sayı;

            System.out.println("girilen sayıların toplamı :" + toplam);
        }

    }
}



