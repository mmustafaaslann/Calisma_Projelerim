package ders14;

public class C03_StrıngTerseÇevirme {
    public static void main(String[] args) {

        // parametre olarak bir strıng kabul edip strıngin terse çevrilmiş halini döndüren bir method oluşturun

        String input = "java kod yazdıkça öğrenilir ";
        System.out.println(stringTersÇevir(input));

    }
    public static String stringTersÇevir (String input){
        String tersstr ="";
        for (int i = input.length()-1; i <=0 ; i--) {
            tersstr =tersstr+input.charAt(i);

        }
        return tersstr;

    }
}
