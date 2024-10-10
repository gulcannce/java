package day11_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {

        //kullanıcıdan bir şifre isteyip,
        //asağıdaki şartları kontrol edin ve
        //kullanıcıya düzeltmesi gereken tüm eksikleri soyleyin, ve yeni deger isteyin
        //eger tüm şartları saglarsa
        // -ilk harf kucuk harf olmalı
        // -son karakter rakam olmalı
        // -sifre bosluk icermemeli
        // -uzunlugu en az 10 karakter olmalı

        Scanner scanner = new Scanner(System.in);
        String sifre = " "; // sartları sağlamayan bir ilk deger atamsı yaptık

        while (!sifreyiKontrolEt(sifre)){
            System.out.println("lütfen sifreyi giriniz");
            sifre = scanner.nextLine();


        }

    }
    //bu class'da girilen sifreyi kontrol edip
    //uygun sifre ise true, degilse false donduren bir method olusturalım

    public static boolean sifreyiKontrolEt(String sifre) {

        //flag kullanalım
        int flag = 10;

        // -ilk harf kucuk harf olmalı

        char ilkHarf = sifre.charAt(0);

        if (!(ilkHarf >= 'a' && ilkHarf <= 'z')) {
            System.out.println("ilk karakter kucuk harf olmalı");
            flag = 11;

        }

        // -son karakter rakam olmalı

        char sonKarakter = sifre.charAt(sifre.length() - 1);
        if (!(sonKarakter >= '0' && sonKarakter >= '9')) {
            System.out.println("son karakter rakam olmalı");
            flag = 11;

        }
        // -sifre bosluk içermemeli

        if (sifre.contains(" ")) {
            System.out.println("şifre boşluk içermemeli");
            flag = 11;

        }
        // -uzunluğu en az 10 karakter olmalı

        if (sifre.contains(" ")) {
            System.out.println("şifre boşluk içermemeli");
            flag = 11;

        }
        //bagımsız if cumlelerinden sonra
        //flag ya 10 degerinde olacak yada 11
        if (flag == 10) {
            return true;
        }else {
            return false;
        }


        }
    }

