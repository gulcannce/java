package day16_ArrayLists_ForEachLoop;

import java.util.concurrent.LinkedTransferQueue;

public class C10_ForEachLoop {

    public static void main(String[] args) {
        /*

          For-each loop
          birden fazla eleman barındıran
          array ve list gibi yapılarla çalısmak üzere hazırlanmıştır

          1'den 100'e kadar olan sayıları toplama,
          sayı 50'den kucuk oldugu muddetce .... yapma
          gibi işlemler için uyhgun degildir

          for each loop
          birden fazla eleman barındıran yapılardaki elementleri
          hiç bir sıralama sartı olmadan ve index kullanmadan
          BİZE GETİRİR

          For-each loop'da 3 seyi yazmalıyız
          1- calışacağımız elementlerin data turu
          2- loop içinde gelen elemanların hangi ısımle kullanacağız (array'de arr[i])
          3- üstünde işlem yapacagımız çok elementli obje
         */

       int[] arr ={2,5,7,9,0};

       //array'ın tum elementleri yazdırın

        for (int each:arr
        ) {
            System.out.print(each + " " );
            //2 5 7 9 0
        }
        System.out.println("");
       //array'deki tum elemanları toplayın

        int toplam =0;

        for (int w : arr
        ){

            toplam +=w;
        }
        System.out.println("elementlerin toplamı :" + toplam);
        //elementlerin toplamı

       //array'deki cift sayıların carpımını yazdırın

        int carpım = 1;

        for (int each : arr
        ){
            if (each % 2 == 0){
                carpım *= each;
            }
        }
        System.out.println("carpım sonucu :" + carpım); //carpım sonucu :0



    }
}
