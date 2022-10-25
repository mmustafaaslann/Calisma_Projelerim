package ders04_Increment_Decrement;

import java.util.Scanner;

public class C03_DataCastıng {
    public static void main(String[] args) {
        //kullanıcıdan 4 basamaklı sayı alınız rakamlar toplamını bulunuz

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 4 basamaklı sayı giriniz");
        int input = scan.nextInt();

        int birlerbasamağı =0;
        int rakamlartoplamı =0;

        //birler basamağını al
        birlerbasamağı = input % 10;
        //birler basamağını rakamlar toplamına ekle
        rakamlartoplamı=rakamlartoplamı +birlerbasamağı;


        //birler basamağından kurtul
        input =input % 10 ;//birler basamağını al
        birlerbasamağı = input % 10;
        //birler basamağını rakamlar toplamına ekle

        rakamlartoplamı=rakamlartoplamı +birlerbasamağı;
        //birler basamağından kurtul
        input =input % 10 ;//birler basamağını al
        birlerbasamağı = input % 10;
        //birler basamağını rakamlar toplamına ekle
        rakamlartoplamı=rakamlartoplamı +birlerbasamağı;
        //birler basamağından kurtul

        input =input % 10 ;//birler basamağını al
        birlerbasamağı = input % 10;
        //birler basamağını rakamlar toplamına ekle
        rakamlartoplamı=rakamlartoplamı +birlerbasamağı;
        //birler basamağından kurtul
        input =input % 10 ;






        System.out.println("rakamlartoplamı = " + rakamlartoplamı);




    }
}
