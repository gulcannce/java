package day16_ArrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_KullanıcıyaListeOlusturtma {

    public static void main(String[] args) {

        //kullanıcıdan istediği kadar isim alıp,
        //Q'ya bastığında girdiği isimleri
        //bize liste olarak döndürecek bir meyhod olusturun

        System.out.println(listeOlustur());
    }

    public static List<String> listeOlustur() {

        List<String> isimler = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String girilenisim ;

        do {
            System.out.println("listeye eklmek için bir isim yazın" +
                    "\nVeya islemi sonlandırmak için Q'ya basın");
            girilenisim = scanner.nextLine();

            if (!girilenisim.equalsIgnoreCase("q")) {
                isimler.add(girilenisim);
            }

        }while (!girilenisim.equalsIgnoreCase("Q"));

        return isimler;






       }
}
