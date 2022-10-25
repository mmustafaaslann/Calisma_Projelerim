package ders04_Increment_Decrement;

import java.util.Scanner;

public class C01_DataCastıng {
    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 6;
        System.out.println(sayi1/sayi2); //3
        //bölünen ve bölen tam sayı ise java sonucun sadece tam sayı kısmını alır

        double sayı1 = 20;
        double sayı2= 6;
        System.out.println(sayı1/sayı2);//3.33333333
        //java geniş olana göre davranır

        //kullanıcıdan iki double sayı alın ilk sayıyı ikinci sayıya bölün ve bölüm işleminin sonucun tam sayı kısmını
        //yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz");
        double sayıı1 = scan.nextDouble();
        double sayıı2 = scan.nextDouble();
        int bölmesonuç = (int) (sayıı1/sayıı2);

        System.out.println(bölmesonuç );

    }
}
