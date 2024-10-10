package day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C02_faktoryelYazdırma {

    public static void main(String[] args) {

        //soru 6-kullanıcıdan 20'dan kucukkucuk bır sayı alıp,
        //bu sayının faktoryel degerini hesaplayın.
        //konsolda faktoryel degerini hesaplayın.
        // or . 6! = 6 * 5 * 4 * 3 * 1 =720

        Scanner sacenner =new Scanner(System.in);
        System.out.println("lütfen 20'den kucuk  pozitif bır tam sayi giriniz");
        int sayi = sacenner.nextInt();

        long faktoryelsonucu=1;

        System.out.println(sayi+"!= "); //6! =

        for (int i =sayi; i >=1 ; i --) {

            faktoryelsonucu *= i;
            if (i != 1) {

                System.out.print(i + " *");
            }else {
                System.out.print(i +"=");
            }
            System.out.println(faktoryelsonucu);


        }


    }
}
