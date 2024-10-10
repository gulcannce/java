package day10_methodOlusturma_methodOverloading;

public class C03_AsalSayıBulma {

    public static void main(String[] args) {


        // verilen pozitif bir tamsayının
        // asal olup olmadığı kontrol edip
        // asal ise true, asal degil ise false yazdırın bir method olusturun

        asalMıyazdır(45); // false
        asalMıyazdır(908643); // false
        asalMıyazdır(5); //false
        asalMıyazdır(97); //true

    }


    public static void asalMıyazdır(int sayı) {

        boolean flag = true;

        for (int i = 2; i < sayı; i++) {

            if (sayı % i == 0) {
                flag = false;
                break;


            }
        }

        System.out.println(flag);
    }

}
