package day12_scope;

public class C04_Scope_dafaultValues {

    String str ="java";
    String str2 ;
    int sayı = 23;
    int sayı2;

    static boolean bl =true;
    static boolean bl2;
    static char chr ='a';
    static char chr2 ;

    public static void main(String[] args) {

        String metin;
        //System.out.println(metin);

        // System.out.println(str);
        //System.out.println(sayı);
        System.out.println(bl); //true
        System.out.println(bl2); //false
        System.out.println(chr); //a
        System.out.println(chr2); //hiçlik
        //staticOlmayanMethod();
        //static olan main method içerisinden static olmayan bir method direk ÇAĞIRILAMAZ

        //static methodlar içerisinden
        //static olmayan class uyelerine ulaşmak istersek
        //obje olusturmamız gerekir

        C04_Scope_dafaultValues obj = new C04_Scope_dafaultValues();
        obj.staticOlmayanMethod();
    }
    /*
      local veriable'lar deger atamadan oluşturulabilir
      ANCAK deger atamadan KULLANILAMAZ

      class level veriable'lar size
      ister static olsun ister static olmasın
      deger atamadan da KULLANILABİLİR

      class level veriable'lara deger atamazsak
      java default olarak belirlediği degerleri atar

      default java degerleri

      char ==>hiçlik
      boolean ==>false
      sayısal primitivler ==>0

     */

    public void staticOlmayanMethod(){
        System.out.println(str); //java
        System.out.println(str2);// null
        System.out.println(sayı); //23
        System.out.println(sayı2); //0



    }



    }


