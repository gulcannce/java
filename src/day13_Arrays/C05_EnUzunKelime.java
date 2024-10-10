package day13_Arrays;

public class C05_EnUzunKelime {
    public static void main(String[] args) {

        //verieln bir String array'daki
        //en uzun ve en kısa kelimeleri yazdıran bir method olusturun

        String[] isimler ={"Zehra","Huseyin","Mehmet","Esra","Ali","Ercan","ömer"};

        enUzunEnKısaYazdır(isimler);

    }

    public static void enUzunEnKısaYazdır(String[]arr){

        String enKısaİsim = arr[0];
        String enUzunİsim = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(arr[i].length()>=enUzunİsim.length()){
                enUzunİsim = arr[i];

            }
            System.out.println("en uzun isim:" + enUzunİsim);
            System.out.println("en kısa isim:" + enKısaİsim);


        }
    }
}
