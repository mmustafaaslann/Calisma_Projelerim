package ders09;

public class C02_Eguals {
    public static void main(String[] args) {
         String str1 = "ALİ";
         String str2 = " ali";
         String str3 = new String("Ali");

        System.out.println(str1==str2);//False
        // == Stringleri karşılaştırıken beklediğimiz sonuç vermez
        // sTRIN KARŞILAŞTIRILIRKEN eguals methodu kullanılır

        System.out.println(str1.equals(str2));
    }
}
