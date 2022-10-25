package SoruÇözümü;

import java.util.Scanner;

public class IfStatment {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir tam sayı giriniz");
        int sayi = scan.nextInt();

        if (sayi%2==0){
            System.out.println("çift sayı ");
        } else if (sayi%1==0) {
            System.out.println("tek sayi");

        }else {
            System.out.println("geçerli say giriniz");

        }

    }
}
