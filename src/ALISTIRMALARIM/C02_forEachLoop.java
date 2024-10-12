package ALISTIRMALARIM;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class C02_forEachLoop {
    public static void main(String[] args) {

        ArrayList <String> meyvelerinadı = new ArrayList<>();

        meyvelerinadı.add("muz");
        meyvelerinadı.add("çilek");
        meyvelerinadı.add("erik");
        meyvelerinadı.add("kiraz");


        for  (int i = 3; i < meyvelerinadı.size(); i++) {
            System.out.println("lütfen meyvelerin adını yazdırın : " + meyvelerinadı);




        }

    }

}
