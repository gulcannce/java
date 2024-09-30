package day04_IfStatements;

import java.util.Scanner;

public class C06_IfElseStatements {
    public static void main(String[] args) {

        // soru 5- kullanıcıdan bir karakter isteyin,
        //         girilen karakter küçük harf ise onu büyük harf olarak yazdırın,
        //         yoksa girilen karakteri yazdırın

        Scanner scanner =new Scanner (System.in);
        System.out.println("lütfen bir karakter giriniz");
        char krk = scanner.next().charAt(0);

        if (krk>= 'a' && krk <='z') {
            System.out.println(Character.toUpperCase(krk));
        }else{
            System.out.println(krk);


        }


    }
}
