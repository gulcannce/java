package day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C03_FizzBuzz {

    public static void main(String[] args) {

        // soru 9- (interview)  -kullanıcadan pozitif bir sayı alın,
        //     -1 den başlayarak tum tam sayıları yazdırın,sıra
        //     -3 ile bölünebilen bir sayıya gelirse, sayı yerine Fizz
        //     -5 ile bölünebilen bir sayıya gelirse sayi yerine Buzz
        //     -hem 3 hem 5 ile bölünebilen bir sayıya gelirse sayı yerine fizzBuzz yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen pozitif bir tam sayi giriniz");
        int sayı = scanner.nextInt();


        for (int i = 1; i <=sayı ; i++){

            if (i% 3==0 && i%5 == 0) {
                System.out.println("fizzBuzz");
            }else if (i % 3 ==0) {
                System.out.print("fizz");
            }else if (i % 5 == 0) {
                System.out.print("buzz");
            }else{
                System.out.println(i +" ");


            }
        }
    }
}
