package ders03_dataCastıngWrapperClass;

import java.util.Scanner;

public class C04_DataCastıngChar {

    public static void main(String[] args) {
        //kullanıcıdan char bir karakter alın
        //o karakterden sonra gelen 3 karakteri yazdırın

       Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char girilenkrk = scan.next().charAt(0);
        System.out.println((girilenkrk+1) + (girilenkrk+2) + (girilenkrk+3));



        System.out.println(Character.isLetter('5'));//false
        System.out.println(Character.isDigit('7'));//true

        String str1 = "123";
        String str2 = "12";

        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));//ınteger.parsınt içine yazılan str rakamlardan
        //oluşuyorsa ınt çevirir

    }
}
