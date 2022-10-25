package ders03_dataCastıngWrapperClass;

import java.util.Scanner;

public class C02_DataCastıng {
    public static void main(String[] args) {

        //kullanıcıdan bir  tam sayı alın
        //kullanıcı kaç girerse girisin
        //konsolda -128 ile +127
        //arasında bir sonuç yazacak kod yazınız

        Scanner scan = new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");
        int sayi = scan.nextInt();
        byte dönüşensayı = (byte) sayi;


        System.out.println("sayi = " + sayi);
        System.out.println("sayi = " + dönüşensayı);


    }
}
