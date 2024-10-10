package day10_methodOlusturma_methodOverloading;

public class C10_MethodOverloading {

    public static void main(String[] args) {

        toplama(5, 7);

    }
    public static void toplama(double a, int b){
        System.out.println("double ve int 2 sayının toplamı :" + (a+b));

    }

    public static void toplama(double a , double b){ // toplama double double
        System.out.println("double ve double 2 sayının toplamı : " + (a+b));


    }
}
