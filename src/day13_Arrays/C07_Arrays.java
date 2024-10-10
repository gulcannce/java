package day13_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C07_Arrays {
    public static void main(String[] args) {

        //kullanıcıdan array'ın boyutunu ve elementlerini alıp
        //arary'ı oluşturan ve bize donduren bir method olusturun.

        String[] kullanıcıdanAlınanArray = stringArrayOlustur();

        System.out.println(Arrays.toString(kullanıcıdanAlınanArray));

    }

    public static String[] stringArrayOlustur() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Arrayın uzunlugunu giriniz");
        int arrLength = scanner.nextInt();

        String[] kullanıcıArrayı = new String[arrLength];
        scanner = new Scanner(System.in);
        for (int i = 0; i < kullanıcıArrayı.length; i++) {

            System.out.println("array'ı eklemek için bir isim söyleyin");
            kullanıcıArrayı[i] = scanner.nextLine();
        }
            return kullanıcıArrayı;

        }
    }







