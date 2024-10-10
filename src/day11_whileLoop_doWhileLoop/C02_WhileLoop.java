package day11_whileLoop_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {

        //1'den 10'a kadar olan sayıları yazdırın

        for (int i = 1;i<10 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");

        //soruyu while loop ile yapmak istersek
        //while loopda
        //    -loop ,çinde kullanılacak variable,
        //   -bitiş şartı
        //  -artış/azalış yöntemini bizim yazmamız gereklidir


        int sayı = 1;
        while (sayı <=10) {
            System.out.print(sayı + " ");
            sayı ++;

        }


        //forl loop ile yapılabilecek bir islemi
        //for loop ile yapmak tercih edilir

    }
}
