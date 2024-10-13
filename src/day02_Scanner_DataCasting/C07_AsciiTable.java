package day02_Scanner_DataCasting;

import java.util.Scanner;

public class C07_AsciiTable {
    public static void main(String[] args) {

        char chr1 ='a';
        char chr2 ='b';

        System.out.println(chr1 + chr2); // 97 + 98 = 195

        int sayi1 = chr1 ;

        /*
            char data turu özel bir duruma sahiptir
            eger char data turundeki bir degeri
            matematiksel bir degere sokarsanız
            veya sayısal bir data turune atama yaparsanız
            ASCİİ TABLE' daki degeri ile isleme girer

         */

        System.out.println("char 'a' nin int karşılığı :" + sayi1);
        //char 'a' nın int karşılığı : 97

        //kullanıcıdan bir char alıp
        //ascii table 'da karaekterden sonra gelen 3 karekteri yazdırın

        Scanner scanner = new  Scanner (System .in);
        System.out.println("lütfen ascii table'dan bir karakter giriniz");
        char krk = scanner.next().charAt(0);


        System.out.println("girilen karakterden 1 sonraki karakter : "+(char)(krk + 1));
        System.out.println ("girilen karakterden 2 sonraki karakter : "+(char)(krk + 2));
        System.out.println ("girilen karakterden 3 sonraki karakter : "+(char)(krk + 3));



    }
}
