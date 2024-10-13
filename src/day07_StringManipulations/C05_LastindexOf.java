package day07_StringManipulations;

import java.util.Scanner;

public class C05_LastindexOf {
    public static void main(String[] args) {

        //veriline bir cümlede
        //aranan bir metin için aşağıdaki cumlelerden
        //uygun olanı yazdıracak bir programı yazdırınız
        // -cümle aranan metni içermiyor
        // -cümlede aranan metin sadece 1 kere kullanılmış
        // _ cümlede aranan metin sadece 1den fazla kullanılmış

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cümle = scanner.nextLine();


        System.out.println("lütfen aranan metni giriniz");
        String metin =scanner.nextLine() ;


        int ilkIndex  = cümle.indexOf(metin) ;  //-1 veya index
        int sonindex  = cümle.lastIndexOf(metin) ; // -1 veya index

        if (ilkIndex == -1) {
            System.out.println("cümle aranan metni içermiyo");
        }else if (ilkIndex == sonindex) {
            System.out.println("cümlede aranan metin sadece 1 kere kullanılmış");

        }

    }
}
