package ders05_Concanetion;

import java.util.Scanner;

public class IfStatment {
    public static void main(String[] args) {
     //kullanıcıdan bir harf  alın harf ile başlayan bir ay varsa yazdırın

        //Scanner scan = new Scanner(System.in);
       // System.out.println("lütfen bir harf giriniz");
        //char harf = scan.next().charAt(0);

        //if (harf=='o'|| harf=='O') {
          //  System.out.println("Ocak");
       // } else if (harf=='ş'|| harf=='Ş') {
         //   System.out.println("şubat");

        //KULLANICIDAN BİR ÜÇGENİN ÜÇ KENAR UZUNLUĞUNU ALIN ÜÇGEN EŞKENAR İSE EŞKENAR YAZDIRIN


        Scanner scan = new Scanner(System.in);
        System.out.println("üç kenar uzunluğu giriniz");
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3 = scan.nextInt();

        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("eşkenar üçgen");
        }else {
            System.out.println("eşkenar üçgen değildir");
        }

    }



       }


