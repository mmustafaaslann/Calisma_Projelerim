package SoruCozumu;

import java.util.Scanner;

public class C15_For {
    public static void main(String[] args) {

        // 1’den 100’e kadar sayilari ayni satirda aralarinda bir bosluk birakarak
        //yazdirin.
        //Soru 2- Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
        //dahil) 7 ila bolunebilen sayilari yazdirin.
        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

       // for (int i = 1; i <=100 ; i++) {
         //   System.out.print(i+" ");

        //Scanner scan = new Scanner(System.in);
       // System.out.println("lütfen pozitif bir tam sayı giriniz :");
       // int sayi = scan.nextInt();
       // for (int i = 1; i <=sayi ; i++) {
         //   if (i%7==0){
           //     System.out.print(i+" ");

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen başlangıç için pozitif bir tam sayı giriniz :");
        int basSayi = scan.nextInt();
        System.out.println("lütfen bitiş için pozitif bir tam sayı girin ");
        int bitSayi = scan.nextInt();
        int toplam =0;
        for (int i = basSayi; i <=bitSayi ; i++) {
            toplam=toplam+i;

            if (bitSayi<basSayi){
                System.out.println("uyarı");


            }



            System.out.print("Toplam :"+toplam);
        }


        }

        }

