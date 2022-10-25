package day08TernaryOperatörs;

public class C05_Nested_Ternary {
    public static void main(String[] args) {
         int sayı = -20 ;
         if (sayı>0){
             System.out.println(sayı%2==0 ? "sayı çift sayı" : "çift sayı değil");
         }else {
             System.out.println(sayı<-99 && sayı>-1000 ? "uc basamaklı" : "uc basamaklı değil");



        }
    }
}
