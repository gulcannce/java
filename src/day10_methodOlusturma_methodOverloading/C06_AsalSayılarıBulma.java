package day10_methodOlusturma_methodOverloading;

public class C06_AsalSayılarıBulma {
    public static void main(String[] args) {


        //bir önceki class'da olusturulan methodu kullanarak
        //3 basamaklı sayılardan asal olanlaraı yazdrın

        for (int i =100; i <1000; i++){

            System.out.println(i +" :" +C05_AsalSayıMıDondur.asalMıDondur(i));
            System.out.println(i + " ");


        }

    }
         //4 basamaklı kac tane asal sayı var ?
         int sayac=0;
    {
        for (int i = 1000; i <10000; i++){
            if (C05_AsalSayıMıDondur.asalMıDondur(i)){
                sayac++;



            }
        }
        System.out.println("4 basamaklı sayılardaki asal sayı adade :" + sayac);

    }
}
