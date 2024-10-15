package day19_passbyValue;

public class C03_PassByvalue {

    public static void main(String[] args) {

        //main method'a verilen fiyat degerine  %10 %20 ve %30 indirim yaparak
        //indirimli fiyatı bize döndüren 3 method olusturun
        //main method'dan bu 3 methodu arka arkaya cagırıp
        //return edilen fiyatları yazdırın

        double fiyat = 100;

        System.out.println("%10 indirimli fiyat :" + indirim10(fiyat));
        System.out.println("%20 indirimli fiyat :" + indirimli20(fiyat));
        System.out.println("%300 indirimli fiyat :" + indirim30(fiyat));

        System.out.println("indirimli fiyat yazdırıldıktan sonra fiyat :" + fiyat);


    }

    public static double indirim10(double fiyat) {

        fiyat = fiyat * 90 / 100;

        return fiyat;

    }

    public static double indirimli20(double fiyat) {

        fiyat = fiyat * 80 / 100;

        return fiyat;

    }

    public static double indirim30(double fiyat) {

        fiyat = fiyat * 70 / 100;

        return fiyat;
    }
}
