package ders19;

import java.util.Arrays;

public class EnbüyükEnkucukElementiBulma {

    public static void main(String[] args) {

        // verilen bir int arry de en kuçük ve en büyük sayıları yazdıran bir metot oluşturun.

        int [] arr = {3,8,1,5,2,9,0,20};
        enbuyukEnkucukElementYazdır(arr);


    }
     public static void enbuyukEnkucukElementYazdır (int [] arr){

         Arrays.sort(arr);

         System.out.println("En buyuk element  :"+arr[arr.length-1]);
         System.out.println("En kucuk element  :"+arr[arr[0]]);

     }

}
