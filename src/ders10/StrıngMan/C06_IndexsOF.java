package ders10.StrıngMan;

public class C06_IndexsOF {
    public static void main(String[] args) {

        String str = "Ahmet hoca ile her şey clear";

        System.out.println(str.indexOf("a"));// a nın ındeksini integer değer plarak döndürür
        System.out.println(str.indexOf('c'));
        System.out.println(str.indexOf('e',9));

        int ilkindeks = str.indexOf('c');
        System.out.println(str.indexOf('c',ilkindeks+1));
    }
}
