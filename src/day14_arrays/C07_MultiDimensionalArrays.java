package day14_arrays;

public class C07_MultiDimensionalArrays {
    public static void main(String[] args) {


        int[] arr ={3,6,8,1};

        //arr'nin tm elemnetlerini yazdırın

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i] + " ");

        }// 3 6 8 1
        System.out.println(" ");

        int[][] sayılar = {{3,5,6},{2,7},{1,5,8},{1}};
        //sayılar arrayIndaki tüm elemenleri yazdırın

        for (int i = 0; i < sayılar.length; i++) { //outer loop outer array'ı kontrol eder

            for (int j = 0; j < sayılar[i].length ; j++) { // inner loop da inner array'İ kontrol edecek

                System.out.print(sayılar[i][j] + "");
            }
            }//3 5 6 2 7 1 5 8 1

        }
    }






