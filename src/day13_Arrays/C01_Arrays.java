package day13_Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        int [] arr = new int[5];

        /*

           bir array olsturuken , 2 şey mutlaka deklare edilmelidir
           1- içine konulacak data turu
           2- array'ın içine konulacak element sayısı (length)

           eger Array'ı yukardakı gibi olusturusak
           biz hiç bir deger ataması yapmadığımız için
           java default olarak belirlediği degeri atayacaktır

           Array olusuturulduktan sonra,
           olmayan index kullanılarak yeni deger ataması/ ekelmesi MÜMKÜN DEGİLDİR

           yani 4 elemanlı bir Array'e 5. elementi ATAYAMAZSINIZ
         */

        int[] arr2 = {4, 1, 7, 5}; //lenggth = 4

        System.out.println(arr2[1]); //1
        System.out.println(arr2[3]); //5
        System.out.println(arr2[arr2.length - 1]); // son elementi yazdırmak istersek 0

        //ilk array'de deger ataması yapmadık

        System.out.println(arr[0]); // 0
        System.out.println(arr[arr.length - 1]);

        // olmayan index'deki elemnete ulaşmak istersek
        //System.out.println(arr[5]); //ArrayIndexOutOfBoundsException

        //olmayan bir index'e atama yapabilir miyiz ? // ArrayIndexOutOfBoundsException

        //arr2[4] = 8 ; //
        arr = new int[10];

        arr = new int[20];
    }
}
