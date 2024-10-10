package day09_forLoops_methodOlusturma;

public class c12_methodOlusturma {
    public static void main(String[] args) {

        String str = "sevim bak kim gelmiş ?";
        str.toUpperCase();

        //method bize bir sonuc donduruyorsa 2 sekılde o sonucu kullanabiliriz

        //sadece o satırda, sonucu görmek istiyorsanız, kalıcı bir degisiklik yapmıcaksınız
        //direk yazdırabiliriz

        System.out.println(str.toUpperCase()); //sevim bak kim gelmiş ?

        //veya degisikligin kalıcı olmasını istiyorsak
        //yeni halini kaydedbiliriz

        String strBuyukharf = str.toUpperCase();

        System.out.println(str); //sevim bak kim gelmiş
        System.out.println(strBuyukharf); //sevim bak kim gelmiş ?

        // Google === google bug

    }
}
