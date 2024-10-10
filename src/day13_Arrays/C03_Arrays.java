package day13_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {

        // verilen int bir array'daki
        //tum elementlerin degerini 2 artırın

        int []arr = {3,5,7,10,2,6};

        System.out.println("Array'ın ilk hali :" + Arrays.toString(arr));

        for (int i = 0; i < arr.length ; i++) {

            arr[i] +=2;


        }

        System.out.println("Array'ın son hali :" + Arrays.toString(arr));

    }
}
