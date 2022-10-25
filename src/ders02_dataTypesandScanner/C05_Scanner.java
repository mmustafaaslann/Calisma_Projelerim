package ders02_dataTypesandScanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //kullanıcıdan iki dikdörtgenin kenar uzunluğunu alıp
        //dikdörtgenin alanını yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("dikdörtgenin ikikenar uzunluğunu giriniz");
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        System.out.println("alan = "+ kenar1*kenar2);

    }
}
