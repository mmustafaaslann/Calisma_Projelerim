package ders11_StrıngManıpalatıon;

public class C03_ReplaceAll {
    public static void main(String[] args) {

        String str = " j1ava2  gu9z8eldir7";
        System.out.println(str.replaceAll("\\d", ""));//java guzeldir
        System.out.println(str.replaceAll("\\D",""));

        String strone = "ilk ürün fiyatı : 1250 tl";
        String strtwo = "ikinci ürün fiyatı :1350 tl";
        //iki ürünün fiyatını toplayın
        strone=strone.replaceAll("\\D","");
        strtwo=strtwo.replaceAll("\\D","");
        System.out.println(Integer.parseInt(strone)+Integer.parseInt(strtwo));

    }
}
