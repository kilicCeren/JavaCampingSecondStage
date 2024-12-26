package day08_StringManipulation;

import java.util.Scanner;

public class C10_IndexOf_Practice {
    public static void main(String[] args) {

        /*
         Kullanıcan bir metin alıp
         metinde birden fazla a harfi varsa a harfinin ikincisinin
         hangi indexte olduğun yazdırın.
         Bir tane varsa bir tane var yazdırın
         metinde yoksa metinde hic a harfi yok yazdirin
        -Test data: Kitaplar bizim dostlarimizdir.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz...");

        String metin = scanner.nextLine();
        String arananHarf = "a";

        int arananHarfinIlkIndexi = metin.indexOf(arananHarf);

        int arananHarfinIkınciIndexi = metin.indexOf("a", arananHarfinIlkIndexi + 1);
                                     // a harfini ara, ilk indexten sonraki indexten kontrol etmeye başla

        if (arananHarfinIlkIndexi==-1){
            System.out.println("Metinde hiç 'a' harfi yok.");
        } else if (arananHarfinIkınciIndexi ==-1){
            System.out.println("Metinde sadece bir tane 'a' harfi var.");
        }else {
            System.out.println("'a' harfinin ikinci geçtiği index: " + arananHarfinIkınciIndexi);
                                //'a' harfinin ikinci geçtiği index: 6
        }
    }
}
