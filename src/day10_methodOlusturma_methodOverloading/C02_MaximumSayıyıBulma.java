package day10_methodOlusturma_methodOverloading;

import java.util.Scanner;

public class C02_MaximumSayıyıBulma {
    public static void main(String[] args) {

        //kullanıcıdan 3 sayı alıp
        //bu 3 sayıdan en buyuk olanı yazdıran bir method olusturun

        enBuyukSayıyıyazdır();


    }

    public static void enBuyukSayıyıyazdır(){

        Scanner scanner =new Scanner(System.in);
        System.out.println("en buyuk sayıyı bulmak için , 3adet sayıyı giriniz");
        double sayı1 = scanner.nextDouble();
        double sayı2 = scanner.nextDouble();
        double sayı3 = scanner.nextDouble();


        if (sayı1>sayı2 && sayı1>sayı3) System.out.println("en buyuk sayı" +sayı1);
        else if (sayı2>sayı1 && sayı2>sayı3) System.out.println("en buyuk sayı :" +sayı2);
        else if (sayı3>sayı1 && sayı3>sayı2) System.out.println("en buyuk sayı :"+sayı3);
        else System.out.println("en buyuk sayıyı bulamadım");

        }
    }

