package day15_multiDimensionalArrays_arraysLists;

import java.util.ArrayList;
import java.util.List;

public class C07_ArraysList {
    public static void main(String[] args) {

        List<Integer> sayılar = new ArrayList<>();

        System.out.println(sayılar); // []

        System.out.println(sayılar.size()); // 0

        System.out.println("liste boş mu :" + sayılar.isEmpty());


        sayılar.add(5);
        sayılar.add(0,7);

        System.out.println(sayılar); //[7,5]

        System.out.println(sayılar.size()); //2

        System.out.println("liste boş mu :" + sayılar.isEmpty());

    }
}
