package day04_IfStatements;

import java.util.Scanner;

public class C08_IfElseIfStatements {
    public static void main(String[] args) {

        //ögrencinin notu alıp geçtin veya kaldın yazdıralım
        //ögrenci 0'dan kücük veya 100'den buyuk bir not girerse
        //"geçersiz not" yazdıralım

        Scanner scanner = new Scanner (System.in);
        System.out.println(" lütfen notunuzu giriniz");

        double not = scanner.nextDouble();

        if (not > 0) {
            System.out.println("sınıfı geçtın");

        }else if (not < 50) {
            System.out.println("sınıfta kaldın");



        }

    }
}
