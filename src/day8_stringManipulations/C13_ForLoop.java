package day8_stringManipulations;

import java.util.Scanner;

public class

C13_ForLoop {

    public static void main(String[] args) {


        //Soru 4- kullanıcıdan başlangıç ve bitiş değeri olarak pozitif sayıları alın
        //sınırlar dahil olarak aralarındaki tüm sayıların toplamını yazdırın
        //bitiş değeri başlangıç değerinden kücük olsa da çalışsın

        Scanner scanner = new Scanner(System.in);
        System.out.println("başlangıç değeri giriniz");
        int bas = scanner.nextInt();

        System.out.println("bitiş değeri yazdırın");
        int bitis = scanner.nextInt();

        int toplam = 0;

        if (bitis > bas) { // bitiş değeri başlangıçtan buyuk

            for (int i = bas; i <= bitis; i++) {


            }

            }else{ //bitis değeri başlangıctan kucuk
                for (int i = bitis; i <= bas; i++) {
                    toplam += i;

                    System.out.println("verilen aralıktaki sayıların toplamı");


                }


            }
        }
    }
