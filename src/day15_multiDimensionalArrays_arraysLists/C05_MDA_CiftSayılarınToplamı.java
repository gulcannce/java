package day15_multiDimensionalArrays_arraysLists;

public class C05_MDA_CiftSayılarınToplamı {
    public static void main(String[] args) {

        //verilen 2 katlı bir array'de bulunan cift sayıları toplayın,
        //sonucu yazdıran bir method olusturun.

        int[][] arr = {{1,4,7},{3,5},{1,9,0,8},{2}}; //Array'deki çift sayıların toplamı : 14
        ciftsayılartoplamınıyazdır(arr);

    }

    public static void ciftsayılartoplamınıyazdır(int[][] arr){

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j] % 2 == 0){
                    toplam += arr[i][j];
                }

            }

        }
        System.out.println("Array'deki çift sayıların toplamı : " + toplam);

    }

}
