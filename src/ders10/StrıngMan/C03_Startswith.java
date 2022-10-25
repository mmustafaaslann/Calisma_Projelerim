package ders10.StrıngMan;

public class C03_Startswith {
    public static void main(String[] args) {

        String str = "mantı açılırken java öğrenilmez";

        System.out.println(str.startsWith("MANTI"));//False
        System.out.println(str.startsWith("java,",10));
    }
}
