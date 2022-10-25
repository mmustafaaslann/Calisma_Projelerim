package ders17;

public class C02_Scope {

   static String hastaneIsmi ="yıldız hastanesi";
   static int hastaSayisi = 2345;
   static  String bashekimIsmi ;
   String persIsmi ;
   int   persYasi;




    public static void main(String[] args) {
        System.out.println(hastaneIsmi);
        System.out.println(bashekimIsmi);
        /*
        class veriabllerda değer ataması yapılmamış olursa java bu verıabllera data türüne göre defult olarak tanımlanan
        değerleri atar
        default değerler :
        sayılsal veriable : 0
        boolean " : false;
        char : '';
        objeler için : null
         */

    }


    public static void  metot1() {
        System.out.println(hastaSayisi);
        hastaSayisi++;


    }

    public void metot2() {
        System.out.println(hastaneIsmi);
        hastaSayisi++;
        System.out.println(persIsmi); // isim girilmedi
        System.out.println(persYasi); // değer girilmedi 0


    }
}
