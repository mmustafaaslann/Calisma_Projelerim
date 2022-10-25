package ders10.StrıngMan;

public class Concatenatıon {
    public static void main(String[] args) {

       String str = "java";
       String str1 = "Guzeldir";
       boolean bl = true;
       int sayi = 20;
       double dbl = 3.54;

        System.out.println(str+bl+sayi);//javatrue20
        System.out.println(sayi+dbl);//23.54
        System.out.println(str.concat( " ").concat(str1));// java guzeldir
        System.out.println(str.concat(" ").concat(str1).concat(" ")+((sayi+dbl)));
    }
}
