package ders11_StrıngManıpalatıon;

public class C02_Replace {
    public static void main(String[] args) {

        String str = "java candir";
        System.out.println(str.replace('a', 'A'));//jAvA cAndır
        System.out.println(str.replace("candir","çok guzeldır"));//java çok güzeldir

        //Strıgteki tüm 'a' ları silme
        System.out.println(str.replace("a",""));//jv cndır

        // sadece birinci a yı A yapalım
        System.out.println(str.replaceFirst("a","A"));//İLK a A oldu jAva candır
    }
}
