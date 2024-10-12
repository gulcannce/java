package ALISTIRMALARIM;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class C01_ArrayList {
    public static void main(String[] args) {


        ArrayList<Integer> öğrenciNotu = new ArrayList<>();

        öğrenciNotu.add(90);
        öğrenciNotu.add(80);
        öğrenciNotu.add(60);
        öğrenciNotu.add(50);

        ArrayList<Integer> arrayList = öğrenciNotu;

        System.out.println("öğrenci notunu giriniz :" + öğrenciNotu);


    }
}
