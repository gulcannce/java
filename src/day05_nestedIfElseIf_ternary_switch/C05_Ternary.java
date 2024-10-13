package day05_nestedIfElseIf_ternary_switch;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {


        //kullanıdan bir pozitif tam sayı alın
        //sayının cift veya tek olduğunu yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen pozitif bir tam sayı girin ");
        int sayı = scanner.nextInt();

        //sorunun ıf else ile çözümü

        if(sayı % 2 == 0) {
            System.out.println("sayı çift");
        }else {
            System.out.println("sayı tek");


            //ternary ile çözümü

            System.out.println(sayı % 2 == 0 ? "cift sayı" : "tek sayı");

            // sayı 100 den buyukse sayıyı 2 katına çıkaran,
            //100 den buyuk değilse degerini 10 arttırın

            sayı = sayı >  100 ? 2 * sayı : sayı +10 ;

            System.out.println("ternayden sonra sayı : " + sayı);

            // sayının yeni hali 100 den buyuk ise ésayı zaten buyuk" yazdırın
            // yeni hali 100 den buyuk değilse sayıyı 2 katına çıkarın

            System.out.println(sayı>100 ? "sayı zaten büyük" : 2*sayı);
            // sadece yazdırma veya sadede atama olan sorularda ternary kullanılabilir
            // ama ikisi farklı işlemler olduğunda kullanışlı olmaz
            // bu soru da 2 katını yazdırdı ama soruda atama istiyordu.yapmadı


        }
    }
}
