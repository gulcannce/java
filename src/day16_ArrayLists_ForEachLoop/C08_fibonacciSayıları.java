package day16_ArrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C08_fibonacciSayıları {

    public static void main(String[] args) {

        //verilen tamsayı pozitiften kucuk
        //fibonacci sayılarını bir liste olarak bize dönduren
        //bir method olusturun

        System.out.println(fibonacciListesi(500));

    }

    public static List<Integer> fibonacciListesi(int ustSınır){

        List<Integer>fibonacciListesi = new ArrayList<>();

        if (ustSınır == 0) {
            fibonacciListesi.add(0);
        }else if (ustSınır == 1) {
            fibonacciListesi.add(0);
            fibonacciListesi.add(1);
            fibonacciListesi.add(1);

        }else { // ust sınır 1'den buyuk

            fibonacciListesi.add(0);
            fibonacciListesi.add(1);
            fibonacciListesi.add(1);

            int yeniSayı;
            int index =3 ;

            do {
                yeniSayı= fibonacciListesi.get(index-2) + fibonacciListesi.get(index-1);

                if (yeniSayı<= ustSınır){
                    fibonacciListesi.get(yeniSayı);
                }
                index++;

            }while (yeniSayı<=ustSınır);
        }
        return fibonacciListesi;
    }
}
