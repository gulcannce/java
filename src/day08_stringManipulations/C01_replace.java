package day08_stringManipulations;

public class C01_replace {
    public static void main(String[] args) {

        String str = "Java candır ";

        System.out.println(str.replace('a' , 'q'));  //java candır

        System.out.println(str.replace("java" , "tava")); //tava candır

        System.out.println(str.replace("Java" , "X ")); //X candır

        System.out.println(str.replace("x" ,"y")); //Java candır

        System.out.println(str.replace("a" , "e"). replace("i" , "a"));
        // jeve cendar

        System.out.println(str.replace("i", "a") .replace("a" ,"e"));
        // jeve cender

        // değişecek metin sadece ilk değer için değişsin diyorsak
        //replace() yerine replacıFisrt() kullanılır

        System.out.println(str.replaceFirst("a","x")); //jxva candır

        //regex : regular expression : belirlenmiş kısaltmalar
        //ilk harfi * yapalım
        System.out.println(str.replaceFirst("\\w","*")); //*ava candır

        // varsa ilk string içindeki ilk rakamı yapalım
        str = "Java 44Candır";

        System.out.println(str.replaceFirst("\\d" , "x")); // java +4Candır





    }


}
