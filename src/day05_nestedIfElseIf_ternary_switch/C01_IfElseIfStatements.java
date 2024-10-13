package day05_nestedIfElseIf_ternary_switch;

import java.util.Scanner;

public class C01_IfElseIfStatements {
    public static void main(String[] args) {
        // soru 1- kullanıcıdan cinsiyetini ve yasını alın,
        //         kadın,60yas ve üzeri, erkek 65 yas ve üzeri emekli olabilir.
        //         cinsiyet ve yasını dikkate alarak
        //         "emekli olabilirsin" veya "emekli olmak iiçi.... şu kadar yıl çalışman gerekir" yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi girinizi E : Erkek K :Kadın ");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("lütfen yaşınızı giriniz");
        double yas = scanner.nextDouble();

        if (yas < 20 || yas > 80 || !(cinsiyet == 'E' || cinsiyet == 'K')) {
            System.out.println("girilen bilgilerde hata var");
        } else if (cinsiyet == 'E' && yas >= 60) {
            System.out.println("Erkek emekli olabilir");
        } else if (cinsiyet == 'E' && yas < 65) {
            System.out.println("emekli olmak için" + (65 - yas) + "yıl çalışmalıdır");
        } else if (cinsiyet == 'K' && yas >= 60) {
        } else {
            System.out.println("kadın emekli olmak için daha " + (60 - yas) + "yıl çalışmalıdır");










        }


    }
}
