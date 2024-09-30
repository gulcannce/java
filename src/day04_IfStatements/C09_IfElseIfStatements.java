package day04_IfStatements;

import java.util.Scanner;

public class C09_IfElseIfStatements {
    public static void main(String[] args) {

        //soru 2- kullanıcının kilo (kg) ve boyunu (cm)isteyip
        //        vucut kitle endeksini hesaplayın (kilo*1000 / (boy *boy))
        //        vucut kitle endeksi
        //       - 30'dan buyukse obez
       //        - 25-30 arası kilolu
        //       -20-25 arası ise normal,
        //       - 20 den küçükse zayıf yazdırın.

        Scanner scanner  = new Scanner(System.in);
        System.out.println("lütfen kg olarak giriniz");
        double kilo = scanner.nextDouble();

        System.out.println("lütfen cm olarak boyunuzu giriniz");
        double boy = scanner.nextDouble();

        double vke = (kilo *10000 / (boy * boy)) ;

        if (kilo < 20 || kilo>200 || boy > 200 || vke<10 || vke>50) {
            System.out.println("vucut kitle endeksi : " + vke+"sonuç : obez");
        }else if (vke >30 ) {
            System.out.println("vucut kitle endesiniz : " + vke+"sonuç : kilolusunuz") ;
        }else if (vke > 25) {
            System.out.println("vucut kitle endesiniz : " + vke+"sonuç : kilonuz normal sınırlar içinde");
        }else if (vke>20 ) {
            System.out.println("vucut kitle endesiniz : " + vke+"sonuç : zayıfsınız");

        }else {
            System.out.println("zayıfsınız");

        }



    }
}
