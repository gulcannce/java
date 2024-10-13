package day05_nestedIfElseIf_ternary_switch;

import java.util.Scanner;

public class C04_NestedIfElse {
    public static void main(String[] args) {


        //soru 2- kullanıcıdan aldığı ürün adedi ve ürün fiyatını alın
        //        kullanıcıya müşteri kartı olup olmadığını sorun.
        //        müşteri kartı varsa
        //        10 urun ve ya fazla alırsa %20,
        //        10 üründen az aşırsa %15 indirim yapın
        //        müşteri kartı yoksa
        //        10 ürün veya fazla alırsa %15,
        //        10 üründen az %10 indirim yapın


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen aldığın ürün adedini giriniz");
        int ürünAdedi = scanner.nextInt();

        System.out.println("Lütfen ürün fiyatını giriniz");
        double ürünFiyatı = scanner.nextDouble();

        System.out.println("Müşteri kartınız var mı ? /nE : Evet  H: Hayır");
        char kartVarmı = scanner.next().toUpperCase().charAt(0);

        //ürün adedi ana değişken olsun

        if (ürünAdedi<=0) {
            System.out.println("ürün adedi bilgisi yanlış");

        }else if (ürünAdedi>=10){
            if (kartVarmı=='E') {
                System.out.println("%20 indirimli toptam fiyat : " + ürünAdedi * ürünFiyatı * 80 / 100);

            }else if (kartVarmı =='H') {
                System.out.println("%15 indirimli toptam fiyat :" + ürünAdedi * ürünFiyatı * 85 / 100);

            }else{ // ürün aadedi <10

                if (kartVarmı == 'E') {
                    System.out.println("%15 indirimli toptam fiyat :" + ürünAdedi * ürünFiyatı * 85 / 100);

                }else if (kartVarmı == 'H') {
                    System.out.println("%10 indirimli toplam fiyat :" + ürünAdedi * ürünFiyatı * 90 / 100);

                }else {
                    System.out.println("kart bilgisi yanlış" );
                }


            }
        }
    }
}
