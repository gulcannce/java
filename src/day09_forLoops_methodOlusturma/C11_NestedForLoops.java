package day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C11_NestedForLoops {
    public static void main(String[] args) {

          /*
        kullanıcıdan satır sayısını alıp
        asagıdaki gibi *'lardan olusan bir şekil cizdirin

        1
        1 4
        3 6 9
        4 8 12 16

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("satır sayısını giriniz");
        int satır = scanner.nextInt();

        for (int i = 1; i <= satır; i++) {

            for (int j = 1; j <= i; j++)

                System.out.println(" ");
        }
        System.out.println("");

    }
}
