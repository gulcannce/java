package day16_ArrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C07_FibonacciDizisi {

    public static void main(String[] args) {

        //verilen pozitif bir n tamsayısını alarak,
        //     bize ilk ntane tane Fibonacci sayısını bir list olarak donduren bir method olusturun.
        //Fibonacci 0 1 1 2 3 5 8 13 21 34 55 89 144 .......

        System.out.println(fibonacciListesiOlustur(5)); //[0, 1, 1, 2, 3]
        System.out.println(fibonacciListesiOlustur(10)); //[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]

        System.out.println(fibonacciListesiOlustur(34));

    }

    public static List<Integer> fibonacciListesiOlustur(int listedekiSayıAdedi) {

        List<Integer> fibonacciList = new ArrayList<>();

        if (listedekiSayıAdedi == 1) {
            fibonacciList.add(0);
        } else if (listedekiSayıAdedi == 2) {
            fibonacciList.add(0);
            fibonacciList.add(1);
        } else { //istenen eleman sayısı 2'den fazla
            fibonacciList.add(0);
            fibonacciList.add(1);

            for (int i = 2; i <listedekiSayıAdedi ; i++) {

                fibonacciList.add(fibonacciList.get(i-1) + fibonacciList.get(i-2));


            }
        }
        return fibonacciList;
    }
}




