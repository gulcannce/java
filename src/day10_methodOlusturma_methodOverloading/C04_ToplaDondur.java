package day10_methodOlusturma_methodOverloading;

public class C04_ToplaDondur {

    public static void main(String[] args) {


        //verilen 3 sayının toplamını donduren bir method olusturun

        toplaDondur(5,6,7); // bir sonuc donduren method'lar call edildiğinde
                            //sonucu call edilen yere getirir
                           // bundan sonra yapılacak sey kodu yazan kişiye bağlıdır
                          //1 - ya return edilen sonucu direk yazdırabilir
                         //2- yada daha sonra kullanabilmek uzere bir variable'a atayabilir

        System.out.println(toplaDondur(2, 3, 4)); //9.0
        double toplam = toplaDondur(6, 9, 1); //16 dondurecek ve bu deger toplam variable'ına kaydedilecek



    }
    public static double toplaDondur(double sayı1, double sayı2, double sayı3){

        double toplam =sayı1+sayı2+sayı3;
        return  toplam;
        }
    }


