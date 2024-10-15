package day19_passbyValue;

import java.sql.SQLOutput;

public class C02_PassByvalue {

    public static void main(String[] args) {
        int sayı = 20;

        System.out.println("method call oncesi sayı : " + sayı); //20

        System.out.println("method return degeri "+sayıDegıstır(sayı)); //25

        System.out.println("method call sonrası sayı :" + sayı); // 20

        sayı = sayıDegıstır(sayı);

        System.out.println("atama sonrası sayı :" + sayı); // 25

    }
    public static int sayıDegıstır(int sayı){
        sayı +=5;

        System.out.println("method icinde sayı :" + sayı);

        return sayı;
    }
}
