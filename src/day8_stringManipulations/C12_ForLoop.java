package day8_stringManipulations;

import java.util.Scanner;

public class C12_ForLoop {

    public static void main(String[] args) {

        //soru 3- kullanıcıdan başlangıc ve bitiş değeri olarak pozitif sayılar alın,
        //sınırlar dahil olarak aralarındaki tum sayıların toplamını yazdırın.
        //bitiş değeri başlangıc degerinden kücükse, uyarı yazdırıp işlemi sonlandırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("başlangıç değeri giriniz" );
        int bas = scanner.nextInt();

        System.out.println("bitiş değeri giriniz");
        int bitiş = scanner.nextInt();

        int toplam = 0;

        if (bitiş < bas) {
            System.out.println("bitiş değeri başlangıç değerinden kucuk olmaz");
        }else  //bu durum toplam heseplayacağımız durumdur

        for (int i = bas; i<=bitiş ; i++){

            toplam +=i;

            System.out.println("girilen aralıktaki sayıların toplamı :" + toplam);
        }



    }
}
