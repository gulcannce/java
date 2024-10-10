package day13_Arrays;

public class C04_Arrays {
    public static void main(String[] args) {

        //verilen string bir array'de
        //istenilen harfi içeren elementleri yazdırın

        String [] isimler ={"hüseyin ","mehmet", "esra", "ercan", "omer"};
        String istenenHarf ="a";

        for (int i = 0; i < isimler.length ; i++) {

            if(isimler[i].contains(istenenHarf)){
                System.out.println(isimler[i] + " ");

            }

        }
    }
}
