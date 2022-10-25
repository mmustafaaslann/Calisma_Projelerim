package ders15;

import java.util.Scanner;

public class C04_whileLoop {
    public static void main(String[] args) {

        // KULLANICIDAN TOPLANMAK İÇİN TAM SAYILAR ALIN KULLANICI SIFIRA BASAR İSE SAYI ALMA İŞLEMİNİ
        // BİTİRİN KULLNICIN KAÇ SAYI GİRDİĞİNİ VE BU SAYILARIN TOPLAMININ KAÇ OLDUĞUNU YAZDIRIN

        Scanner scan = new Scanner(System.in) ;
        int girilenSayi =5;
        int sayac = 0 ;
        int toplam = 0;
        while (girilenSayi !=0){
            System.out.println("toplamak için bir sayı alın " + "\nbitirmek için sıfıra basın");
            girilenSayi=scan.nextInt();

            if (girilenSayi!=0){
               sayac++;
               toplam=toplam+girilenSayi;
            }
            System.out.println("girilen"+sayac+"adet sayının toplamı"+toplam);

        }



    }

}
