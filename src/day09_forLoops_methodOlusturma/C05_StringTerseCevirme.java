package day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C05_StringTerseCevirme {

    public static void main(String[] args) {

        //soru10- (interview) -kullanıcıdan bir string isteyin
        // ve stringi tersine cevirim kaydedin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen terse cevirmek için bir metin yazınız");
        String girilenMetin = scanner.nextLine();

        // ali topu at
        //ta upot ila

        //tersmetin = "";+t+A+ + u+p ....+a

        String tersMetin="" ;

                for (int i = girilenMetin.length()-1; i >=0 ; i--){

                    tersMetin += girilenMetin.charAt(i);

                }
        System.out.println("girilen metnin ters hali :"+ tersMetin);

                //tersi ile duzden yazılısı aynı olan metinlere palindrome denir
        //girilen metnin palindrome olup olmadığını yazdıralım

        if (girilenMetin.equalsIgnoreCase(tersMetin)) {
            System.out.println("girilen metin palindrome");
        }else {
            System.out.println("girilen metin palindrome değil");

        }

    }
}
