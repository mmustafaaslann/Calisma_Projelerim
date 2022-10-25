package SoruÇözümü;

import java.util.Scanner;

public class C05_Soru {
    public static void main(String[] args) {

        //Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        //“Sayi 5’in tam kati” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int yas = scan.nextInt();

        if (yas%5==0){
            System.out.println("sayı 5 'in tam katı'");
        }else {
            System.out.println("sayı 5 'in tam katı değil");
        }
    }
}
