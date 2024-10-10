package day10_methodOlusturma_methodOverloading;

public class C05_AsalSayıMıDondur {
    public static void main(String[] args) {

        //veriln pozitif bir tam sayının
        //asal sayı olup olmadıgını kontrol edip
        //asal ise true, asal degıl ise false donuren
        //bir method olusturun


        asalMıDondur(45); //false dondurdu, ama biz kullamadık
        System.out.println(asalMıDondur(43)); //true


    }

    public static boolean asalMıDondur(int sayı){

        boolean flag = true;

        for (int i = 2; i <sayı ; i++) {

            if (sayı % i == 0){
                break;
            }
        }
        return  flag;

    }

}
