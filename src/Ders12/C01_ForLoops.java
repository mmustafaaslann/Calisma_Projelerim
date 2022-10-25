package Ders12;

public class C01_ForLoops {

    public static void main(String[] args) {
        // iki basamaklı sayılardan 7 ile bölünebilenleri yan yana yazdırın
        for (int i = 10; i <100 ; i++) {
            if (i%7==0) System.out.print(i + " ");
            
        }
        // iki basamaklı sayılardan 7 ile bölünebilenleri yan yana yazdırın
        for (int i = 10; i <100 ; i++) {
           if (i%7==0) System.out.print(i + " ");

           }
        System.out.println("");

        //13 den başlayarak 100 e kadar 7 şer 7 şer artırıp yazdırlaım
        for (int i = 13; i <= 100; i+=7) {

                System.out.print(i + " ");


        }
        System.out.println("");
        // 1 den 10 a kadar sınırlar dahil sayıların kareleri yazdır
        for (int i = 1; i <=10; i++) {
            System.out.print(i*i +" ");

        }


        }

        }


