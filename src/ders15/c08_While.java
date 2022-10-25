package ders15;

import java.util.Scanner;

public class c08_While {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("şifre giriniz");
        boolean sifreGecerliMi = false;
        String sifre ="";

        while (sifreGecerliMi!=true){
            sifre=scan.nextLine();
            int Bayrak =0 ;

            if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
                System.out.println("şifrenin ilk karakteri küçük harf olmalı");
                Bayrak++;

            }
            if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9' ) ){
                System.out.println("şifrenin son karekteri sayı olmalı");
                Bayrak++;

            }
            if (Bayrak==0){
                sifreGecerliMi=true;
                System.out.println("şifre kaydedildi");
            }
        }
    }
}
