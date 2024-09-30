package day04_IfStatements;

import java.util.Scanner;

public class C04_IfElseStatements {
    public static void main(String[] args) {

        //soru 1- kullanıcıdan bir ucgenin 3 kenar uzunluğunu alın,
        //        ucgen eskenar ise "eskenar ucgen" yazdırın,
        //        değilse "eskenar değil" yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen ucgenin kenar uzunluklarını giriniz ");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1 == kenar2 && kenar1 == kenar3 && kenar1 > 0) ;
        System.out.println("eskenar ucgen");









    }


}












