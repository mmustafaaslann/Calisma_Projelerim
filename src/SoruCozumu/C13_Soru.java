package SoruCozumu;

import java.util.Scanner;

public class C13_Soru {
    public static void main(String[] args) {

        // Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        //karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        //%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        //alirsa %15, yoksa %10 indirim yapin

        Scanner scan = new Scanner(System.in);
        System.out.println("ürün adedini giriniz");
        int urunAdedi = scan.nextInt();
        System.out.println("lütfen liste fiyatını giriniz");
        double listeFiyatı = scan.nextDouble();
        boolean müşteriKartıVarmı=true;
        double toplamFiyat= 0;

        if (müşteriKartıVarmı==true && urunAdedi>10){
           toplamFiyat=urunAdedi*listeFiyatı*(0.80);
                System.out.println(" %20 indirimli fiyat : "+toplamFiyat);

            } else if (müşteriKartıVarmı==true && urunAdedi<10 ) {
            toplamFiyat=urunAdedi*listeFiyatı*(0.85);
            System.out.println(" %15 indirimli fiyat : "+toplamFiyat);

        } else if (müşteriKartıVarmı==true && urunAdedi>10) {
            toplamFiyat=urunAdedi*listeFiyatı*(0.85);
            System.out.println(" %15 indirimli fiyat : "+toplamFiyat);


        } else if (müşteriKartıVarmı==false && urunAdedi>0) {
            toplamFiyat=urunAdedi*listeFiyatı*(0.90);
            System.out.println(" %10 indirimli fiyat : "+toplamFiyat);

        }
    }


    }

