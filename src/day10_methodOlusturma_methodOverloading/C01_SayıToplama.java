package day10_methodOlusturma_methodOverloading;

import java.util.Scanner;

public class C01_SayıToplama {
    public static void main(String[] args) {

        //verilen iki sayıyı toplayı,sonucu yazdıran bir method olusturun

        toplaYazdır(5,6.4); //verilen iki sayının toplamı : 11.4
        toplaYazdır(7,6); //verilen iki sayının toplamı :13.0

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen toplanmak üzere iki sayı giriniz");
        double sayı1 = scanner.nextDouble();
        double sayı2 =scanner.nextDouble();

        toplaYazdır(sayı1,sayı2);


    }//main method sonu

    public static  void toplaYazdır(double sayı1, double sayı2){

        System.out.println("verilen iki sayının toplamı :" +(sayı1+sayı2));
    }



}
