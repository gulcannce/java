package day19_passbyValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class C04_PassByValue_CokluElement {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        System.out.println("arr ilk hali :" + Arrays.toString(arr));

        elemanları2Artır(arr);

        System.out.println("elemanları artır method call'dan sonra arr :" + Arrays.toString(arr));

        arrayıDegıstır(arr);

        System.out.println("array'ı degiştir method call'dan sonra arr :" + Arrays.toString(arr));

    }

    public static void elemanları2Artır(int[] arr) {

        //array'ın tum elemanları 2 artırıp
        //yeni halini yazdırsın

        for (int i = 0; i < arr.length; i++) {

            arr[i] += 2;
        }

        System.out.println("eleman artır metodun'unda degiştirilen arr : " + Arrays.toString(arr));

    }

    public static void elemanları2artır(int[] arr) {

        System.out.println("elemanları artır call'dan sonra arr :" + Arrays.toString(arr));
    }

    public static void arrayıDegıstır(int[] arr) {

        //yeni 3 elemanlı bir array olusturup
        //içine rastgele 100'den kucuk sayılar koyun
        //arr'ye bu yeni degeri atayın
        //ve arr'yi yazdırın

        int[] yeniArr = new int[3];
        Random rnd = new Random();

        for (int i = 0; i < yeniArr.length; i++) {

            yeniArr[i] = rnd.nextInt(100);

        }
        arr = yeniArr;
        System.out.println("array'ı degıstır method'dan sonra arr: " + Arrays.toString(arr));
    }
}






