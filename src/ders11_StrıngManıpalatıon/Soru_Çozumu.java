package ders11_StrıngManıpalatıon;

import java.util.Scanner;

public class Soru_Çozumu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim = scan.nextLine();
        System.out.println("soyisminizi giriniz");
        String soyisim = scan.nextLine();

        if (isim.length()>soyisim.length()){
            System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase() +
            " "+soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase());


        } else if (isim.length()<soyisim.length()) {
            System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+
            " "+soyisim.toUpperCase());

        }
    }
}
