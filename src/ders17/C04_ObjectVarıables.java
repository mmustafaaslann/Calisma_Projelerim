package ders17;

public class C04_ObjectVarıables {
    public static void main(String[] args) {


        // C03 teki hastene ismini yazdırmak istiyoruz

        System.out.println(C03_ObjectVarıables.hastaneIsmi);

        System.out.println(C03_ObjectVarıables.hastaSayisi);

        C03_ObjectVarıables.hastaSayisi++;
        C03_ObjectVarıables.hastaSayisi++;
        method1();
        System.out.println(C03_ObjectVarıables.hastaSayisi);

    }
    public static void  method1(){
    C03_ObjectVarıables.hastaSayisi++;
    }
}
