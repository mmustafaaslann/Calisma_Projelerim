package ders10.StrıngMan;

public class C02_Contains {
    public static void main(String[] args) {

        String str = "Java ile kodlama çok zevkli";
        System.out.println(str.contains("çok"));
        System.out.println(str.contains("a"));

        String str3 = "234 Ali Can";
        System.out.println(str3.contains("2"));//true
    }
}
