package day06_stringManipulations;

public class C06_substring {
    public static void main(String[] args) {

        String str ="Java en güzel programlama dilir";

        System.out.println(str.substring(beginIndex: 5)); //en güzel programlama dili
        System.out.println(str.substring(beginIndex: 0)); // java en güzel programlama dili
        System.out.println(str.substring(beginIndex: 1)); //ava en güzel programlama dili

        //son 4 karakteri yazdırın

        System.out.println(str.substring(beginIndex: str.length() -4)); //java dili

        //metinden sadece Java'yı yazdırın
        System.out.println(str.substrin(0,4));

        //0.index'den başla 4 karakter yazdır
        //veya 0. index(dahil) ile 4. index (haric )arası

        //cümledeki 2. space'in index'i 7 ise
        //2. space'den sonraki 5 harfi yazdırın

        System.out.println(str.substring(8,13)); //güzel

        System.out.println(str.substring(0,1)); // j 0.index'deki karakteri
        System.out.println(str.substring(3,4)); //a 3. index'deki karakteri

        //6.index'deki harfi String olarak kaydedin

        System.out.println("bas indexi ve bitiş indexsi aynı olursa :" +str.substring(5,5)+ "---"); //""

        System.out.println(str.substring(5,2)); // StringIndexOutBoundException :begin5,ende2






    }
}
