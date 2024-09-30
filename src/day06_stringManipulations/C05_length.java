package day06_stringManipulations;

public class C05_length {
    public static void main(String[] args) {

        String str = "Java öğren işsiz kalma.";

        System.out.println(str.length()); //26

        //sondan 2. karakteri yazdırın

        //system.out.println(str.chaArt (26-2)): //z

        str = "Java";
        System.out.println(str.charAt(str.length()-2)); // v

        //kodlama da dinamak kod yazmak önemlidir
        //dinamik kod inpud'dan bilgileri alıp,
        //input değişse bile çalışmaya devam eden kod demektir

        //metnin son karakterini yazdırın

        System.out.println(str.charAt(str.length()-1)); // a

        str = "Java güzeldir";

        System.out.println(str.charAt(str.length())); //.
    }
}
