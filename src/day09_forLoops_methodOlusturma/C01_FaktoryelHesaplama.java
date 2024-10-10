package day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C01_FaktoryelHesaplama {
    public static void main(String[] args) {
        //soru 5- kullanıcıdan 20'den kucuk bir sayi alip,
        //bu sayının faktoyer degerini hesaplayın.
        //5! = 5*4*3*2*1 => 120

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfebn 20'den kucuk pozitif bir tam sai giriniz");
        int sayi = scanner.nextInt();

        int faktoryelsonuc =1;

        for (int i = sayi; i >=1 ; i --) {

            faktoryelsonuc *=i;

            System.out.println("verilen sayınınfaktoryel degeri:" + faktoryelsonuc);
        }

    }
}
