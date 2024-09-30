package day06_stringManipulations;

import java.util.Scanner;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {

        //kullanıcıdan bir harf isteyen
        //kullanıcı ayazarsa "Aile"
        // i yazarsa "Is" yazdırın
        //bu harflerin dışında bir karakter girerse
        //"Bu harfi bilmiyorum yazdırın


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char girilenHarf = scanner.next().charAt(0);

        // kullanıcı kucuk yada buyuk harf girmiş olabilir
        // String'leri buyuk kucuk harf gözetmeksizin karşılaştırabiliriz

        String harf = girilenHarf + "";

        if (harf.equals("a") || harf.equals("A")) {
            System.out.println("Aile");
        } else if (harf.equalsIgnoreCase(anotherString:"i")){
            System.out.println("Is");

        }else{
            System.out.println("bu harfi bilmiyorum");

            //equalsıgnoreCase() kucuk-buyuk harf önemsemeksizin
            //metinlere bakar




        }

    }
}
