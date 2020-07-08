package javapracticeday6;

import java.util.Scanner;

public class IfStatementAndTernary {

	public static void main(String[] args) {
		/*Kullanicidan 2 Numara isteyiniz ve bu numaralarin en buyuk ve en kucuk olarak konsola yazdiriniz
			int num1 
			int num2 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int num1 = sc.nextInt();
		System.out.println("lutfen bir sayi giriniz");
		int num2 = sc.nextInt();
		
		if(num1>=num2) {
            System.out.println(num1+" en buyuk rakamdir");
            System.out.println(num2+" en kucuk rakamdir");
        }else {
        	  System.out.println(num2+" en buyuk rakamdir");
        	  System.out.println(num1+" en kucuk rakamdir");
        }
		
		String result = num1 >= num2 ? 
				"En büyük Sayı: " + num1+"\n" + " En kucuk Sayi: " +num2 :
				"En büyük Sayı: " + num2+"\n" + " en kucuk sayi: "+ num1 ;
		System.out.println(result);
		sc.close();
	}

}
