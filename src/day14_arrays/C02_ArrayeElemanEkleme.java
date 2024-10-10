package day14_arrays;

import java.util.Arrays;

public class C02_ArrayeElemanEkleme {
    public static void main(String[] args) {

        //verilen bir array'e
        //istenen bir elemanı ekleyip bize döndüren bir method yazın,
        //eskiarray'e yeni degeri atayın

        int[] arr1 = {4,5,6,7,};

        //bu arra'ye 5. element olarak 8'i atayın

        //arr1[4] = 8; çalıştırınca hata verir

        int[] yeniArr = {4,5,6,7,8};


        arr1 = yeniArr;

        System.out.println("arr1'in son hali :" + Arrays.toString(arr1)); //[4 ,5, 6, 7, 8]

        arr1 = arayeElemanEkle(arr1,10);

        System.out.println("arr1'in method call'dan sonraki hali :" + Arrays.toString(arr1));

        arr1 = arayeElemanEkle(arr1,12);

        System.out.println("arr1'in 2 method call'dan sonraki hali : " + Arrays.toString(arr1));
    }

    public static int [] arayeElemanEkle(int[] arr , int eklenecekEleman){

        int[] yeniArr = new int[arr.length+1]; // [0 , 0 , 0 ...]

        //eski arraydaki tüm elemanalrı yeni arraya atayalım
        for (int i = 0; i < arr.length; i++) {

            yeniArr[i] = arr[i];

        }
        //yeni array'ın son elementi olarak istenen sayıyı atayalım

        yeniArr[yeniArr.length-1] = eklenecekEleman;

        return yeniArr;

    }
}
