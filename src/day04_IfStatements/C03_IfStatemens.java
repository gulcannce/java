package day04_IfStatements;

import java.util.Scanner;

public class C03_IfStatemens {
    public static void main(String[] args) {

        // soru 5- kullanıcıdan notunu alin 50 veya daha yuksekse "sınıfı geçtin",
        //         50'den küçükse "malesef kaldın" yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");

        double not = scanner.nextDouble();

        if (not >= 50) {
            System.out.println("sınıfı geçtin");

            if (not<50) {
                System.out.println("Maalesef kaldın");


            }
        }

    }}