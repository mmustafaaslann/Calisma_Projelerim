package ders05_Concanetion;

import java.util.Scanner;

public class Ifstatment_Soru {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char ilkhrf = scan.next().charAt(0);

        if (ilkhrf>='a' && ilkhrf<='z'){
            System.out.println((char) (ilkhrf-32));

        }else {
            System.out.println(ilkhrf);
        }


    }


}
