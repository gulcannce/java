package day05_nestedIfElseIf_ternary_switch;

import java.util.Scanner;

public class C10_SwitchStatements {
    public static void main(String[] args) {


        //kullanıcının girdiği gun numarasına göre
        // gun isimlerini yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen gün numarasını giriniz");
        int gunNo = scanner.nextInt();

        switch (gunNo) {

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("hafta içi");
                break;
            case 6:
            case 7:
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("yanlış gün sayısı");


                /*
                gun isminin bas harfini alın s S
                case s || S : OLMAZ
                case s,S : OLMAZ

                case s :
                case S :


                 */






        }
    }
}