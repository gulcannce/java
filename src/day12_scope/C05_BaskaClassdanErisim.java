package day12_scope;

public class C05_BaskaClassdanErisim {

    /*
      class içerisinde olusturulduğumuz class uyelerinin
      static olup olmaması
      başka classlardan erisimi de etkiler

      başka classdan static bir class uyesine ulaşmak için
      clssİsmi.staticClassUyesiIsmi kullanılır

      baska classdan static olmayan class uyelerine ulaşmak için
      once o class'dan bir obje olusturup
      sonra objeismi.staticOlmayanUyeIsmi kullanılır

      peki static bir class uyesine
      OBJEuzerinden ulaşabilir miyiz ?

      java obje ismini yazıp nokta koyunca
      static uyeleri otomatik olarak onermez AMA biz manuel olarak obj.sataticClassUyeIsmi yazarsak
      java istediğimiz static uyeyi getirir
      bu durumda intellij bu kullanımı sarıya boyar
      static bir class uyesine, static olmayan bir yolla erişiyorsun
      diye bizi uyarır


     */

    public static void main(String[] args) {

        System.out.println(C03_Scope_ClassVeriables.bl);
        System.out.println(C03_Scope_ClassVeriables.chr);
        C03_Scope_ClassVeriables.staticMedhot();

        C03_Scope_ClassVeriables obj =new C03_Scope_ClassVeriables();
        System.out.println(obj.sayı); //23
        System.out.println(obj.str);//java
        obj.staticolmayanMedhot();

        System.out.println(obj.bl); //true
        System.out.println(obj.chr); //a
    }
}
