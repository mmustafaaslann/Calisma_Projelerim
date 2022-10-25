package SoruÇözümü;

import java.util.Scanner;

public class IfStatment1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("harf giriniz");
        char ilkHarf = scan.next().charAt(0);

        if (ilkHarf=='o'|| ilkHarf=='O'){
            System.out.println("ocak");

            
        }
    }
}
