package day5_nestedIfElseIf_ternary_switch;

import java.util.Scanner;

public class C11_SwitchStatements {
    public static void main(String[] args) {

        // soru 4- kullanıcıdan ISTQB kısaltmasındaki harflerden,
        // anlamını öğrenmek istediği harfi alın
        // ve girilen harfin karşılığını yazdırın
        // I : ınternational  S  : Software T : Testing Q : Qualifications B : Board


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen anlamını öğrenmek için istediğiniz harfi giriniz");
        char harf = scanner.next ().charAt(0);

        switch (harf){
            case 'I' :
            case'i' :
                System.out.println("international");
                break;
            case 's' :
            case 'S' :
                System.out.println("Software");
                break;
            case'T' :
            case't':
                System.out.println("testing");
                break;
            case'Q' :
            case'q' :
                System.out.println("Quarlifications");
                break;
            case 'B' :
            case 'b':
                System.out.println("board");
                break;
            default:
                System.out.println("lütfen ISTQB kısaltmadaki harflerden birini yazınız");






        }


    }
}
