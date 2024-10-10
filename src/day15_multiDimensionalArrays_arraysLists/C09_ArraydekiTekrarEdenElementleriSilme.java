package day15_multiDimensionalArrays_arraysLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydekiTekrarEdenElementleriSilme {

    public static void main(String[] args) {

        //verilen bir array'de,
        //tekrar eden elementleri silip
        //array'i her elementin unique oldugu hale getirin


        int[] arr = {3,2,5,6,7,2,8,9,0,1,2,3,4,7,5,4};

        // bir list olusturalım
        List<Integer> uniqueList = new ArrayList<>();
        //array'ın tum elemanlarını tek tek ele alalım
        //liste'de olup olmadıgına bakalım,listede yoksa ekleyelim

        for (int i = 0; i < arr.length ; i++) {

            if (!uniqueList.contains(arr[i])){
                uniqueList.add(arr[i]);
            }


        }
        System.out.println("Unique list : " + uniqueList);
        //Unique list : [3, 2, 5, 6, 7, 8, 9, 0, 1, 4]


        //yeni bir array oluşturalım
        int[] yeniArr = new int[uniqueList.size()];
        System.out.println(Arrays.toString(yeniArr)); //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]


        //listedeki elementleri yeni array'e deger olarak atayalım

        for (int i = 0; i < yeniArr.length ; i++) {
            yeniArr[i] = uniqueList.get(i);

        }

        //yeni array'i de eski array'e deger olarak atayalım
        arr = yeniArr ;
        Arrays.sort((arr));

        System.out.println("Array^ın son hali : " + Arrays.toString(arr));
        //Array^ın son hali : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

    }
}
