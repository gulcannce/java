package day08_stringManipulations;

public class C03_replaceAll {
    public static void main(String[] args) {

        String str = "Arama sonucunda  1434 kelimeye ulaşıldı";

        //arama sonuçlarının 100 den fazla olduğunu test edin
        // 100'den fazla ise "Test Passed",
        //100den fazla değilse "Tesr Failed yazdırın

        str = str.replaceAll("\\D" , "" ); //1434
        int sonucSayısı = Integer.parseInt(str);
        // parseInt() içinde sadece digit bulunan String'i
        //interger'a dönuşturur



        if (sonucSayısı  > 100 ) {
            System.out.println("Test passed");
        }else{
            System.out.println("Test Failed");


        }
    }
}
