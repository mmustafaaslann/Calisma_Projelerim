package day08TernaryOperatörs;

import java.util.Scanner;

public class C06SwitchCase {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char ilkhrf = scan.next().charAt(0);

        switch (ilkhrf) {
            case 'j' :
                System.out.println("java");
          break;
            case 'D' :
                System.out.println("Devoment");
                break;
            case 'k' :
                System.out.println("kit");
                break;
            default:
                System.out.println("geçersiz harf");
        }

    }
}
