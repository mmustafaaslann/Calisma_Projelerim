package ders13;

public class NestedForLoopMethodOluşturma {
    public static void main(String[] args) {
      // kullanıcıdan bir string isteyin ve stringi tersten yazdırın

        String input = "java ne kadar güzel " ;

        for (int i = input.length()-1; i <=0 ; i--) {

            System.out.print(input.charAt(i));

        }


    }
}
