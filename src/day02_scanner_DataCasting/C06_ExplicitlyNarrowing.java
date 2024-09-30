package day02_scanner_DataCasting;

public class C06_ExplicitlyNarrowing {

    public static void main(String[] args) {

        int sayi = 20;

        byte byt = (byte) sayi;
        System.out.println("20'nin byte olarak karşılıgı :"+ byt);
        // 20'nin byte olarak karşılıgı :20


        sayi = 130 ;
        byt = (byte) sayi;
        System.out.println("130'un byte olarak karşılığı : " + byt);
        // 20'nin byte olarak karşılığı : 20

       // 130'un byte olarak karşılığı : -126

        sayi = 256 ;
        byt = (byte) sayi;
        System.out.println("256'un byte olarak karşılığı : " + byt);
        // 20'nin byte olarak karşılığı : 20

        // 130'un byte olarak karşılığı : -126

        sayi = 567 ;
        byt = (byte) sayi;
        System.out.println("567'in byte olarak karşılığı : " + byt);
        // 567'nin byte olarak karşılığı : -128

        sayi = 640 ;
        byt = (byte) sayi;
        System.out.println("640'inn byte olarak karşılığı : " + byt);
        // 640'nin byte olarak karşılığı : -128




    }
}
