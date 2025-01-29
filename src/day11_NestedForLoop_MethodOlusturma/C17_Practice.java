package day11_NestedForLoop_MethodOlusturma;

import java.util.Scanner;

public class C17_Practice {
    public static void main(String[] args) {
        // Kullanicidan bir sifre isteyin
        // C16'daki method'u kullanarak sifreyi kontrol edin
        // ve sifre uygun oluncaya kadar islemi tekrar edin
        // sifre uygun oldugunda kac denemede uygun sifre yazabildigini soyleyin


        Scanner scan = new Scanner(System.in);

        boolean sormayaDevamEdeyimMi = true;
        int sayac =1;

        while (sormayaDevamEdeyimMi) {
            System.out.println("Lutfen bir sifre giriniz: ");
            String sifre = scan.next();

            if (day11_NestedForLoop_MethodOlusturma.C16_SifreDogruMuDondur.sifreDogruMu(sifre)) {
                System.out.println(sayac + " denemede gecerli degeri bildiniz");
                sormayaDevamEdeyimMi =false;
            }
            sayac++;
        }
    }
}


