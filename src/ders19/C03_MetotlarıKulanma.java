package ders19;

import ders18_Arrays.C04_AraryElementleriToplama;

import java.util.Arrays;

public class C03_MetotlarıKulanma {

    public static void main(String[] args) {

        // verilen bir int arryin elementlerini 3 artırın.

        int[] arr = {2, 3, 4};

        arr=  elementleri3Artır(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static int[] elementleri3Artır(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            arr[i] = arr[i] + 3;
        }
        return arr ;
    }
}