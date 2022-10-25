package day08TernaryOperatörs;

public class Ternary_Switch1 {
    public static void main(String[] args) {
       int gunNO = 3 ;

        switch (gunNO) {
            case 1 :
                System.out.println("pazartesi");
                break;
            case 2 :
                System.out.println("salı");
                break;
            case 3 :
                System.out.println("çarşamba");
                break;
            default:
                System.out.println("geçersiz gün no");
        }
    }
}
