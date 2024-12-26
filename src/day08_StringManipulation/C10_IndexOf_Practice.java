package day08_StringManipulation;

import java.util.Scanner;

public class C10_IndexOf_Practice {
    public static void main(String[] args) {

        /*
         Kullanıcan bir metin alıp metinde birden fazla a harfi varsa a harfinin ikincisinin
        hangi indexte olduğun yazdırın. Bir tane varsa bir tane var yazdırın
        -Test data: Kitaplar bizim dostlarimizdir.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz..");

        String metin = scanner.nextLine();
        String arananHarf = "a";

        int arananHarfinIlkIndexi = metin.indexOf(arananHarf);
        System.out.println(arananHarfinIlkIndexi); //3

        int arananHarfinIkınciIndexi = metin.indexOf("a", arananHarfinIlkIndexi + 1);
                                    // a harfini ara, ilk indexten sonraki indexten kontrol etmeye başla
        System.out.println(arananHarfinIkınciIndexi);//6
    }
}
