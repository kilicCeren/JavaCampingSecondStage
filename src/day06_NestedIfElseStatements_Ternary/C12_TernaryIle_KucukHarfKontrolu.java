package day06_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C12_TernaryIle_KucukHarfKontrolu {
    public static void main(String[] args) {

        // Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz: ");
        char karakter = scan.next().charAt(0);

        System.out.println(Character.isLowerCase(karakter) ? Character.toUpperCase(karakter) : karakter);
    }
}
