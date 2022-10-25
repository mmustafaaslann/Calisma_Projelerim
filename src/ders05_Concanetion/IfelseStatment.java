package ders05_Concanetion;

import java.util.Scanner;

public class IfelseStatment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("üç kenar uzunluğunu giriniz");
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3 = scan.nextInt();

        if (kenar1<=0 || kenar2<=0 || kenar3<=0){
            System.out.println("geçersiz kenar uzunluğu");
        } else if (kenar1==kenar2 && kenar2==kenar3) {
            System.out.println("eşkenar üçgen");
            
        }else {
            System.out.println("eşkenar üçgen değil");
        }


    }
}
