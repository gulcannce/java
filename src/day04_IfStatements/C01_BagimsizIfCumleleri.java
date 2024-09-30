package day04_IfStatements;

public class C01_BagimsizIfCumleleri {

    public static void main(String[] args) {


        /*
             bağımsız if cümleleri kodun geriye kalanı ile ilgilenmez
             sadece kendi sartına odaklanır

             Birden fazla bağımsız if cümlesi varsa
             bütün if body'lerini calıştıran durumlar olabileceği gibi
             a=230,  b=44

         */

        int a = 23;
        int b = 44;

        //a b'den büyük mü ?
        if (a > b ){

            System.out.println("a b'den buyuk");

        }
        // b 5 ile tam bölünebiliyor mu ?
        if (b % 5 == 0 ){
            System.out.println("b 5 ile tam bölünür");

            //3 basamaklı bir sayı mı ?
            if (a >=100 && a>=999);
            System.out.println("a sayısı 3 basamaklı");

            //a ile b'nin toplamı 100'den buyuk mu ?
            boolean sart = a + b > 100;
            System.out.println(sart); //false

            if (sart);
            System.out.println("a ile b'nin toplamı 100'den buyuk mu ");

            if (true);
            System.out.println("Bu if body'si her zaman çalışır");

            if (false);
            System.out.println("bu if body hiçbir zaman çalışmaz");





        }

    }
}
