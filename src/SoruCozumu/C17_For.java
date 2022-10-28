package SoruCozumu;

import java.util.Scanner;

public class C17_For {
    public static void main(String[] args) {

        // - Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini
        //kontrol edin ve sonucu yazdirin.

        Scanner scan = new Scanner(System.in) ;
        System.out.println("lütfen pozitif sayı giriniz");
        int sayi = scan.nextInt();
        boolean asalMı = true;
        for (int i = 2; i <sayi-1; i++) {
            if (sayi%i==0){
                asalMı=true;
                break;
            }
            System.out.println(asalMı);
        }
    }
}
