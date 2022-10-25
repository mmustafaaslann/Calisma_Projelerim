package ders07_Ifelsesoruçözümü;

import java.util.Scanner;

public class Ifelsesoruçözümü {
    public static void main(String[] args) {
        //kullanıcıdan cinsiyetini ve yaşını alın kadın 60 yaş ve üzeri erkek 65 yaş ve üzeri emekli olabilir
        //cinsiyet ve yaşını dikkate alarak emekli olablirsin
        //"emekli olabilirsin veya emekli olmak için ... yıl daha çalışman gerekir

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen yaşınızı giriniz");
        int yas = scan.nextInt();
        char cinsiyet='E';


        if (cinsiyet=='k' && yas>=65){
            System.out.println("emekli olabilirsin");

        } else if (cinsiyet=='E'&& yas<=65) {
            System.out.println("emekli olmak için daha" +  (65-yas) +"yıl daha çalışmalısın");

        } else if (cinsiyet=='K'&& yas>=60) {
            System.out.println("emekli olablirsiniz");
            
        } else if (cinsiyet=='k'&& yas<=60) {
            System.out.println("emekli olmak için" + (60-yas) + " " + "yıl daha çalışmalısın ");

        }else {
            System.out.println("geçersiz giriş");
        }

    }
}
