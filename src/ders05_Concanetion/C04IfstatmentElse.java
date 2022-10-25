package ders05_Concanetion;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class C04IfstatmentElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen yaşınızı griniz");
        int age = scan.nextInt();

        if (age>=65){
            System.out.println("emekli olabilirsin");
        } else {
            System.out.println("emekli olmak için "+ (65-age)  + " sene daha çalışmalısın");
            
        }
    }
}
