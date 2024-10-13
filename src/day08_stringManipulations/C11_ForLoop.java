package day08_stringManipulations;

import java.util.Scanner;

public class C11_ForLoop {

    public static void main(String[] args) {

        //kullanıcıdan tam pazitif bir tamsayı degeri isteyin
        //o sayıya kadar olan tüm pozitif tam sayıların toplamını yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen pozitif bir tam sayı yazın");
        int sayı = scanner.nextInt();

        int toplam = 0;

        for (int i = 1; 1 <=sayı ; i++){

            toplam += i ;
            System.out.println(sayı + "'ye kadar olan pozitif tamsayıların toplamı :" + toplam);

        }
    }
}
