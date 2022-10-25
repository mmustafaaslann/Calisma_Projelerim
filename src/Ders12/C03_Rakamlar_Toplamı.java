package Ders12;

public class C03_Rakamlar_Toplamı {
    public static void main(String[] args) {
        // kullanıcın verdiği sayının rakamlar toplamını bulun

        int sayı = 1453568;
        String sayıStr = ""+sayı;

        int birlerBasamağı = 0;
        int rakamlarToplamı = 0;

        for (int i = 1; i <=sayıStr.length() ; i++) {
            birlerBasamağı=sayı%10;
            rakamlarToplamı=rakamlarToplamı+birlerBasamağı;
            sayı=sayı/10;

        }
        System.out.println(rakamlarToplamı);
    }
}
