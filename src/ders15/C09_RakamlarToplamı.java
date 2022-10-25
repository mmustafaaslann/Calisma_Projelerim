package ders15;

public class C09_RakamlarToplamı {
    public static void main(String[] args) {

     int sayi =1453;

     int birlerBasamağı = 0;
     int rakamlarToplamı = 0;

     while (sayi!=0){
         birlerBasamağı=sayi%10;
         rakamlarToplamı+=birlerBasamağı;
         sayi/=10;
     }
        System.out.println(rakamlarToplamı);
    }
}
