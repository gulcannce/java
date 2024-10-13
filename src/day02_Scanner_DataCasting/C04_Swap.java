package day02_Scanner_DataCasting;

import java.util.Scanner;

public class C04_Swap {
    public static void main(String[] args) {

        // Soru 7 (interview)- kullanıcıdan ili sayı alıp
        //                     ikisinin değerlerini değitirin (swap).



        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen ilk tam sayıyı giriniz");
        int sayı1 = scanner.nextInt();

        System.out.println("lütfen ikinci tam sayıyı giriniz");
        int sayı2 = scanner.nextInt();

        System.out.println("girdiğiniz değerler : sayı1 = " + sayı1 +", sayı2= "+ sayı2);


        int bosKova = 0;

        bosKova = sayı2;

        sayı1 = bosKova;

        System.out.println("değiştirilen değerler : sayı1 = " + sayı1 +", sayı2= "+ sayı2);




    }
}
