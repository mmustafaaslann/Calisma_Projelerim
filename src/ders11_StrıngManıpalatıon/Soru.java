package ders11_StrıngManıpalatıon;

import java.util.Scanner;

public class Soru {
    public static void main(String[] args) {

       String cumle = "Eve geldim , işler birikmiş ";

        String cumlecopy = cumle.toLowerCase();

        if (cumlecopy.contains("ev")&& cumlecopy.contains("iş")){
            System.out.println("hem ev lazım hem iş");
        } else if (cumlecopy.contains("ev")) {
            System.out.println("home home sweet home");

        } else if (cumlecopy.contains("iş")) {
            System.out.println("çalışmak güzeldir");

        }else {
            System.out.println("çok çalışman lazım");
        }

    }
}
