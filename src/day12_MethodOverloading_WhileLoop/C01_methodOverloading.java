package day12_MethodOverloading_WhileLoop;

public class C01_methodOverloading {
    public static void main(String[] args) {

        /*
        Bir class içinde aynı isme sahip fakat farklı signature'a sahip methodlar yer alabilir
        Bu duruma method overloading denir

        Java'da bir method çalıştırıldığında eğer aynı isimli başka bir method varsa
        Java argumentlerin uyumuna bakar
        Uyum %100 olan varsa onu çalıştırır, yoksa en az casting yapacağına bakıp onu çalıştırır.
        Casting yaparak çalışıtracağı yoksa hata verir
        Eğer method call ile çağırdığımız methoda ygun bir method yoksa
        CTE verir ve kod çalışmaz


        Method Signature: method adı+argumentler(parametreler)

   */

        topla(3, 7);     //21
        topla(185, 325);     //60125
        topla(3, 2.1);   //6.300000000000001
        topla(2.59, 125.3);      // 324.527


    }

    public static int topla(int sayi1, int sayi2) {
        System.out.println(sayi1 * sayi2);
        return (sayi1 * sayi2);
    }

    public static double topla(int sayi1, double sayi2) {
        System.out.println(sayi1 * sayi2);
        return (sayi1 * sayi2);
    }

    public static double topla(double sayi1, double sayi2) {
        System.out.println(sayi1 * sayi2);
        return (sayi1 * sayi2);
    }

}
