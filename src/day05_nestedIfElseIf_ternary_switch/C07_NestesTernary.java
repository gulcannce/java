package day05_nestedIfElseIf_ternary_switch;

import java.util.Scanner;

public class C07_NestesTernary {
    public static void main(String[] args) {

        // kullanıcıdan bir tam sayı alın
        //sayı pozatifse 100 den buyuk veya küçük olduğunu yazdırın
        //sayı negatif ise çift veya tek olduğunu yazdırın

        Scanner scanner =new Scanner(System.in);
        System.out.println("lütfen bir tam sayı giriniz");
        int sayı = scanner.nextInt();

        System.out.println(
                sayı > 0

                ?
                    // sayı 0'dan buyukse yazdırılacak kısım
               sayı <100 ? "sayı buyuk" : "sayı kucuk"
                :
                // sayı negatifse
                 sayı  %2 == 0 ? "sayı cift" : "sayı tek"
        );


         /*
          System.out.println(
          sayı > 0 ? "sayı sayı>100 ? "sayı buyuk" : sayı %2 == 0 ? "sayı cift" : "sayı tek"

          */




    }
}
