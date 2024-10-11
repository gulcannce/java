package day16_ArrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C05_ListedenElemanSilme {

    public static void main(String[] args) {

        // verilen string bir listede
        //istenmeyen harf içeren elementleri silip,
        // kalan kısmını list olarak bize dönduren bir method olusturun

        /*
           listenin elemanlarını index ile kontrol edip
           silmemiz isteniyorsa
           silme islemi yaptıgımızda aradan bir element cıkarılacagı için
           index bir elemanı atlar

           bunu engellemek için
              - silme yapınca i bir azaltılabilir
              - verilen listede silme yapılmaz. yeni bir liste olusturulup
                silinmeyecek elemanlar yeni listeye eklenebilir
         */

        List<String> isimler = new ArrayList<>();

        isimler.add("Deniz");
        isimler.add("omer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Basak");
        isimler.add("Ayca");
        isimler.add("Ahmet");


        String silineceklerHarf = "a";

        System.out.println(istenmeyenleriSil(isimler, silineceklerHarf));

    }

    public static List<String> istenmeyenleriSil(List<String> isimler, String silinecekHarf) {

        List<String> silinmeyeceklerListesi = new ArrayList<>();

        for (int i = 0; i < isimler.size(); i++) {


            //if (isimler.get(i).toUpperCase().contains(silinecekHarf.toUpperCase())) {

            // isimler.remove(isimler.get(i));
            // i--;


            if (!isimler.get(i).toUpperCase().contains(silinecekHarf.toUpperCase())) {
                silinmeyeceklerListesi.add(isimler.get(i));

            }

        }
        return silinmeyeceklerListesi;
    }
}


