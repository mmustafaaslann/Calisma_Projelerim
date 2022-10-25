package ders11_StrıngManıpalatıon;

public class C04_ReplaceAll {
    public static void main(String[] args) {

        //kullanıcın girdiği metinde harf dışında kalan tüm karakterleri temizleyen bir kod yazın
        //space silinmemeli

        String input = "*java  çok  *guzel8";
        input=input.replaceAll("\\W","");
        input=input.replaceAll("\\d","");
        System.out.println(input);
    }
}
