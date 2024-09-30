package day5_nestedIfElseIf_ternary_switch;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {

        // soru 2- kullanıcıdan bir ucgenin 3 kenar uzunluğunu alın
        //         ucgen eskenar ise "eskenar ucgen" yazdırın,
        //         değilse "eskenar değil" yazdırın

        Scanner scanner = new Scanner(System.in);


        System.out.println("lütfen ücgenin kenar uzunluklarını giriniz");
        double kenar1 = scanner.nextByte();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        System.out.println(kenar1==kenar2 && kenar1==kenar3 && kenar1>0 ?
                "eskenar ucgen"
                :
                "eskenar değil"
                 );
    }
}
