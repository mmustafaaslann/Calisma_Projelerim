package ders17;

import java.util.Scanner;

public class C05_JectVarıables {
    public static void main(String[] args) {

        // C03 verıablera ulaşma inctance diğer adı obje veriableleri

        C03_ObjectVarıables pers1 =new C03_ObjectVarıables();
        System.out.println(pers1.persIsmi); // isim girilmedi
        System.out.println(pers1.persYasi); // 0

        pers1.persIsmi= "süleyman";
        pers1.persYasi=35;

        System.out.println(pers1.persIsmi);
        System.out.println(pers1.persYasi);

        C03_ObjectVarıables pers2 = new C03_ObjectVarıables();
        pers2.persIsmi="latif";
        pers2.persYasi = 32;

        System.out.println(pers2.persIsmi);

        C03_ObjectVarıables pers3 = new C03_ObjectVarıables();
        pers3.persIsmi="heysem";



    }

}
