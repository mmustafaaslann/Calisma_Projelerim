package ders14;

import java.util.Scanner;

public class MethodOluşturma {
    public static void main(String[] args) {

        // main method içerisinde kullanıcıdan iki sayı alın
        // bu iki sayıyı parametre olarak kabul edip çarpımlarını bize döndüren bir method oluşturun

       Scanner scan = new Scanner(System.in);
        System.out.println("sayı giriniz");
        double sayı1 = scan.nextDouble();
        double sayı2 = scan.nextDouble();
        System.out.println(çarpımMethod(sayı1, sayı2));
        double çarpımSonucu=çarpımMethod(sayı1,sayı2) ;


    }
    public  static  double çarpımMethod(double sayı1 ,double sayı2){
        System.out.println("çarpım methodu  çalıştı");

        return (sayı1*sayı2) ;




    }
}
