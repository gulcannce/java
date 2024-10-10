package day10_methodOlusturma_methodOverloading;

public class C09_MethodOverloading {
    public static void main(String[] args) {
        /*
            bir class'da aynı ısım ve esit sayıda parametre ile
            birden fazla method olusturabilir mi ?

            parametlerin data turleri aynı olmazsa
            birden fazla aynı isimde method olusturalan

            java'da method ismi ve parametrelerin data turlerin birlikte kullanacak
            method signature olusur

         */


        toplama(4,5); //iki int sayının toplamı :9
        toplama(5,6.3); //double ve int 2 sayının toplamı :11.3

    }
    //verilen iki integer sayıyı toplayıp yazdıran bir method olusturalan


    public static void toplama(int sayı1 , int sayı2){ //toplama int int
        System.out.println("iki int sayının toplama :" +sayı1+sayı2);

    }
    //verilen iki integer sayıyı toplayıp yazdıran bir method olusturan

    public static void toplama(int a ,double b){ //toplama int double
        System.out.println("double ve int 2 sayının toplam:" + (a+b));


    }
}
