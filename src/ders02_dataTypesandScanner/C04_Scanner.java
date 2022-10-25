package ders02_dataTypesandScanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        //kullanıcıdan ismini alıp büyük harflerle yazdırın

        // 1.adım : Scan objesi
        // 2.adım : ne isteğimizi kullanıcıya yazdırma
        // 3.adım : kullanıcıdan istediğimiz bilginin türüne uygun bir variable oluşturup scanner methodlarından
        //uygun olanı kullanarak variable atayalım.

        //Scanner scan = new Scanner(System.in);
        //System.out.println("lütfen isminizi giriniz");
        //String isim = scan.nextLine();
       // System.out.println(isim.toUpperCase());

        //kullanıcıdan bir double ve data türü alıp toplam ve çarpım yazdırma

        Scanner scan = new Scanner(System.in);
        System.out.println("notunuzu giriniz");
        double not = scan.nextDouble();

        System.out.println("sınıfstudentno giriniz");

        int studentno = scan.nextInt();
        System.out.println("toplam = " + not+studentno);
        System.out.println("çarpım = "+ not*studentno);
    }
}
