package ders14;

public class C02_StrıngConcet {
    public static void main(String[] args) {

        // verilen iki strıngi paramatre olarak kabul edip bu iki strıngi aralarında bir boşluk olarak bize
        // tek bir strıg olraka main methoda döndüren bir method oluşturun

        String str = "java " ;
        String str1 = "candır";

        System.out.println(birleştirMethodu(str,str1));
        System.out.println(birleştirMethodu("bu da",  " oldu "));

    }
    public static String birleştirMethodu(String str ,String str1){
        return   str  +" "+ str1 ;
    }
}
