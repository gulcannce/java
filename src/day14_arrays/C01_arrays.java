package day14_arrays;

public class C01_arrays {
    public static void main(String[] args) {

        //verilen bir array'daki pozitif tam sayıları toplayın
        //sonucu bize donduren bir method yazınz

        int[] arr ={3,-5,4,2,17,8,3,-1};

        System.out.println(pozitifsayılarıTopla(arr)); // 20

    }
    public static int pozitifsayılarıTopla (int[]arr){

        int toplam = 0 ;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > 0){

                toplam +=arr[i];

            }

        }
        return toplam ;

    }
}
