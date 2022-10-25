package ders14;

public class C06_Metot {
    public static void main(String[] args) {

        String isim = "mustafa";
        String soyisim = "Aslan";

        System.out.println(isimSoyIsimDüzenle(isim, soyisim));
    }
    public static String isimSoyIsimDüzenle(String isim , String soyisim){

        String yeniIsimSoyisim = isim.substring(0,1).toUpperCase()+
                isim.substring(1).toLowerCase()+
                " "+
                soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).toLowerCase();

        return yeniIsimSoyisim;
    }
}
