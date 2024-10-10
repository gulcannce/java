package day15_multiDimensionalArrays_arraysLists;

public class C02_MDA_TumElemanlarıToplama {

    public static void main(String[] args) {

        //verilen bir MDA'deki sayıları toplayıp, toplamı yazdıran bir method olusturun

        int[][] arr = {{1,4,7},{3,5},{1,9,0,8},{2}};
        arraydekiElementleriTopla(arr); //Array'deki tum sayıların toplamı :40

        arraydekiElementleriTopla(new int [][]{{4,6,7}}); //Array'deki tum sayıların toplamı : 20



    }

    public static void arraydekiElementleriTopla(int[][]arr){

        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                toplam += arr[i][j];

            }

        }

        System.out.println("Array'deki tum sayıların toplamı :" + toplam);
    }
}
