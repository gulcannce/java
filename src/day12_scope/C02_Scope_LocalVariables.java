package day12_scope;

public class C02_Scope_LocalVariables {

    /*
          bir method/kod blogu icerisinde olusturulan variable'lara local variable denir
          ve local veriable'ların scope'u  icerisinde olusturdukları kod blogudur

          Looplar da bagımsız kod bloklarıdır
          loop içersinde olusturulan veriable'ların scope'u
          içerisinde olusturdukları kod blugu olan loop ile sınırlıdır
          yanı loop içerisinde olusuturulan local veriable'lar
          loop dışında KULLANILAMAZ
     */


    public static void main(String[] args) {

        int satı =20;
        //System.out.println(str);
        //System.out.println(bl);
        String s= "hava";

        for (int i =0; i<10 ; i++){

            String str ="java";
            str +=i;
            s+=i;
        }
        //System.out.println(str);
        //System.out.println(i);
        System.out.println(s);

    }

    public static void staticmethod(){
        //System.out.println(sayı);
        String  str = "java";
        //System.out.println(bl);

    }

    public void staticOlmayanMedhot(){
        //System.out.println(sayı);
        //str = "tava";
        boolean bl =true;

    }
}
