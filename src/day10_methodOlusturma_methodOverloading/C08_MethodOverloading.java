package day10_methodOlusturma_methodOverloading;

public class C08_MethodOverloading {
    public static void main(String[] args) {
        /*

        bir method call yapışdığında
        java hangi methodun çalışacağına karar vermek için
        aşagıdakilerin kontrolunu yapar

        1- isim
        2- argument sayıyı ile parametre sayısı
        3- argument olarak yazılan DEGERler ile PARAMETRElerin data turunun uyumlu olması

         */

        toplama(5,7); //iki int sayının toplamı : 12

        toplama('a', 'b');//iki int sayının toplamı : 195

        // toplama(4, 5,6,5);
        //toplama(4,6.7);

    }
    // verilen iki inger sayıyı toplayıp yazdıran bir method olusturun

    public static void toplama(int sayı1 , int sayı2){
        System.out.println("iki int sayısının toplamı : " +(sayı1+sayı2));
    }
}
