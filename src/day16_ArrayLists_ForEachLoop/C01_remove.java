package day16_ArrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_remove {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Deniz");
        isimler.add("omer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Basak");

        List<String> silinecekler2 = new ArrayList<>();
        silinecekler2.add("Ercan");
        silinecekler2.add("Gulnur");

        System.out.println(isimler.remove(2)); // Esra
        System.out.println(isimler); //[Deniz, Ömer, hamza, Basak]

        System.out.println(isimler.remove("Hamza")); //true
        System.out.println(isimler); //[Deniz, Ömer, Basak]

        System.out.println(isimler.removeAll(silinecekler2)); // isimlerde degişiklik olursa true
        System.out.println(isimler); //[ömer, basak]

        List<Integer> sayılar = new ArrayList<>();
        sayılar.add(3);
        sayılar.add(2);
        sayılar.add(8);

        System.out.println(sayılar); //[3,2,8]

        //eger list sayılarden oluşuyorsa
        //romeve(2) yazdıgımızda 2'nin element mi yoksa index mi olacagını netleştirmek gerekir
        //java bu durumu netleştirmek için
        //sayılardan oluşan list'lerde yazılan sayıyı İNDEX olarak kabul eder

        System.out.println(sayılar.remove(2)); //8
        System.out.println(sayılar);  //[3,2]

        //illa da obje olan 2'yisilmek istiyorsak ve index'ini bilmiyorsak
        //önce silmek istediğimiz elementi bir obje (non primitive) olarak tanımlamalıyız

        Integer silinecekSayı = 2;
        System.out.println(sayılar.remove(silinecekSayı)); //true
        System.out.println(sayılar); //3


    }

}
