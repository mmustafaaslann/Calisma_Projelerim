package ders15;

public class C03_whileLopp {
    public static void main(String[] args) {

        // 2 basamaklı sayıların aralarında bir boşluk olacak şekilde yanyana yazdırın.

        for (int i = 10; i <=99 ; i++) {
            System.out.print(i +" ");


            // while loop ile yapma

            int sayi =10;
            while (sayi<100){
                System.out.print(sayi + " ");
                sayi++;
            }
        }
    }
}
