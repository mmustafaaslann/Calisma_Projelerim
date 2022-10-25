package ders07_Ifelsesoruçözümü;

import java.util.Scanner;

public class NestedIfElseStatment {
    public static void main(String[] args) {

        //kullanıcının kilo ve boyunu isteyip vücüt kitle endeksini hesaplayın
        // (kilo*1000) / (boy*boy)
        // vücut kitle endeksi 30 ' dan büyükse obez , 25-30 arası ise kilolu 20-25 arası ise normal 20' den
        //küçükse zayıf


        Scanner scan = new Scanner(System.in);
        System.out.println("kilonuzu giriniz");
       double ağırlık = scan.nextDouble();
        System.out.println("boyunuzu giriniz");
        double boy = scan.nextDouble();

        double vkei = (ağırlık*1000 / (boy*boy));
        System.out.println("vkei = " + vkei);

        if (vkei>30){
            System.out.println("obez");
        } else if (vkei>=30) {
            System.out.println("kilolu");


        } else if (vkei>25) {
            System.out.println("kilolu");

        } else if (vkei>20) {
            System.out.println("normal");

        } else if (vkei>0) {
            System.out.println("zayıf");

        }else {
            System.out.println("yanlış giriş");
    }


    }
}
