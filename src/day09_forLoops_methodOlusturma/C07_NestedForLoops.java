package day09_forLoops_methodOlusturma;

import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class C07_NestedForLoops {

    public static void main(String[] args) {

        /*
        kullanıcıdan satır ve sutun sayısını alıp
        asagıdaki gibi *'lardan olusan bir şekil cizdirin

        * * * *
        * * * *
        * * * *

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("satır sayısını giriniz");
        int satır = scanner.nextInt();

        System.out.println("sutun sayısını giriniz");
        int sutun = scanner.nextInt();


        //satır = 5 sutun =9

        for (int i = 1; i <= satır; i++) {//satır
            for (int j = 1; j <= sutun; j++) {

                System.out.println("* ");

            }
            System.out.println("");
        }
    }


    }

