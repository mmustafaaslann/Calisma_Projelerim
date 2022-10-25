package ders10.StrıngMan;

import java.util.Scanner;

public class C05_Soru {
    public static void main(String[] args) {

        //mail kontrolu yapan bir program hazırlayın
        //1: mail @ işareti içermiyorsa geçersiz e mail yazdır
        //2: @gnail.com işareti içeriyor ama gmail.com içermiyorsa gmail adresi giriniz
        // 3: @gmail.com ile bitmiyorsa yazım hatası şeklinde sonuç yazdırın

        Scanner sacan = new Scanner(System.in);
        System.out.println("lütfen mail  giriniz");
        String email = sacan.next();

        if (!email.contains("@")){

            System.out.println("geçersiz email");
            
        } else if (email.contains("@gmail.com")) {

            System.out.println("gmail adresi giriniz");
            
        } else if (!email.endsWith("@gmail.com")) {

            System.out.println("yazım hatası");
            
        }else {
            System.out.println(" geçerli gmail adres giriniz");
        }

    }
}
