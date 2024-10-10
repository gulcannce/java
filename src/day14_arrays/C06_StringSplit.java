package day14_arrays;

import java.util.Arrays;

public class C06_StringSplit {

    public static void main(String[] args) {

        String str ="About 197.000.000 result (0,43 seconds)";

        //arama sonuc sayısının bir milyondan çok oldugunu test edin

        String[] kelimeler = str.split(" ");

        System.out.println(Arrays.toString(kelimeler)); //About 197.000.000 result (0,43 seconds)

        int sonucSayısı= Integer.parseInt(kelimeler[1].replaceAll("\\D",""));

        System.out.println(sonucSayısı); //197000000

        String[] ayirace = str.split("e");

        System.out.println(Arrays.toString(ayirace)); //About 197.000.000 r, sult (0,43 conds)]

        String[] ayiracHiclik = str.split("");
        System.out.println(Arrays.toString(ayiracHiclik));

        String[] ayiracNokta = str.split(",");
        System.out.println(Arrays.toString(ayiracNokta));

        //About 197.000.000 result (0,43 seconds) ]
    }
}
