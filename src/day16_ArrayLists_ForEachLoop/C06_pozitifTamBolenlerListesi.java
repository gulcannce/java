package day16_ArrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_pozitifTamBolenlerListesi {

    public static void main(String[] args) {

        //verilen pozitif bir tamsayıyı,
        //tam bölebilen tum pozitif tamsayıları
        //bir liste olarak bize donduren bir method olusturun

        System.out.println(tamBölenlerListesi(20)); //[1, 2, 4, 5, 10, 20]

        System.out.println(tamBölenlerListesi(50)); //[1, 2, 5, 10, 25, 50]

    }
    public static List<Integer> tamBölenlerListesi(int sayı){

        List<Integer> tamBölenlerListesi = new ArrayList<>();

       // tamBölenlerListesi.add((1));

        for (int i = 1; i <=sayı ; i++) {

            if (sayı % i == 0){
                tamBölenlerListesi.add(i);
            }

        }
        return tamBölenlerListesi;
    }
}
