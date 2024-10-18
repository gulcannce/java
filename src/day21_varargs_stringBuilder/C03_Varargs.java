package day21_varargs_stringBuilder;

public class C03_Varargs {

    // 1 int ve istenen kadar String parametre alıo
    //String parametre sayısı ile int sayısının carpımını yazdıran
    // bir method olusturun

    public static void main(String[] args) {

        işlemYap(5,"a","b","c"); // 5* 3=15
        işlemYap(2,"a"); //2*1 =2
        işlemYap(5); //5*0 //0
        işlemYap(3,"","","","",""); //3*5 =15
    }

    public static void işlemYap(int sayı,String... strings){

        System.out.println(sayı * strings.length);
    }


}
