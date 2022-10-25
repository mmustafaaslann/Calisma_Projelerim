package Ders12;

public class C04_Forloops {
    public static void main(String[] args) {
        // KULLANICININ VERDİĞİ BİR SAYININ ASAL SAYI OLUP OLMADIĞI

        int sayı = 103;
        boolean aslaMı=true;
        for (int i = 2; i <= sayı-1; i++) {

            if(sayı%i==0){
               aslaMı=true;
               break;
            }
            System.out.println(aslaMı);
        }
        
    }

  
}
