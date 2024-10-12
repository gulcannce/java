package day17_constructors;

import java.util.concurrent.Callable;

public class C08_CarRunner {

    public static void main(String[] args) {


        C07_Car car1 = new C07_Car();

        System.out.println(car1.marka); // marka atanmamış
        System.out.println(car1.model); // model atanmamış

        System.out.println(car1);//day17_constructors.C07_Car@2f4d3709
        System.out.println(car1.toString());


        //eger bir class'dan obje olusturdugumuzda
        //objenin tum özelliklerini tek bir sout ile uazdırmak isterseniz
        //o class'a toString() olusturmalısınız


        System.out.println(car1);
        // C07_Car{marka= 'marka atanmamış', model = model atanmamış', renk = renk atanmamış'}
        //C07_Car özellikler ==>marka: 'marka atanmamış', model = model atanmamış', renk = renk atanmamış'

        C07_Car car2 = new C07_Car();
        car2.marka = "Toyota";
        car2.model = "Corolla";
        car2.renk = "Kırmızı";
        car2.yıl = 2015;
        car2.fiyat = 10000;
        System.out.println(car2);
        //C07_Car Özellikler ==> marka:'tıyıta', model:'Corolla',renk :'kırmızı',yıl:'2015',fiyat:'10000'

        C07_Car car3 = new C07_Car();
        car3.marka = "Mercedes";
        car3.model = "E200";
        car3.renk = "Siyah";
        car3.yıl = 2015;
        car3.fiyat = 15000;
        System.out.println(car3);
        //C07_Car{fiyat=15000, marka='Mercedes', model='E200', renk='Siyah', yıl=2015}

        //Eger atamayı her seferinde tek tek yapmak istemezseniz
        //atama işlemini constructor'da yapabiliriz

        C07_Car car4 = new C07_Car("Porsche", "Carrera");
        System.out.println(car4);
        //C07_Car{fiyat=0, marka='Porsche', model='Carrera', renk='renk atanmamış', yıl=1990}

        C07_Car car5 = new C07_Car("Citroen", "C3");
        System.out.println("Car5:" + car5);
        //Car5:C07_Car{fiyat=0, marka='Citroen', model='C3', renk='renk atanmamış', yıl=1990}


    }

        }





