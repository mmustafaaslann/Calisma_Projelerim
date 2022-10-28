package ders19;

import java.util.Arrays;

public class C01_ElamanlarıSağaKaydırma {

    public static void main(String[] args) {

        int [] arr  = {4,5,6,7};

       arr= sağaKaydir(arr);

        System.out.println(Arrays.toString(arr));


    }
    public static int[] sağaKaydir(int[] arr){

        int bosKova = arr[arr.length-1];

        for (int i = arr.length; i >=0 ; i--) {
            arr[i+1]=arr[i];
            
        }
        arr[0]=bosKova;
        return arr ;
    }
}
