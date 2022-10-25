package ders13;

public class C02_NestedForLop {
    public static void main(String[] args) {

        //1-4 arasında ki sayılar için çarpım tablosu oluşturalım

        // dış döngü satırları kontrol eder
        // iç döngü her satırı kontrol eder

        for (int i = 1; i <=4 ; i++) {

            for (int j = 1; j <=4 ; j++) {

                System.out.print(i*j + "");

            }
            System.out.println("");
        }
    }
}
