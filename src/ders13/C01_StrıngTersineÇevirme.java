package ders13;

public class C01_StrıngTersineÇevirme {
    public static void main(String[] args) {

        String input = "java her geçen gün güzelleşiyor";

       String inputTers = "";

        for (int i = 0-input.length()-1; i <=0; i++) {

            inputTers += input.substring(i , i+1);

            
        }
        System.out.println("ters hali :"+ inputTers);

        }
    }

