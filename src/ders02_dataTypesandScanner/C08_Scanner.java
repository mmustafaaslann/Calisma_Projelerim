package ders02_dataTypesandScanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {

        //kulanıcıdan iki tam sayı alın ve yerlerini değiştirin

        Scanner scan = new Scanner(System.in);
        System.out.println("birinci tamsayı giriniz");
        int birincitamsayı = scan.nextInt();
        System.out.println("ikinci tamsayı giriniz");
        int ikincitamsayı = scan.nextInt();

        int boş ;
        boş = ikincitamsayı;
        ikincitamsayı=birincitamsayı;
        birincitamsayı=ikincitamsayı;
        birincitamsayı=boş;
        System.out.println("birincitamsayı = " + birincitamsayı);
        System.out.println("ikincitamsayı = " + ikincitamsayı);


    }
}
