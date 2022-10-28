package ders19;

import java.util.Arrays;

public class C05_StrıngSıplıt {
    public static void main(String[] args) {

        String str = "java gerçekten , çok çok güzel ";

        String [] arrVirgul = str.split(" , ");
        System.out.println(Arrays.toString(arrVirgul)); // [java gerçekten, çok çok güzel ]

        String [] eArrayi = str.split("e");
        System.out.println(Arrays.toString(eArrayi));
        System.out.println(eArrayi.length-1);
    }
}
