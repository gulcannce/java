package day09_forLoops_methodOlusturma;

import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class C010_NestdeForLoops {
    public static void main(String[] args) {

          /*
        kullanıcıdan satır sayısını alıp
        asagıdaki gibi *'lardan olusan bir şekil cizdirin

        *
        * *
        * * *
        * * * *

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("satır sayısını giriniz");
        int satır = scanner.nextInt();

        for (int i = 1; i <= satır; i++) { //satır

            for (int j = 1; j <= i; j++) { //sutun

                System.out.println("* ");
            }
        }
    }
}
