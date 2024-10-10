package day14_arrays;

import day13_Arrays.C06_Arrays;

import java.util.Arrays;

public class C05_BinarySearch {

    public static void main(String[] args) {

        int[] arr = {3,6,1,8,2,9,12,-1,4,4};

        //arr'de 5'in olup olmadıgını ve varsa kaç tane oldugunu yazdırın
       C06_Arrays.elemanSAyısıYazdır(arr,5); // aranan eleman array'de yok

       //arr'de 3'in olup olmadıgını ve varsa kaç tane oldugunu yazdırın
        C06_Arrays.elemanSAyısıYazdır(arr,3);//aranan eleman arrays'de 2 kere kullanılmış

        System.out.println("==========00");
        System.out.println(Arrays.binarySearch(arr,8)); //-11
        System.out.println(Arrays.binarySearch(arr,9)); //-11
        System.out.println(Arrays.binarySearch(arr,2)); //4 doğru
        System.out.println(Arrays.binarySearch(arr,1)); //-1
        //binarySearch() kullanmadan once sort() kullanamazsınız
        //sonucun ne olacagını BİLEMEYİZ
        //dogru da olabilir, yanlış da olabilir

        String [] isimler = {"Esra","İbrahim","Huseyin","Omer","Azim"};
        //isimlerde Esra'nın  olup olmadıgını donduren method oluşturun

        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));

        //Array'de arama yapmadan once sort YAPILMALIDIR
        //Aradıgımız elemen vaesa, ilk kullanımın index'ini döndürür

        System.out.println(Arrays.binarySearch(isimler,"Esra")); //2
        System.out.println(Arrays.binarySearch(isimler,"azim")); //0
        System.out.println(Arrays.binarySearch(isimler,"Omer")); //5

        //eleman varsa bize ilk elemanın indeX'ini dondurun

        System.out.println(Arrays.binarySearch(isimler,"Ayça")); //-1
        System.out.println(Arrays.binarySearch(isimler,"Deniz")); //-3



    }
}
