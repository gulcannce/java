package day18_parametrizedConstructor_constructorCall;

import java.util.Collections;

public class C03_ConstructorCall {

    C03_ConstructorCall(){
        this("Java");

        System.out.println("Parametresiz constructor calıstı");

    }
    C03_ConstructorCall(int sayı){

        System.out.println("int Parametreli constructor calıstı");

    }
    C03_ConstructorCall(String metin){
        //C03_ConstructorCall();// mrthod Call Syntax'i oldugundan java bu isimle method arar
        this(6); //constructor call syntax!ı böyledir
                      // constructor adını degil this (istenen parametreler) yazarız




        System.out.println("String Parametreli constructor calıstı");


    }

    public static void main(String[] args) {

       C03_ConstructorCall obj1 = new C03_ConstructorCall("A");
       //int Parametreli constructor calıstı
        //String Parametreli constructor calıstı

        C03_ConstructorCall obj2 = new C03_ConstructorCall();
        //int Parametreli constructor calıstı
        //String Parametreli constructor calıstı
        //Parametresiz constructor calıstı
    }


}
