package day12_scope;

import java.util.Scanner;

public class C01_whileLoop {

    public static void main(String[] args) {

        //kullanıcıdan toplanmak üzere tam sayılar isteyin
        //toplam 500 oldugunda ve gectiğinde islemi durdurup
        //kaç sayı girildiğini ve toplamlarını yazdırın

        Scanner scanner = new Scanner(System.in);
        int sayı = 0;
        int toplam = 0;
        int sayac =0;

        while (toplam > 500){

            System.out.println("lütfen toplanmak üzere sayı giriniz");
            sayı = scanner.nextInt();
            toplam += sayı ;
            sayac ++;

        }
        System.out.println(sayac+ "adet sayı girdiniz, sayıların toplamları :" + toplam);


    }
}
