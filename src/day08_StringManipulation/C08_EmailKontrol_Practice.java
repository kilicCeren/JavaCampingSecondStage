package day08_StringManipulation;

import java.util.Scanner;

public class C08_EmailKontrol_Practice {
    /*

       SORU : kullanicidan bir mail alin
     - mail @ icermiyorsa “gecersiz mail”
     - mail @gmail.com icermiyorsa, “mail gmail olmali”
     - mail @gmail.com ile bitmiyorsa, “mailde yazim hatasi var”
       yazdirin

       //C07 deki sorunun if else if ile farkli cozumu

        */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Mail adresinizi giriniz : ");
        String mail = scan.nextLine();

        if (!mail.contains("@")) {
            System.out.println("Geçersiz Mail");
        } else if (!mail.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");
        }


    }
}
