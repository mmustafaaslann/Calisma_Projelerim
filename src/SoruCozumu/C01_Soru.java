package SoruCozumu;

import java.util.Scanner;

public class C01_Soru {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String isim = scan.next();
        System.out.println("lütfen soyisminizi giriniz");
        String soyisim = scan.next();
        System.out.println("yaşınızı giriniz");
        int yas = scan.nextInt();
        System.out.println("kaydınız başarıyla tamamlanmıştır");
    }
}
