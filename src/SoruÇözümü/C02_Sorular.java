package SoruÇözümü;

import java.util.Scanner;

public class C02_Sorular {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen iki kenar uzunluğunu giriniz");
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        System.out.println("dikdörtgenin alanını giriniz : "+(kenar1*kenar2));
    }
}
