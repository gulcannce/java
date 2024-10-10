package day12_scope;

public class C03_Scope_ClassVeriables {

        String str ="java";
        int sayı = 23;

        static  boolean bl = true;
        static  char chr = 'a';

    public static void main(String[] args) {
        //static int a= 23;
        //System.out.println(str);
        //System.out.println(sayı);
        System.out.println(bl);
        System.out.println(chr);
    }

       public static void staticMedhot(){
           //static int s = "tava";
           //System.out.println(str);
           //System.out.println(sayı);
           System.out.println(bl);
           System.out.println(chr);

    }
    public void staticolmayanMedhot(){
        System.out.println( str);
        System.out.println(sayı);
        System.out.println(bl);
        System.out.println(chr);


        /*
            class level variable'lar classın içinde ama kod bloklarının dışında olusturulur
            sonradan classa bakıldıgında ulaşılması kolay olsun diye classın başında olusturulurlar

            class level'da olusturulan veriable'ların scope'u BUTUN CLASS'DIR
            AMA class level veriable'larda
            erişimi belirleyen sadece scope değildir
            static KEYWORD de erişimde BELİRLEYİCİ bir role sahiptir

            static keyword^sahip olan veriable'lar tüm class içinden direk kullanılabilir

            static keyword'e kullanmayan verible'lar
            SADECE static keyword kullanmayan method'larda kullanılabilir


         */

    }
}
