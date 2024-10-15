package day19_passbyValue;

public class C01_staticBlocks {

    C01_staticBlocks() {
        System.out.println("constructor calısıtı");

    }
    static {

        System.out.println("statik block calıstı");
        /*
            Eger class calısmaya baslamadan
            belirli ayarları yapmak isterseniz
            static block olusuturabilirsiniz

            static block'lar class'daki HERSEYDEN
            hatta main method'tan bile
            once calısır

            birden fazla static block varsa,
            kendi iclerinde önce ustteki calısır
         */
        {

        }
        System.out.println("static olmayan block");

        /*
        obje olusturmdan once
        yapılması gereken ön ayarlar varsa kullanılır
         */
    }



    public static void main(String[] args) {

        System.out.println("main method calıstı");

        C01_staticBlocks obj = new C01_staticBlocks();

    }
    static {
        System.out.println("alttaki static method calıstı");
    }
}
