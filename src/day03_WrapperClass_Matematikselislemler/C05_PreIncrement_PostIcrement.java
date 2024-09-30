package day03_WrapperClass_Matematikselislemler;

public class C05_PreIncrement_PostIcrement {

    public static void main(String[] args) {

        int a= 20;

        // a'nın değerini yazdırın
        // sonra a'nın değerini 1 artırıp oluşturacağınız b variable'ina yeni değeri atayın

        System.out.println(" a : " + a);

        a  += 1;

        int b = a ;
        System.out.println("islem sonunda a : " + b);
        a = 20;
        // a'nın degerini b 'ye atayın
        // sonra a'nın degerini 1 artırın

        b = a ;
        a += 1;

        System.out.println(" islem sonunda a :" + a+ ", b :" + b);


        System.out.println(" ==============");

        // bu anlatılan sadece ++ veya -- seklindeki kullanım içindir
        a = 20;
        b = a++ ;

        System.out.println("a++ islem sonunda a: " + a +  "; b :" + b);

        a= 20 ;
        b = a++ ;
        System.out.println("++a islem sonunda a : " + b);


        int c = 40 ;
        System.out.println(" c++ ile yazdırınca : "  + c++);
        System.out.println(" c++ ile bir alt satırda c'nın degeri :" + c);

        c = 40;

        System.out.println(" ++c ile yazdırınca : " + ++c );
        System.out.println("++c ile alt satırda c'nin degeri :" + c);



    }
}
