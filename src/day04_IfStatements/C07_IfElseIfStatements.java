package day04_IfStatements;

import java.util.Scanner;

public class C07_IfElseIfStatements {
    public static void main(String[] args) {

        //kullanıcıdan pozitif bir tam sayı isteyin
        //sayı 3'e bölünüyorsa 3'e bölünür
        // sayı 5'e bölünüyorsa 5'e bölünür
        //hem 3, hem 5'e bölünüyorsa "süper sayı"
        //ne 3 ne de 5'e bölünüyorsa "cöpe at gitsin" yazdırın

        Scanner scanner =new Scanner(System.in);
        System.out.println("lütfen pozitif bir tam sayı girin");
        int girilenSayı = scanner.nextInt();

        if(girilenSayı % 3 ==0&& girilenSayı % 5== 0) {
            System.out.println("süper sayı");
        } else if (girilenSayı % 3== 0) {
            System.out.println("3'e bölünür");
        } else if (girilenSayı % 5 == 0 ) {
            System.out.println("5'e bölünür");
        } else {
            System.out.println("cope at gitsin");


        }
    }
}
