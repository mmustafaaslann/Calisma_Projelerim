package ders04_Increment_Decrement;

import java.util.Scanner;

public class C02_DataCastıng {
    public static void main(String[] args) {
        //kullanıcıdan iki integer değer alıp bunları birbirine bölün ve sonucu double olarak ayzdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen iki tam sayı griniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        double bölmesonuç= sayi1/sayi2;
        System.out.println("bölmesonuç = " + bölmesonuç);
    }
}
