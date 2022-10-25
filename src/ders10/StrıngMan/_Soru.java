package ders10.StrıngMan;

public class _Soru {
    public static void main(String[] args) {

        String input = "java 1 ogRe2@nMek3 #ne +Gu=zel";
        System.out.println(input = input.replaceAll("\\d", ""));
        System.out.println(input);
        System.out.println(input.replaceFirst("j","J"));
        System.out.println(input);

    }
}
