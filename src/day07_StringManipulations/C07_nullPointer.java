package day07_StringManipulations;

public class C07_nullPointer {
    public static void main(String[] args) {


        String str;

        //System.out.println(str);
        //java da main method icerisinde deger atamadan bir varible oluşturabiliriz
        //Ancak deger atamadan kullanamayız

        String str2 ="" ;
        System.out.println(str2); //hiçlik yazdırır
        //str2'yi kullanabilmek için hiçlik değeri atayabiliriz
        // anacak hiçlik değeri atanan variable'ları
        //java deger atanmış olarak sınıflandırmaz
        //deger atananlar grubuna koyar

        /*

        java deger atamamış variable'ları işaretlemek için
        özel olarak null keyworld'unu oluşturmuştur


        Aşagıdaki örnekte
        str4'de hiçlik değeri atanmıştır
        str5'e Tava değeri atanmıştır
        str3 ise null olarak İŞARETLENMİŞTİR

        null bir değer değil İŞARETTİR
        str3'un oluşturulduğunu ve bir değer atana kadar
        bu şekilde kullanılmak istendiğini Java'ya söyler

        null olarak işaretlenen bir String'i
        yazdırabilirsiniz
        ancak method'larda kullanamazsınız

         */


        //string str3 = true ;
        //string str3 = 45  ;
       // String str3 = 'f' ;
        String str3 =null ;
        String str4 ="";
        String str5v="tava" ;

        System.out.println(str3); //null

       // System.out.println(str3.isBlank()); // NullPointerExceptin

       //System.out.println(str3.substring(0,1)); //NullPointerExceptin

        //System.out.println(str3.charAt(0)); //NullPointerExceptin

        //System.out.println(str3.isEmpty()); //NullPointerExceptin

        System.out.println(str3 ==null); //true




    }
}
