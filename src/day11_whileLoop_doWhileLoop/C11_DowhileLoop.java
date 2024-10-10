package day11_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C11_DowhileLoop {
    public static void main(String[] args) {

        //kullanıcıdan bir pozitif sayı izteyin,
        //sayının tam kare olup olmadıgını bulunuz
        //tamkare ise degeri, tam kare değilse uyarı yazdırır
        //ornek: ınput : 16, output : 4
        //       input : 23 output : tamkare degil

        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen tam kare olmasını kontrol etmek için bir tam sayı giriniz");
        int girilenSayı =scanner.nextInt();
        int karekok =1;
        do{
            if (karekok * karekok == girilenSayı){
                System.out.println("girilen sayı bir tam kare. karekok degeri :" + karekok);
            }
            karekok++;

        }while (karekok * karekok < girilenSayı);
    }
}
