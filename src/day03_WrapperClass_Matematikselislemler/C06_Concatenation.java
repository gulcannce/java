package day03_WrapperClass_Matematikselislemler;

public class C06_Concatenation {

    public static void main(String[] args) {


        String s1 = "Java";
        String s2 ="Kolaydır";
        String s3 = " ";
        String s4 = " ";

        int a = 4 ;
        int b = 3 ;

        // sadece verilen variable' ları kullanarak asağıda metinleri yazdırın

        // java kolaydır 12
        System.out.println(s1+s2+s3+a*b);

        //java 7 kolaydır

        System.out.println(s1+a+b+s2); // java7kolaydır

        // 43java
        System.out.println(s4 +a + b + s1 );  // 43java

        System.out.println(a + (b + s1 ));




    }
}
