package project_1;

import java.util.Scanner;

public class Odev03 {
    public static void main(String[] args) {

        /*
        Write a program to find the factorial value of any number entered through the scanner class.

        Example:
        number:7
        factorial:1*2*3*4*5*6*7=5040
        output should be == 5040

        number:6
        factorial:1*2*3*4*5*6=720
        output should be == 720

       */

        /*
        Scanner class aracılığıyla girilen herhangi bir sayının faktöriyel değerini bulmak için bir program yazın.

        number:6
        factorial:1*2*3*4*5*6=720
        output ---> 720


         */

        Scanner dp = new Scanner(System.in);

        String  strNum = dp.nextLine();

        int number = Integer.parseInt(strNum);

        //      code start here  use int number
        //      kodu burdan başlatın ve int number kullanın
        int faktoriyel=1;
        for (int i = 1; i <=number ; i++) {
            faktoriyel*=i;
        }
        System.out.println(faktoriyel);

        Scanner scan = new Scanner(System.in);
        System.out.print("Faktoryelini görmek istediğiniz sayıyı giriniz = ");
        int sayi = scan.nextInt();
        int faktoryel = 1;
        String faktoryelAcikYazim = "";
        for (int i = sayi; i >= 1; i--) {
            faktoryel *= i;
            if (i == sayi) {
                faktoryelAcikYazim += i;
            } else
                faktoryelAcikYazim = faktoryelAcikYazim + "*" + i;
        }
        System.out.println(sayi + "! = " + faktoryelAcikYazim + " = " + faktoryel);
    }
}





