package day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C04_Rakamlartoplamı {
    public static void main(String[] args) {

        // kullanıcıdan 3 basamaklı pozitif bir tamsayıyı yazdırın
        //sayini rakamlar toplamını yazın

        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen 3 basamaklı pozitif bir tam sayi giriniz");

        int girilenSayı = scanner.nextInt();

        int rakamlartoplamı =0;
        int rakam =0 ;

        for (int i = girilenSayı; i >0 ; i /=10){

            rakam = i %10;
            rakamlartoplamı += rakam;
        }
        System.out.println(girilenSayı + " sayısının rakamlar toplamı :" + rakamlartoplamı);

        //aynı soruyu basamak sayısı kadar tekrar ederek çözelim

        rakamlartoplamı = 0;
                rakam = 0;
                int basamakSayısı =(girilenSayı+"").length();
                int sayı = girilenSayı ;

                //1234 basamak sayısı : 4
        for (int i = 1; i <=basamakSayısı ; i++) {
            rakam = sayı % 10;
            rakamlartoplamı +=rakam;
            sayı/=10;
        }

        System.out.println(girilenSayı + "sayının rakamlar toplamı :" + rakamlartoplamı);






    }
}
