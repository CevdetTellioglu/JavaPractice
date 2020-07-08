package javapracticeday5;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve en kucuk olanlarini konsola yazdiriniz
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int num1 = sc.nextInt();
		System.out.println("lutfen bir sayi giriniz");
		int num2 = sc.nextInt();
		System.out.println("lutfen bir sayi giriniz");
		int num3 = sc.nextInt();
		
		if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " en buyuk sayidir");
        
            if (num2 >= num3) {
                System.out.println(num3 + " en kucuk sayidir");
            } else {
                System.out.println(num2 + " en kucuk sayidir ");
            }
	}else if(num2 >= num1 && num2 >= num3) {
		System.out.println(num2 + " en buyuk sayidir");
		 if (num1 >= num3) {
             System.out.println(num3 + " en kucuk sayidir");
         } else {
             System.out.println(num1 + " en kucuk sayidir ");
         }
	}else if(num3 >= num1 && num3 >= num2) {
		System.out.println(num3 + " en buyuk sayidir");
		 if (num2 >= num1) {
            System.out.println(num1 + " en kucuk sayidir");
        } else {
            System.out.println(num3 + " en kucuk sayidir ");
        }

	}
		sc.close();
}
}
