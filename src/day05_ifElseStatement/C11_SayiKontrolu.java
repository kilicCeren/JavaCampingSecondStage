package day05_ifElseStatement;

import java.util.Scanner;

public class C11_SayiKontrolu {
    public static void main(String[] args) {

        // kullanicidan pozitif bir tamsayi isteyin
        // kullanici negatif sayi girerse uyarin
        // tek basamakli bir sayi girerse "girdiginiz sayi rakam"
        // kullanici 10-99 arasinda (sinirlar dahil) sayi girerse "iki basamakli sayi"
        // kullanici 100-999 arasinda (sinirlar dahil) sayi girerse "uc basamakli sayi"
        // kullanici 1000 veya daha buyuk sayi girerse "cok buyuk sayi" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz: ");
        int sayi = scan.nextInt();

        if (sayi < 0) System.out.println("Negatif sayi girilemez...");
        else if (sayi <= 9) System.out.println("Girdiginiz sayi bir rakam");
        else if (sayi <= 99) System.out.println("Girdiginiz sayi iki basamakli bir sayi");
        else if (sayi <= 999) System.out.println("Girdiginiz sayi Uc basamakli bir  sayi");
        else System.out.println("Girdiginiz sayi cok buyuk birsayi");

    }
}
