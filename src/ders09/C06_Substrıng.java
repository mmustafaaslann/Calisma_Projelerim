package ders09;

public class C06_Substrıng {
    public static void main(String[] args) {

        String str = "java öğren, işi kap";

        //System.out.println(str.substring(5)); // öğren , işi kap
        //System.out.println(str.substring(0));
        System.out.println(str.length());
        //str=str.substring(str.length()-1);
        System.out.println(str);

        //System.out.println(str.substring(str.length()-1).toUpperCase());

        System.out.println(str.substring(str.length()-3).toUpperCase());

    }
}
