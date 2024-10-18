package day21_varargs_stringBuilder;

import com.sun.tools.javac.Main;

public class C05_Varargs_DikkatEdilecekler {
    public static void main(String[] args) {

    //istene kadar int parametre alıp
    //ilk sayı dışındaki tum sayıları toplayı
    //bulumam toplamı ilk sayı ile carpıp yazdırın
    //bir method olusuturn

        islem1(1,2,3,4,5,6); //20
        islem1(2,3,0); //6
        islem1(0,3);//0
        islem1(1); //0

        //istene kadar int parametre alıp
        //son sayı dışındaki tum sayıları toplayı
        //bulumam toplamı ilk sayı ile carpıp yazdırın
        //bir method olusuturn

    }
    /*
    public static void islemYapSon(int... toplanacaksayılar ,int sonsayı){
    }
    varargs alacagı element sayısı konusuna sınır tanımadıgından
    tum elementleri almak ister
            bundan dolayı bir method'da parametre olarak varargas yazılacaksa
        EN SON parametre olarak yazılmalıdır
        bu sebeple bir method da
        2 varargs parametrede KULLANILAMAZ
     */




    public static void islem1(int ilksayı,int... geriyeKalanlar){

        int toplam =0;

       for ( int each : geriyeKalanlar){

           toplam +=each ;

        }
        System.out.println(ilksayı * toplam);
    }



}
