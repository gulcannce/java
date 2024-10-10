package day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C02_NestedForLoops {

    public static void main(String[] args) {


         /*
        kullanıcıdan satır ve sutun sayısını alıp
        asagıdaki gibi *'lardan olusan bir şekil cizdirin

        1 1 1 1 1
        2 2 2 2 2
        3 3 3 3 3

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("satır sayısını giriniz");
        int satır = scanner.nextInt();

        System.out.println("sutun sayısını giriniz");
        int sutun= scanner.nextInt();

        for (int i =1; i <=satır ; i++) { //satır

            for (int j = 1; j <=sutun ; j++){

                System.out.print(i + " ");
            }
            System.out.println("");


        }
    }
}
