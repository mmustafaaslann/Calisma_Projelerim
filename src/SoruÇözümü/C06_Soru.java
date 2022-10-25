package SoruÇözümü;

import java.util.Scanner;

public class C06_Soru {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen çemberin yarıçapını giriniz");
        int yarıÇap = scan.nextInt();


        System.out.println("lütfen piSayısını giriniz");
        double piSayısı = scan.nextDouble();




        System.out.println("çemberin alanı : "+ piSayısı*yarıÇap+  " ^ " +yarıÇap +  " = " );
    }
}
