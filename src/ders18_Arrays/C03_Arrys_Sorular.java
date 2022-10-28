package ders18_Arrays;

import java.util.Arrays;

public class C03_Arrys_Sorular {

    public static void main(String[] args) {
        // verilen bir arryin tüm elemanlarını 2 artırın bize döndüen bir metot oluşturun


        int [] arr = {2,4,6,8};

        for (int i = 0; i < arr.length ; i++) {
           arr[i]=arr[i]+2;

       arr=  elementleri2Artır(arr);
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));// [4,6,8,10]
    }
    public static int [] elementleri2Artır(int[] arr){
        for (int i = 0; i < arr.length ; i++) {

            arr[i]=arr[i]+2;

        }
        return arr ;
    }
}
