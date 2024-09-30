package day5_nestedIfElseIf_ternary_switch;

import java.util.Scanner;

public class C08_Ternary {
    public static void main(String[] args) {

        // soru 5- kullanıcıdan 2 sayı alın ve buyuk olmayan sayıyı yazdırın
        /*
        buyuk olmayan demekle kucuk olan demek farklıdır
        cunku  9 9  verildiğinde buyuk olmayan 9
                                 kucuk olan
         */

        Scanner scanner =new Scanner( System.in);
        System.out.println("lütfen iki sayı giriniz");
        double sayı1 = scanner.nextDouble();
        double sayı2 = scanner.nextDouble();

        System.out.println(sayı1 > sayı2 ? sayı2  : sayı1);



    }
}
