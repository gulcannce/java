package day08_stringManipulations;

public class C06_StringManipulations {
    public static void main(String[] args) {

        // sory 2- kullanıcının belirli bir formata verdiğiString fiyatları toplayıpyazdırıni
        // input1 : 15.30 £, input2 : "11.40 £"
        //output : 26.70 £

        String fiyatStr1 = "15.30 £";
        String fiyatStr2 = "11.40 £" ;


        System.out.println(fiyatStr1 + fiyatStr2); //15.30 £ 11.40£

        int fiyat1 = Integer.parseInt(fiyatStr1.replaceAll("\\D" , ""));
        int fiyat2 = Integer.parseInt(fiyatStr2.replaceAll("\\D", ""));

        System.out.println("toplam fiyat :" + (double)(fiyat1 + fiyat2)/ 100 + "£");



    }
}
