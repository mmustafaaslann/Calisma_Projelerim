package ders05_Concanetion;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        // temel kod bilgilerinden biriridir.bir şart ve ona bağlı bir sonuç koşul cümlesi gibi eğer ile başlaması

        // kullanıcıdan iki sayı alın eğer birinci sayı 100 den büyükse ilk sayı 100 den büyük yazdırın
        // eğer ikinci sayı çiftse ikinci sayı çift yazdırın eğer ilk sayı ikinci sayıdan büyükse ilk sayı daha büyük yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen iki tam sayı giriniz");
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();

        if(s1>100){
            System.out.println("ilk sayı 100 den büyük");
        } else if (s2%2==0) {
            System.out.println("ikinci sayı çift");

        } else if (s1>s2) {
            System.out.println("ilk sayı daha büyük");

        }else {
            System.out.println("geçerli sayı giriniz");
        }
    }
}
