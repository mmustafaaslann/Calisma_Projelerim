package ders19;

import java.util.Arrays;

public class C04_BınarySearch {

    public static void main(String[] args) {

        int [] arr = {1,8,3,5,7,2,5,1,8};

        System.out.println(Arrays.binarySearch(arr,8));//8 // 8 in nerde olduğunu bize söylüyor.
        System.out.println(Arrays.binarySearch(arr,1)); // 0

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 1, 2, 3, 5, 5, 7, 8, 8]



    }
}
