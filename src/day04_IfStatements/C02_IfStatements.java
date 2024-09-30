package day04_IfStatements;

import java.util.Scanner;

public class C02_IfStatements {

    public static void main(String[] args) {

        //soru 4- kullanıcıdan bir üçgenin 3 kenar uzunluğu alın ,
        //        ucgen eskenar ise "Eskenar ucgen " yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen ucgenin kenar uzunluklarını giriniz");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        //java 2'li karşılaştırmaları kabul eder
        //daha fazla karşılaştırmaya ihtiyaç varsa
        //mantıksal operatorler kullanılarak sartlar ayrı ayrı yazılıp, birleştirilir

        if (kenar1==kenar2 && kenar2== kenar3 && kenar2>0);
        System.out.println("verilen kenar uzunlukları es kenar ucgen oluşturur");






        {

        }

    }
}
