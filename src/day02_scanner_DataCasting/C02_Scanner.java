package day02_scanner_DataCasting;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        // Soru 4 - Kullanıcıdan bir dikdörtgenin iki kenar uzunluğunu alıp ,
        // dikdörtgenin alanını yazdırın.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen dikdörtgenin kenar uzunluklarını giriniz");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();

        System.out.println("dikdörtgenin alanı : " + kenar1*kenar2);





    }

        
}

