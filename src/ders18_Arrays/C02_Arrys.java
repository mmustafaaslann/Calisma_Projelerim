package ders18_Arrays;

import java.util.Arrays;

public class C02_Arrys {
    public static void main(String[] args) {

        String [] arr = {"Ali","Ulus","Nesrin"};

        // Bu arry in tüm elemnetlerini aralarında bir boşluk bırakarak yazdıralım

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");

          //  System.out.println(arr);
            // ary bir obje non -primitive olduğundan java referansını yazdırır.
            // ary ary olarak yazdırmak isterseniz arrys clasından yardım almalısnız.

            System.out.print(Arrays.toString(arr));

        }
    }
}
