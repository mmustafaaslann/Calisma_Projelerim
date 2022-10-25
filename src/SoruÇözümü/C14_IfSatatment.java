package SoruÇözümü;

import java.util.Scanner;

public class C14_IfSatatment {
    public static void main(String[] args) {

       // Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
       // yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
       // olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin

        Scanner scan = new Scanner(System.in);

        char cinsiyet = 'E';

        System.out.println("lütfen yaşınızı giriniz");
        int yas = scan.nextInt();

        if (cinsiyet=='E' && yas>=65  ){
            System.out.println("Emekli olabilirsiniz");
        } else if (cinsiyet=='E' && yas<65) {
            System.out.println("Emekli olmak için :"+(65-yas)+ "Yıl daha çalışmalısın");

        } else if (cinsiyet=='K'&& yas>=60) {
            System.out.println("Emekli olabilirsiniz");

        } else if (cinsiyet=='K'&& yas<60) {
            System.out.println("Emekli olmak için :"+(60-yas)+ "Yıl daha çalışmalısın");

        } else {
            System.out.println("geçersiz giriş");

        }


    }


    }

