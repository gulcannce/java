package day15_multiDimensionalArrays_arraysLists;

import java.util.ArrayList;
import java.util.List;

public class C10_set {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Deniz");
        isimler.add("omer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Basak");

        System.out.println(isimler); //[Deniz, omer, Esra, Hamza, Basak]

        System.out.println(isimler.get(1)); //omer
         //System.out.println(isimler.get(8)); // IndexOutOfBoundsException

        isimler.add(3,"Azim");

        System.out.println(isimler); //[Deniz, omer, Esra, Azim, Hamza, Basak]
         //set()'u bir elementi UPDATE (yeni deger atamak) için kullanılır

        isimler.set(3,"Gulnur");
        System.out.println(isimler); //[Deniz, omer, Esra, Gulnur, Hamza, Basak]

        //Method'ların yaptıgı iş ile bixe döndürdüğü sonuc FARKLI OLABİLİR
        System.out.println(isimler.set(2, "Yusuf")); //Esra

        System.out.println(isimler); //[Deniz, omer, Yusuf, Gulnur, Hamza,

        isimler.set(0,"Ayça");

        System.out.println(isimler); //[Ayça, omer, Yusuf, Gulnur, Hamza, Basak]
    }
}
