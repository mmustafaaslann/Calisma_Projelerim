package ders13;

public class C05_NestedForLopÜçgen {
    public static void main(String[] args) {

        /*
        nested for lop kullanarak aşşağıda ki şekli hazırlayın
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
         */

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("j ");

            }
            System.out.println("");
        }
    }
}
