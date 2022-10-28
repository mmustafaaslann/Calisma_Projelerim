package SoruCozumu;

import java.util.Scanner;

public class C16_For {
    public static void main(String[] args) {
      //   - Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //        dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //        baslangic degerinden kucuk olsa da program calissin

        //        Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //        hesaplayin.

        //                Soru 6- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //        hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //        Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720


      //  Scanner scan = new Scanner(System.in);
      //  System.out.println("Başlangıç ve Bitiş değerleri giriniz ");
      //  int bslSyi= scan.nextInt();
      //  int btsSyi = scan.nextInt();
      //  int toplam = 0;
      //  for (int i = bslSyi; i <=btsSyi ; i++) {
      //     toplam=toplam+i;
      //      System.out.print(i+" ");


        Scanner scan = new Scanner(System.in);
        System.out.print("20 ' den küçük bir sayı giriniz :");
        int sayi = scan.nextInt();
        int faktoriyel = 1;
        for (int i = sayi; i >1 ; i--) {
            faktoriyel = faktoriyel*i;

        }



        System.out.print(sayi+"! = "+faktoriyel);


        }

      //  System.out.println("Toplam :"+toplam);


    }

