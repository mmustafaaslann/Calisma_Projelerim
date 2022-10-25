package ders15;

import java.util.Scanner;

public class C05_WhileLop {
    public static void main(String[] args) {

        // kullanıcıdan toplanmak üzere sayı alın sayıların toplamı 500 ' eşit olur veya geçerse girilen sayı adatei girilen
        // sayıların toplamını yazdırın bu kadar yeter diyin


        Scanner scan = new Scanner(System.in);
        double girilensayi = 0;
        double toplam = 0 ;
        int sayac = 0;

        while (toplam<500){
            System.out.println("toplamak için sayı giriniz :");
            girilensayi = scan.nextDouble();

            toplam+=girilensayi;
            sayac++;
        }

        System.out.println("girilen"+sayac+"sayıların toplamı"+toplam+"oldu bu kadar yeter");

    }





}
