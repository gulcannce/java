package day8_stringManipulations;

import java.util.Scanner;

public class C05_StringManipulations {

    public static void main(String[] args) {

        //soru 1- kullanıcıdan bir cümle alın
       //         -cümlede ev geciyırsa, "home home sweet home" yazdırın
        //        -cümlede is geciyorsa, "calişmak güzeldir" yazdırın,
        //        -ikisini de içeriyorsa   "hem ev lazım hem is"
        //        -hiçbirini icermiyorsa "cok calışman lazım" yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cumle = scanner.nextLine();

        String buyukcumle =cumle.toUpperCase();

        if(buyukcumle.contains("EV") && buyukcumle.contains("is")) {
            System.out.println("hem ev lazım hem is");
        } else if (buyukcumle.contains("EV")) {
            System.out.println("home home sweet home");
        } else if (buyukcumle.contains("IS")) {
            System.out.println("calışmak güzeldir");
        }else System.out.println("çok çalışman lazım");


        }

    }





