package day06_stringManipulations;

public class C04_charAt {
    public static void main(String[] args) {

        String str = "Java gun geçtikçe güzelleşiyor";

        //ilk harfi yazdırın
        System.out.println(str.charAt(0));

        System.out.println(str.charAt(4));

        // str£∂æ 31 karakter var
        // son karakter olan .'ının indeksi 30 olur

        // son karakteri yazdırın
        System.out.println(str.charAt(31 -1)); // .

        // sondan 5. karakteri yazdırın
        System.out.println(31 -5); // i

        // str 'da olmayan bir index istersek
       // System.out.println(str.charAt(44)); // //StringIndexOutOfBoufsException



    }
}
