package ders07_Ifelsesoruçözümü;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        // kullanıcıdan aldığı ürün adedi ve liste fiyatını alıjn
        // kullanıcıya müşteri kartı olup olmadığını sorun
        // müşteri kartı varsa 10 üründen fazla alırsa %20 , yoksa %15 indirim yapın
        // müşteri kartı yoksa 10 üründen fazla alırsa %15 , yoksa %10 indirim yapın

        Scanner scan = new Scanner(System.in);
        System.out.println("ürün adeditini giriniz");
        int UrunAdedi = scan.nextInt();
        System.out.println("liste fiyatını giriniz");

        double listeFiyatı = scan.nextDouble();
        boolean kartVarMı = true;
        double toplamFiyat = 0;

        if (kartVarMı==true && UrunAdedi>10){
            toplamFiyat=UrunAdedi*listeFiyatı*(0.80);
            System.out.println("yüzde 20 indirimli fiyat = " + toplamFiyat);

        } else if (kartVarMı==true && UrunAdedi<10) {
            toplamFiyat=UrunAdedi*listeFiyatı*(0.85);
            System.out.println("yüzde 15 indirimli fiyat = " + toplamFiyat);

        } else if (kartVarMı==true && UrunAdedi>10  ) {
            toplamFiyat=UrunAdedi*listeFiyatı*(0.85);
            System.out.println("yüzde 15 indirimli fiyat = " + toplamFiyat);


        } else if (kartVarMı==true && UrunAdedi<10 && UrunAdedi>0) {
            toplamFiyat=UrunAdedi*listeFiyatı*(0.90);
            System.out.println("yüzde 10 indirimli fiyat = "+toplamFiyat );

        }else {
            System.out.println("geçersiz giriş");
        }


    }
}
