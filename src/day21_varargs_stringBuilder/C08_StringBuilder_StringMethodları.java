package day21_varargs_stringBuilder;

public class C08_StringBuilder_StringMethodları {

    public static void main(String[] args) {

        /*

             StringBuilder ile bazı string method'ları kullanılabılır
             bize string veya char donduren method'lar
             kalıcı değişiklikler yapmazlar

             bazı String method'ları ise StringBuilder'da yoktur
             kullanmak istersek
             sb.ToString() ile önce String'e çevirir, sonra istenen String method'u kullanılabiliir
             böyle yapılan değişiklikler sb'da kalcı değişiklk YAPMAZ

         */

        StringBuilder sb = new StringBuilder("java");

        System.out.println(sb.substring(2));

        System.out.println(sb);

        System.out.println(sb.charAt(2)); //va

        System.out.println(sb);

        System.out.println(sb.charAt(2)); //v

        System.out.println(sb); // java

        //void olan charAt () kalıcı degişiklikler yapar
        sb.setCharAt(0,'H');
        System.out.println(sb);

        //sb "a" içeriyor mu ?

        System.out.println(sb.toString().contains("a")); //true


    }
}
