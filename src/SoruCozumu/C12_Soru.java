package SoruCozumu;

import java.util.Scanner;

public class C12_Soru {
    public static void main(String[] args) {

        // - Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        //Scanner scan = new Scanner(System.in);
       // System.out.println("lütfen 3 kenar uzunluğu giriniz");
       // int kenar = scan.nextInt();
       // int kenar1 = scan.nextInt();
       // int kenar2 = scan.nextInt();

       // if (kenar==kenar1 && kenar1==kenar2){
         //   System.out.println("Eşkenar üçgen");
       // }else {
         //   System.out.println("Eşkenar üçgen değildir.");

        // - Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        //kucukse “Maalesef kaldin” yazdirin.

       // Scanner scan = new Scanner(System.in);
       // System.out.println("lütfen notunuzu giriniz");
       // int not = scan.nextInt();
       // if (not>=50){
         //   System.out.println("sınıfı geçtin");
       // } else if (not<50) {
         //   System.out.println("Maalesef kaldın.");

        // Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
        //yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin

      //  Scanner scan = new Scanner(System.in);
      //  System.out.println("lütfen yaşınızı giriniz");
      //  int age = scan.nextInt();
      //  if (age>=65){
       //     System.out.println("Emekeli olabilirsin");
      //  } else if (age<65) {
       //     System.out.println("emekli olabilmeniz için çalışmanız gereken yıl : "+ (65-age));

        // Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
        //olup olmadigini yazdirin.

      //  Scanner scan = new Scanner(System.in);
       // System.out.println("harf giriniz");
       // char harf = scan.next().charAt(0);

       // if (harf>'A' || harf<'Z'){
         //   System.out.println("büyük harftir");
       // } else if (harf>'a'|| harf<'z') {
         //   System.out.println("büyük harf değildir");

        // Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        //hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
        //obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
        //zayif yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen kilonuzu giriniz");
        int kilo = scan.nextInt();
        System.out.println("lütfen boyunuzu giriniz");
        int boy = scan.nextInt() ;
        int vkei = (kilo*10000 / (boy *boy));
        System.out.println("vkei : "+vkei);

        if (vkei>30){
            System.out.println("obez");
        } else if (vkei<=30) {
            System.out.println("kilolu");

        } else if (vkei>25) {
            System.out.println("kilolu");

        } else if (vkei>20) {
            System.out.println("normal");

        } else if (vkei>0) {
            System.out.println("zayıf");

        }

    }
    }









