package SoruCozumu;

import java.util.Scanner;

public class C18_For {
    public static void main(String[] args) {

        /*
        Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.
        
Soru 8 (interview)- Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum 
tamsayilari yazdirin, sira 
- 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
- 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
- hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz 
yazdirin
        
         */

     //   Scanner scan = new Scanner(System.in);
      //  System.out.println("lütfen  pozitif bir tam sayı giriniz :");
      //  int sayi = scan.nextInt();
      //  String sayiStr = ""+sayi;

      //  int birlerBasamağı = 0;
      //  int rakamlarToplamı = 0;

      //  for (int i = 0; i <sayiStr.length() ; i++) {
        //    birlerBasamağı=sayi%10;
         //   rakamlarToplamı=rakamlarToplamı+birlerBasamağı;
         //   sayi=sayi/10;

        Scanner scan = new Scanner(System.in);
         System.out.println("lütfen  pozitif bir tam sayı giriniz :");
         int sayi = scan.nextInt();
         String strSayi = ""+sayi;
        for (int i = 1; i <=strSayi.length() ; i++) {
            if (sayi%3==0 && sayi%5==0){
                System.out.println("fizzBuzz");

            } else if (sayi%3==0) {
                System.out.println("fizz");

            } else if (sayi%5==0) {
                System.out.println(" Buzz");

            }


        }

        }



            
        }
     //   System.out.println(rakamlarToplamı);
        


