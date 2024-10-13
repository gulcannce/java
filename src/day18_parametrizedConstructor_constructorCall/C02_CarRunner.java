package day18_parametrizedConstructor_constructorCall;

import day17_constructors.C01;
import day17_constructors.C07_Car;

import javax.swing.plaf.metal.MetalIconFactory;

public class C02_CarRunner {

    public static void main(String[] args) {
       C01_Car car1 = new C01_Car();

        System.out.println("Car1"+ car1);
        //Car1 Ozellikler ==>fiyat=0, marka='marka atanmamış', model='model atanmmaış', renk='renk atanmamış', yıl=1990,fiyat=0
    car1.marka ="BMV";
    car1.model = "116";
    car1.yıl = 2010;
    car1.fiyat = 75000;
        System.out.println("Car1" + car1);
       // Car1 Ozellikler ==>fiyat=75000, marka='BMV', model='116', renk='renk atanmamış', yıl=2010,fiyat=75000

        //marka, model ve renk degerlerini parametre olarak
        //yollayabileceğimiz bir constructor olusturalım

        C01_Car car2 = new C01_Car ("Nissan", "Micra","mavi");
        System.out.println("Car2"+ car2);
       // Car2 Ozellikler ==>fiyat=0, marka='Nissan', model='Micra', renk='mavi', yıl=1990,fiyat=0

        C01_Car car3 = new C01_Car("Opel", "Corsa", "Beyaz");
        System.out.println("Car3" + car3);
        //Car3 Ozellikler ==>fiyat=0, marka='Opel', model='Corsa', renk='Beyaz', yıl=1990,fiyat=0

        //marka, mode, renk ve fiyat parametreleri olan
        //bir constructor olusturun

        C01_Car car4 = new C01_Car("Peugeot", "206", "Turuncu", 5000);
        System.out.println("Car4" +car4);
        //Car4Ozellikler, marka='Peugeot', model='206', renk='Turuncu', yıl=1990fiyat=5000







    }
}
