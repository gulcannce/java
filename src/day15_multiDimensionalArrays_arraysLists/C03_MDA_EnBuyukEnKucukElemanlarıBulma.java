package day15_multiDimensionalArrays_arraysLists;

public class C03_MDA_EnBuyukEnKucukElemanlarıBulma {
    public static void main(String[] args) {

        //verilen bir MDA'De en buyuk ve en kucuk sayıları bulup yazdıran bir method olusturun

        int[][] arr = {{1,4,7},{3,5},{1,9,0,8},{2}};
        enBuyukEnKucukElemanBul(arr);
    }

    public static void enBuyukEnKucukElemanBul(int[][]arr){

        int maxElement = arr[0][0];
        int minElement = arr[0][0];

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] > maxElement ){
                    maxElement = arr[i][j];

                }

                    if (arr[i][j] < minElement ){
                        minElement = arr[i][j];
                }

            }

        }
        System.out.println("Array'deki en buyuk sayı :" + maxElement);
        System.out.println("Array'deki en kuyuk sayı :" + minElement);
    }
}
