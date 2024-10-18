package day21_varargs_stringBuilder;

public class C02_Varargs {

    public static void main(String[] args) {

        topla(3,5); //
        topla(3,5,7); //15

        /*

           method call sırasınd istediğim kadar ergument yazabilmek istiyorum

            java variety of arguments ==> varargs ile hizmetinizde

            varargs array alst yapısını kullanarak imkan tanır

         */

        topla(2); //2
        topla(2,5,9,1,3,5,7,1,3,4); //40
        topla(1,2,3,4,5,6); //21
        topla(1,2,3,4,5,6,7,8); //36
        topla(3,4,5,6,7); //25

    }

    public static void topla(int... sayı){
        int toplam=0;
        for (int each  : sayı
        ){
            toplam+= each;
        }
        System.out.println(toplam);

    }
}
