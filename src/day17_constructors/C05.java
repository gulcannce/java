package day17_constructors;

public class C05 {


    //default constructor ile aynı işlevi yapan
    //gorünür bir constructor olusturalım

    public C05(){
        System.out.println("merhaba, ben constructor");

    }

    //bu constructor görünür oldugu için
    //buna default constructor degil
    //PARAMETRESİZ constructor denir
    //cünkü default constructor'ların body'si bos olur
    //biz parametresiz constructor'ların body'sine kod ekleyebiliriz

    int sayı = 0;
    String  str;

    public void  methot1(){System.out.println("C05 method1 calıştı");

    }
    public void  C05(){
        //method isimleri kucuk harfle başlamalıdır
        //ama bu bir kural degil convention(genel kabul)
        //bir kod blogunun return type'i varsa methodtur

    }
    /*
     public asd()

     invalid method declaration; return type required
     ismi class adı ile aynı degil, olsa olsa method olabilir
     ama method için return type yazılmalı
     */
}
