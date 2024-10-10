package day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C09_NestedForLoops {
    public static void main(String[] args) {

         /*
        kullanıcıdan satır sayısını alıp
        asagıdaki gibi *'lardan olusan bir şekil cizdirin

        1
        1 2
        1 2 3 4

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("satır sayısını giriniz");
        int satır = scanner.nextInt();

        //ucgen sekiller için de nested for loops kullanılır
        //dikdörtgenden farklı, sutun nosuna ihtiyacımız yoktur
        //her satırdaki sutun sayısı o satırın nosu ile aynıdır

        for (int i = 0; i <=satır ; i++) {

            for (int j = 1; j <= i ; j++) { // satır
                System.out.print(j + " "); //her satırda satır numarasına kadar sutun ıldugu için
            }
            System.out.println("");


        }
    }
}
