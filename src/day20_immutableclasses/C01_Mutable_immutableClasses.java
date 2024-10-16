package day20_immutableclasses;

import java.util.ArrayList;
import java.util.List;

public class C01_Mutable_immutableClasses {

    public static void main(String[] args) {

        String sr = "Java";

        String str = new String("Java Candır");

        System.out.println(str.toUpperCase()); //JAVA CANDIR

        System.out.println(str); //Java Candır

        str.toString();

        //String methodlarında yaptıgı degışıklıler sadece o satır için gecerlidır
        //kalcı olmasını istersek atama yapmalıyız

        List<String>isimler = new ArrayList<>();

        isimler.add("Senayda");
        isimler.add("Aslı");
        isimler.add("Beytullah");

        System.out.println(isimler); //[Senayda, Aslı, Beytullah]

        isimler.set(1,"Yusuf");

        System.out.println(isimler); //[Senayda, Yusuf, Beytullah]
    }
}
