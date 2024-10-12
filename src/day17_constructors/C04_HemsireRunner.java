package day17_constructors;

public class C04_HemsireRunner {

    public static void main(String[] args) {

        C03_Hemşire hemşire1 = new C03_Hemşire();

        hemşire1.hemşireAdı = "Esra";

        hemşire1.hemsireAdresi ="yeni Mahalle";

        C03_Hemşire hemşire2 = new C03_Hemşire();

        System.out.println(hemşire2.hemsiretel); // null

        System.out.println(new C03_Hemşire().hemsireAdresi); //null

        //son olusturdugumuz objeyi
        //atama yapmadıgımız için bir daha kullanamayız
        //bu tur bos objeler Java'da Garbage collector tarafından toplanıp, yok edilir

        C03_Hemşire hemşire3;
        //hemşire3.method1();
        //System.out.println(hemşire3.hemsireAdresi);
        //initialize yapılmadıgı için, herhangi bir varible degerini yazdıramaz

    }
}
