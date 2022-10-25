package ders13;

import java.util.Scanner;

public class C08_MethodOluşturma {
    public static void main(String[] args) {


        isteToplaYazdır();


        // kullanıcıdan 2 sayı alıp bunların tpplamono oluşturan bir method yazma
    }
    public static void isteToplaYazdır(){
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz");
        double sayı1 = scan.nextDouble();
        double sayı2 = scan.nextDouble();

        System.out.println("girilen sayıların toplamı : " +(sayı2+sayı1));

    }
}
