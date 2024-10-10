package day11_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {

        //While loop kullanarak
        //kullanıcıdan alınan sayının rakamalar toplamını bulun

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen rakamlar toplamını bulmak için bır sayı giriniz");
        int girilenSayı = scanner.nextInt();

        int rakam =0;
        int rakamlarToplamı = 0;
        int geciciSayı = girilenSayı;

        while (geciciSayı>0){

            rakam = geciciSayı%10;
            rakamlarToplamı  += rakam ;
            geciciSayı /= 10;

            System.out.println(girilenSayı+"sayının rakamlar toplamı:" + rakamlarToplamı);

        }

    }
}
