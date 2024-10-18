package day21_varargs_stringBuilder;

public class C06_StringBuilder_length_capacity {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        //içinde hiç bir yazı yok, length ==>0
        System.out.println("sb1 lenght :" + sb1.length()); //0
        System.out.println("sb1 capacity : " +sb1.capacity()); //16


        StringBuilder sb2 = new StringBuilder("Ali can");
        //içinde ali can var , lenght ==> //7
        System.out.println("sb2 lenght :" + sb2.length()); //7
        System.out.println("sb2 capacity :" + sb2.capacity());//16+7 =23


        StringBuilder sb3 = new StringBuilder(11);
        //içinde ali can var , lenght ==> //0
        System.out.println("sb3 lenght :" + sb2.length()); //0
        System.out.println("sb3 capacity :" + sb2.capacity());//16

        //eger stringBuilder'a ekleme yaparsak
        //java eklenecek metni de alabilmesi için
        //sb'in kapasitesini 2* eski kapasite +2 şeklinde artırır

        sb2.append(" okula gitmek istiyor");
        System.out.println("sb2 : " + sb2);
        System.out.println("sb2 lenght :" + sb2.length()); //
        System.out.println("sb2 capacity :" + sb2.capacity());//

        //eger kapasite ve lenght'i esitlemek istersek

        sb2.trimToSize();

        System.out.println("sb2 : " + sb2);
        System.out.println("sb2 lenght :" + sb2.length()); //
        System.out.println("sb2 capacity :" + sb2.capacity());//

    }
}
