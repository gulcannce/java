package day14_arrays;

import java.util.Arrays;

public class C04_ArraysSort {

    public static void main(String[] args) {

        int [] arr1 ={3,9,1,0,12,87,4,6};

        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));

        String[] arr2 = {"İbrahım","Huseyın","Hasan","Ismail","Ishak","israfil","isa"};

        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr2));
        //[Hasan, Huseyin, Ibrahim, Ishak,  isa, israfil ]

        //ascii degerleri sebebiyle kucuk harfler sıralamada
        //buyuk harflerden sonra gelir

        //String'lerde sadece method calısınca yapılan degişiklikler  kalıcı olmaz
        //degişikliğin kalıcı olması için atama yapmalıyız
        //bur durum  String'den kaynaklanan özel bir durumdur (immutable class)

        String isim ="Ali";
        isim.toString();
        System.out.println(isim); //Ali

    }





}
