package day18_parametrizedConstructor_constructorCall;

public class C01_Car {

    String marka = "marka atanmamış";
    String model = "model atanmmaış";
    String renk = "renk atanmamış";
    int yıl = 1990;
    int fiyat;

    public C01_Car() {
    }
    // renk = "Kırmız";
        /*
           default constructor ile parametresiz constructor'in en buyuk farkı
           default cons. body'si bos iken
           parametresiz cons.'lara kod yazılır
           bu durumda yapılan atamalar tum araclar için standart olarak uygulanır
         */

    public C01_Car(String mrk, String mdl, String rnk) {
    }

    C01_Car(String marka, String model, String renk, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.fiyat = fiyat;
    }

    //tum instance'lar için parametre bir cons. olusturalım


    public C01_Car(int fiyat, String marka, String model, String renk, int yıl) {
        this.fiyat = fiyat;
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.yıl = yıl;
    }

    //model ve yıl parametreleri olsun
    // biz hep tıyota satıyoruz ve renleri de hep mavi


    public C01_Car(String model) {
        this.model = model;
        this.yıl = yıl;
        marka = "Toyota";
        renk = "Mavi";
    }

    public String toString() {
        return "Ozellikler" +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yıl=" + yıl +
                "fiyat=" + fiyat;
    }


    }

