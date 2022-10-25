package ders09;

import java.util.Locale;

public class StrınManıpaltıon {
    public static void main(String[] args) {
        String str1 = "java mutluluktur";
        System.out.println(str1.toUpperCase());//Büyük yazdırır
        System.out.println(str1.toLowerCase());// küçük yazdırır
        System.out.println(str1);
        str1=str1.toUpperCase();// kalıcı olarak büyük yaptırır
        System.out.println(str1);
        System.out.println(str1);

        String str = "Ince mehmet";
        str=str.toUpperCase();
        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR")));

    }
}
