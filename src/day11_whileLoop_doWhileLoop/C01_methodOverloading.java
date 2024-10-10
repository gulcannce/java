package day11_whileLoop_doWhileLoop;

public class C01_methodOverloading {
    public static void main(String[] args) {

        /*
            bir class'da ismi aynı ama signature'i farklı method'lar olustırmaya
            method overloading denir

            method overloadingin amacı aynı işlevi,
            farklı şekillerde kullanabilmektir

            Overloading'de isimler aynı oldugunda,
            aynı classda birden fazla overloading method yazabilmek için
            signature'ları degiştirmemiz gerekir

            signature =method adı + parametrelerin data türleri
            toplama int int
            toplama int
            toplama int int int

            toplama double int
            toplama int double
            toplama float int
            toplama float double

            1- argument sayıyı ==parametre sayısı
            2- argument data türleri sıralanıyışı == parametre data türleri ve sıralanışı
            3- argument'ler ile parametreler %100 uyumlu olmazsa
            casting ile calıştırılabilecek birden fazla method varsa
            en az casting yaparak kullanabileceğini tercih eder.

            java hangi meyhodu kullanacağına
            method call sırasında yazacağımız argumen'lere göre karar verir

         */

        String str ="java candır";
        System.out.println(str.substring(3)); //a candır
        System.out.println(str.substring(3, 6)); // ac

        System.out.println(str.replace('a','b'));
        System.out.println(str.replace("can", "güzel")); //java güzeldir

    }
}
