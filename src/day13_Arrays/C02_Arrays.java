package day13_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        int sayı =10;

        int[]arr = {4,6,1,2};

        // bu array'ı yazdıralım

        System.out.println(sayı); //10

        System.out.println(arr); // hata verir

        //Array'ler dirik yazdırılamaz
        //direk yazdırmak isterseniz, array'ı degil referansını yazdırır

        // Array'ı yazdırmak için Array cllas'ından yardım almalıyız

        System.out.println(Arrays.toString(arr)); //[4, 6, 1, 2]

        String[] kelimeler ={"Ali", ", okula", "gitti."};
        System.out.println(Arrays.toString(kelimeler)); // [Ali,   okula,  gitti.]

        //Arrays'ın elementlerini yazdırın
        System.out.println(arr[0]); //4
        System.out.println(arr[1]); //6
        System.out.println(arr[2]); //1
        System.out.println(arr[3]); //2
        System.out.println("============");
        //bunun yerine,

        for (int i = 0; i < arr.length; i++) { //kısa yoldan bunu yazabiliriz
            System.out.println(arr[i]);
        }// 4 6 1 2

        /*
            biz ne zaman Array'ın tum elementleriyle ilgili bir işlem yapmak istersek
            bir for loop olusturup
            arr[i]
            uzerinden istenen islemleri yapabiliriz
         */


    }
}
