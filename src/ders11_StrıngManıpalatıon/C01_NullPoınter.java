package ders11_StrıngManıpalatıon;

public class C01_NullPoınter {
    public static void main(String[] args) {

        String strOne = "";
        //strOne 'e bir değer atanmıştır.
        System.out.println(strOne); //hiçlik yazdırır
        System.out.println(strOne.concat("java"));//java

        String strTwo;
        //strTwo 'u oluşturuldu ama bir değer atanmadı
        //System.out.println(strTwo);// strTwo 'ya değer atanmadığı için yazdırılamaz

        String strThree = null;//değer atanmamıştır
        //null poınter ile javaya değer atamadığımızın farkında olduğumuzu söylüyoruz
        System.out.println(strThree);//ekrana null çıkar
        // strThree.concat("java");//nullpoınterexpoınt çalışmaz yani

        System.out.println(strThree +" java");//nulljava
        //System.out.println(strThree.toUpperCase());//method kullanızlmaz çalışmaz nullpoınterexpoınt
    }

}
