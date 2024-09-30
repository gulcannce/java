package day5_nestedIfElseIf_ternary_switch;

import java.util.Scanner;

public class C09_switchStatements {
    public static void main(String[] args) {


        //kullanıcının girdiği gun numarasına göre
        // gun isimlerini yazdırın

        Scanner scanner = new Scanner (System.in);
        System.out.println("lütfen gün numarasını giriniz");
        int gunNo  = scanner.nextInt();

        switch (gunNo) {

            case 1 :
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3 :
                System.out.println("çarşamba");
                break;
            case 4 :
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7 :
                System.out.println("pazar");
                break;
            default:
                System.out.println("yanlış gün sayısı");

        }


    }
}
