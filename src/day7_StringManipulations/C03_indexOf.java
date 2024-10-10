package day7_StringManipulations;

import java.util.Scanner;

public class C03_indexOf {
    public static void main(String[] args) {

        //veriline bir cümlede
        //aranan bir metin için aşağıdaki cumlelerden
        //uygun olanı yazdıracak bir programı yazdırınız
        // -cümle aranan metni içermiyor
        // -cümlede aranan metin sadece 1 kere kullanılmış
        // _ cümlede aranan metin sadece 2 kere kullanılmış
        // -cümlede aranan metin 2!den fazla kullanılmış


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cümle = scanner.nextLine();


        System.out.println("lütfen aranan metni giriniz");
        String metin =scanner.nextLine() ;


        int ilkIndex = 0;
        int ikinciIndex =0;
        int ücüncüIndex =0;


        ilkIndex = cümle.indexOf(metin ); // -1 veya kullanılan index

        if (ilkIndex == -1) {
            System.out.println("cümle aranan metni içermiyor");

        }else if ((ikinciIndex = cümle.indexOf( metin, ilkIndex+1)) == -1) { // mutlaka kullanın
            //ilk index -1 değil, ikinci index -1
            System.out.println("cümlede aranan metin sadece 1 kere kullanılmıi");

        }else{
            //ilk index  -1 değil, ikinciindex -1 değil
            //şimdiki sorumuz sadece 2 tane mi var, yoksa 2'den fazla mı ?

            ücüncüIndex= cümle.indexOf(metin,ikinciIndex+1);
            //ücüncüindex == -1 veya var olan bir index
            if (ücüncüIndex == -1) {
                //ilk index -1 değil, ikinciindex -1 değil ama ücüncüindex -1
                System.out.println("cümlede aranan metin sadece 2 kere kullanılmış");
            }else{
                //ilk index -1 değil, ikinciendex -1 değil,ucuncuindex-1 değil
                System.out.println("cümlede aranan metin 2'den fazla kullanılmış");

            }




        }
    }
}
