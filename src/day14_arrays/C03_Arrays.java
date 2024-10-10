package day14_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Arrays {
    public static void main(String[] args) {
         int[] arr ={3,4,5,3};

         //kullanıcıdan bir deger alıp, array'e ekleyin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen array'e eklemek için bir tam sayı giriniz");
        int ekleneceksayı = scanner.nextInt();

        arr = C02_ArrayeElemanEkleme.arayeElemanEkle(arr,ekleneceksayı);

        System.out.println("Array'in yeni hali : " + Arrays.toString(arr));
    }
}
