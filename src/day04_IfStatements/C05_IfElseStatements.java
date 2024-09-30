package day04_IfStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {

        //soru 4- kullanıcıdan bir karakter girmesini isteyin,
        //        girilen karakterin buyuk harf olup olmadığını yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");

        char krk = scanner.next(). charAt(0);

        if(krk >='A' && krk <= 'Z') {
            System.out.println("girilen karakter buyuk harf");
        }else {

            System.out.println("girilen karakter buyuk harf değil");










        }

    }
}
