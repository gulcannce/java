package day13_Arrays;

public class C06_Arrays {

    public static void main(String[] args) {

        //verieln bir array'de istenen bir elemanın var olup olmadıgını
        //ve varsa kaç kere kullaıldıgını yazdıran bir method oluşturun

        int[]arr ={3,4,2,6,5,4,5,7,8,2,3,9,};
        int arananSayı = 3;

        elemanSAyısıYazdır(arr,3);//aranan eleman array da 2 kere kullanılmış
        elemanSAyısıYazdır(arr,11);//aranan eleman array'de yok
        elemanSAyısıYazdır(arr,7);//aranan eleman array'da 1 kere kullanılmış


    }

    public static void elemanSAyısıYazdır(int[] arr , int arananSayı){

        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == arananSayı){
                sayac++;
            }

        }
    }
}
