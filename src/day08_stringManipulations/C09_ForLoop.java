package day08_stringManipulations;

public class C09_ForLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 10 ; i++){

            System.out.print(i +" ");

        }

        System.out.print("");
        //100'den 200ê kadar (sınırlar dahil) cift sayilari yazdırın.

        for (int i = 100; i <=200 ; i+=2) {

        }
            System.out.println("");
            //100'den 200ê kadar (sınırlar dahil) cift sayilari yazdırın.
        for (int i = 100; i <=200 ; i++ ) {

            if ( i % 2 == 0) {
                System.out.print(i + " ");

                // 200den ile 270 arasında (sınırlar dahil) 7'nin katı olan yazılari yazdirin

            }
        }
         for (int i = 200; i <=270 ; i++) {
             if (i % 7 == 0) {

                 System.out.print(i + " ");

             }

             //200'den başalayıp,150E kadar (sinirlar dahi) 3'er 3'er atlayarak yazdırın

         }
         for(int i = 200; i >= 150 ; i-=3) {
                 System.out.print(i + " ");

             }
         }


        }










