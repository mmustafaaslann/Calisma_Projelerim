package SoruÇözümü;

public class C10_Soru {
    public static void main(String[] args) {

      // Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
        //ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
        //yazdırınız.
        //Örnek: mIAMI - Miami
        // miami - Miami
        // MIAMI - Miami
        // mIaMi - Miami

        String sehirIsim = "miami";
        String konsolSehirIsım = sehirIsim.trim().toLowerCase();
        konsolSehirIsım =konsolSehirIsım.substring(0,1).toUpperCase().substring(1)+konsolSehirIsım.substring(1);
        System.out.println(konsolSehirIsım);

    }
}
