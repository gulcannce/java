package day02_scanner_DataCasting;

import java.util.Scanner;

public class C01_Scanner

{
    public static void main(String[] args) {

        // adım 1- kullanicideb uc farkli data turunde deger alip,
        //         girilen degerleri açıklamalarıyla yazdırın


        // adım 1 - scanner objesi olusturalım
        Scanner scanner = new Scanner(System.in);


        // adım 2 - kullanıcıya ne istediğini söyleyin
        System.out.println("Lutfen isminizi giriniz");


        // adım 3 - girilen bilgiye uygun bir variable oluşturup
        //          data turuna uygun next .... () ile bilgiyi alıp kaydedin
        String girilenIsım= scanner.next(); // sadece ilk ismi alınır

       ;


        // ikinci olarak tam sayı isteyelim mesela yasını isteyelim

        System.out.println("Lütfen yasınızı giriniz");
        int yas = scanner.nextInt();



        // Emekli misiniz? true /false

        System.out.println("emekli misiniz ? true veya false olarak giriniz");
        boolean  EmekliMi = scanner.nextBoolean();


        System.out.println("Girdiginiz isim : " + girilenIsım);
        System.out.println("yasınız: " + yas);
        System.out.println("emekli misiniz :" +   EmekliMi);








    }
}
