package day15_multiDimensionalArrays_arraysLists;

import java.util.ArrayList;
import java.util.List;

public class C11_remove {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Deniz");
        isimler.add("omer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Basak");

        //remove (silinecekObject) çalıştırınca
        //silinecekObject varsa siler ve bize true döndürür
        //silinecekObject yoksa silemez ve bize false döndürür

        System.out.println(isimler); //[Deniz, omer, Esra, Hamza, Basak]

        System.out.println(isimler.remove("Esra")); //true

        System.out.println(isimler); //[Deniz, omer, Hamza, Basak]

        System.out.println(isimler.remove("Ercan")); //false

        System.out.println(isimler); //[Deniz, omer, Hamza, Basak]

        isimler.remove("Omer");

        System.out.println(isimler);//[Deniz, Hamza, Basak]

        //remove (silinecekIndex) çalıştırınca,
        //silinecekObject varsa siler ve bize true döndürür
        //silinecekObject yoksa silemez ve bize false döndürür

        System.out.println(isimler.remove(1)); //Hamza

        System.out.println(isimler); //[Deniz, Basak]

        //isimlr.remove(5); //IndexOfBoundsException


        isimler.add("Ibrahim");
        isimler.add("Ercan");
        isimler.add("Azim");

        System.out.println(isimler); //[Deniz, Hamza, Basak, Ibrahim, Ercan, Azim]

        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Basak");
        silinecekler.add("Deniz");
        silinecekler.add("Azim");

        System.out.println(silinecekler); //[Basak, Deniz, Azim]

        System.out.println(isimler.removeAll(silinecekler)); //true
        System.out.println(isimler); //[İbrahim,Ercan]

        List<String> silinecekler2 = new ArrayList<>();
        silinecekler2.add("Ercan");
        silinecekler2.add("Gulnur");

        System.out.println(); // [Ercan, Gulnur]

        System.out.println(isimler.removeAll(silinecekler2)); //true
        System.out.println(isimler); //[İbrahim]

        System.out.println(isimler.removeAll(silinecekler)); // false
        System.out.println(isimler); //[İbrahim]






    }
}
