package day12_scope;

public class C06_ınstanceVeStaticVariableKullanımı {


    //okul uygulaması yaptığımızı düşenelim

    static String okulIsmi = "yıldız koleji";
    static String mudur = "fikret zeybek";
    static String okulAdresi = "çankaya";

    String ogretmenIsmı = "isim atanamdı";
    String ogretmenAdresi = "adres girilmedi";
    String ogretmenTel = "tel girilmedi";

    public static void main(String[] args) {

        C06_ınstanceVeStaticVariableKullanımı ogr1 = new C06_ınstanceVeStaticVariableKullanımı();
        System.out.println(ogr1.ogretmenAdresi); //adres girilmedi
        ogr1.ogretmenIsmı = "omer";
        ogr1.ogretmenAdresi = "kızılay";
        System.out.println(ogr1.mudur); //fikret zeybek

        C06_ınstanceVeStaticVariableKullanımı ogr2 = new C06_ınstanceVeStaticVariableKullanımı();
        System.out.println(ogr2.ogretmenIsmı); //isim atanamdı
        ogr2.ogretmenIsmı = "zeliha";

        C06_ınstanceVeStaticVariableKullanımı ogr3 = new C06_ınstanceVeStaticVariableKullanımı();
        System.out.println("==========");
        System.out.println(ogr1.ogretmenIsmı); //ömer
        System.out.println(ogr2.ogretmenIsmı); //zeliha
        System.out.println(ogr3.ogretmenIsmı);

        System.out.println(ogr1.okulIsmi); //yıldız koleji
        System.out.println(ogr2.okulIsmi); //yıldız koleji
        System.out.println(ogr3.okulIsmi); //yıldız koleji

        ogr1.ogretmenAdresi ="yeni mahalle";

        System.out.println(okulAdresi); //yıldız mahallesi
        System.out.println(ogr2.ogretmenAdresi); //yıldız mahallesi
        System.out.println(ogr3.ogretmenAdresi); //yıldız mahallesi




    }





}
