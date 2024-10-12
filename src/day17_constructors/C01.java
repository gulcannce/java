package day17_constructors;

import java.util.Random;

public class C01 {

    int sayı = 6;
    String str = "java candır";

    public void rastgeleSayıUret() {

        Random random = new Random();
        int rastgeleSayı = random.nextInt(1000);
        System.out.println("bugunku şanslı sayı :" + rastgeleSayı);
    }

    public void bugunNePisireyim() {

        String[] yemekler = {"kuru fasulye", "pilan", "cacık", "makarna", "mercimek corbası"};

        Random random = new Random();
        int yemekNo = random.nextInt(yemekler.length);
        System.out.println("bugunu yemek teklifi :" + yemekler[yemekNo]);
    }
}

