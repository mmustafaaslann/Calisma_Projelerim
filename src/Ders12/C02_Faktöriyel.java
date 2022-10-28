package Ders12;

public class C02_Faktöriyel {
    public static void main(String[] args) {
        // kullanıcın verdiği  sayının faktöriyelini bulalım

        int sayı = 10;
        int faktoriyel = 1;

        for (int i = sayı; i >=1 ; i--) {
            faktoriyel=faktoriyel*i;

        }
        System.out.println(faktoriyel);

        // 1 den 100 e kadar olan sayıları toplayın
        int toplam =0;
        for (int i = 1; i <=100 ; i++) {
            toplam=toplam+i;


        }

        System.out.print(toplam);

    }
}
