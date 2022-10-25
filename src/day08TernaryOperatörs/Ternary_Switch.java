package day08TernaryOperatörs;

import java.util.Scanner;

public class Ternary_Switch {
    public static void main(String[] args) {

        // kullanıcıdan bir sayı alın
        // sayı pozitif ise 2 katını yazdırın
        // sayı pozitif değilse sayıya 10 ekleyip yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int sayı = scan.nextInt();

        System.out.println(sayı>0 ? sayı*2 : sayı+10 );
    }
}
