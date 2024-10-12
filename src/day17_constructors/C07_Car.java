package day17_constructors;

public class C07_Car {


        String marka = "marka atanmamış";
        String model = "model atanmmaış";
        String renk = "renk atanmamış";
        int yıl = 1990;
        int fiyat;

        C07_Car() {
        }

        C07_Car(String mrk, String mdl) {
                marka = mrk;
                model = mdl;
        }

        C07_Car(String mrk, String mdl, int yl, int fyt) {
                marka = mrk;
                model = mdl;
                yıl = yl;
                fiyat = fyt;
        }

        @Override
        public String toString() {
                return "C07_Car{" +
                        "fiyat=" + fiyat +
                        ", marka='" + marka + '\'' +
                        ", model='" + model + '\'' +
                        ", renk='" + renk + '\'' +
                        ", yıl=" + yıl +
                        '}';
        }
}



















