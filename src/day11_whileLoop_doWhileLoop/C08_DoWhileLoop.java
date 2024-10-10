package day11_whileLoop_doWhileLoop;

public class C08_DoWhileLoop {
    public static void main(String[] args) {

        /*

            whilo loop kullanıcıdan deger alınan
            ve / veya tekrar sayısı bellı olmayan durumlarda kullanmayı tercih ediyoruz

            while loop'un iki tane negatif yonu vardır
            1- loop oncesinde baslangıc degerini bizim atamamız gerekir
            kullanıcıdan degeri loop içinde alırız
            eger ilk deger atamasında dikkat edilmezse
            hatalı bir deger atanabilir ve bu durumda loop calışmayabilir


           2- kontrol işlemi basta yapılıp, body sonradan calıstığı için
           kontrol işlemı hep bir fazla yapılır

         */

        int sayı =5 ;

        //verilen sayı (dahil) ile 3 (haric) arasındaki sayıları yazdırın

        while (sayı > 3){

            System.out.print(sayı +" ");
            sayı-- ;

            //java özellikle kullanıcıdan deger alırken
            //ilk degeri yanlış atamamız için
            //bir alternatif do-while loop'u olusturmustur
            //do-while loop'da once işlem yapılır , sonra kontrol edilir

            sayı = 5;

            //verilen sayı(dahil) ile 3 (hariç) arasındaki sayıları yazdırın
            do {
                System.out.print(sayı +" ");
                sayı-- ;
            }while (sayı > 3);

        }
    }
}
