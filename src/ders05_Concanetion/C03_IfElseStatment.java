package ders05_Concanetion;

import java.util.Scanner;

public class C03_IfElseStatment {
    public static void main(String[] args) {
        //kullanıcıdan bir karakter girmesini isteyiniz büyük harf olup olmadığı yazılacak

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char charecter = scan.next().charAt(0);

        if (charecter>='A' && charecter<='Z'){
            System.out.println("Büyük harf");
        }else {
            System.out.println("büyük harf değil");
        }
    }
}
