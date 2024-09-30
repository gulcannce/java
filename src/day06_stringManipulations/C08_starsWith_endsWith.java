package day06_stringManipulations;

public class C08_starsWith_endsWith {
    public static void main(String[] args) {

        String str = "Java candır";

        System.out.println(str.contains("a")); //true
        System.out.println(str.endsWith("a")); //false
        System.out.println(str.endsWith("a")); //false

        System.out.println(str.startsWith("java candır")); //true
        System.out.println(str.endsWith("Java candır")); //true

        System.out.println(str.endsWith("candır")); //false
        System.out.println(str.startsWith("")); //true
        System.out.println(str.endsWith("")); //true

        System.out.println(str.startsWith("java")); //false
    }
}
