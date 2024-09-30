package day02_scanner_DataCasting;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        // Soru 5- kullanıdan ismini, soyismini ve yasını alıp asağıdaki formatta yazdırın.
        //         girilen bilgiler : J Doe, 44

        Scanner scanner = new  Scanner(System.in);

        System.out.println("lütfen isminizi giriniz");
        char ilkHarf = scanner.nextLine().charAt(0);

        System.out.println("lütfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();

        System.out.println("lütfen yasınızı giriniz");
        int yas = scanner.nextInt();

        System.out.println("girilen bilgiler" + ilkHarf +" " +soyisim+" , "+yas);



    }
}
