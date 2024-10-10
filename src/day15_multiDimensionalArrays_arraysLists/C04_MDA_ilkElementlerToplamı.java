package day15_multiDimensionalArrays_arraysLists;

public class C04_MDA_ilkElementlerToplamı {

    public static void main(String[] args) {

        //verieln bir MDA'de
        //her inner array'in ilk elementlerinin toplamını
        //bize donduren bir method olusturun

        int [][]arr = {{1,4,7},{3,5},{1,9,0,8},{5,2}};
        System.out.println("ilk elementler toplamı: " +ilkElemanlarToplamı(arr));
    }

    public static int ilkElemanlarToplamı(int[][] arr){

        //tum elemanlara ihtiyacımız yok
        //for loop inner array'leri getirirse, biz o inner Array'ın ilk elemanı alırız
        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {

            toplam += arr[i][0];

        }
        return toplam;

    }
}
