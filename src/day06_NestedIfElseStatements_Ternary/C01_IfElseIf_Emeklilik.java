package day06_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C01_IfElseIf_Emeklilik {
    public static void main(String[] args) {

        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak
        // “Emekli olabilirsin” veya “Emekli olmak icin .. yil daha calisman gerekir” yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz K: Kadin, E: Erkek");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz...");
        double yas = scanner.nextDouble();


        if (cinsiyet == 'K' && yas >= 60 && yas < 80) {
            System.out.println("60 yasindan buyuk oldugunuz icin emekli olabilirsiniz");
        } else if (cinsiyet == 'K' && yas < 60 && yas > 20) {
            System.out.println("Emekli olmak icin " + (60 - yas) + " yil daha calismaniz gerekir");
        } else if (cinsiyet == 'E' && yas >= 65 && yas < 80) {
            System.out.println("65 yasindan buyuk oldugunuz icin emekli olabilirsiniz");
        } else if (cinsiyet == 'E' && yas < 65 && yas > 20) {
            System.out.println("Emekli olmak icin " + (65 - yas) + " yil daha calismaniz gerekir");
        } else {
            System.out.println("Girilen degerlerde hata var." +
                    "\nLütfen girdiginiz degerleri kontrol ederek tekrar giriniz...");
        }
    }
}
