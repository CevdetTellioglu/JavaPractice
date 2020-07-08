package javapracticeday6;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		/*
		 * kullanicidan bir cumle isteyiniz ve cumlenin kelimelerini tersten yazdiriniz 
		 * e.g: I love java ==> java love I 
		 * String reverse = ""; 
		 * 
		 * substring method ile yapiniz veya array ile yapiniz
		 * 
		*/
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Cumleyi giriniz ");
        String str=sc.nextLine();
         
        int ilkBosluk = str.indexOf(" ");
        int sonuncuBosluk = str.lastIndexOf(" ");
        
         
        System.out.println(ilkBosluk);
        System.out.println(sonuncuBosluk);
        
        System.out.println(str.substring(sonuncuBosluk+1)+str.substring(ilkBosluk,sonuncuBosluk+1)+
        		str.substring(0,ilkBosluk));
       
         
         
         String arr[] =str.split(" ");
       for (int i = arr.length-1; i>=0; i--) {
		System.out.print(arr[i]+" ");
	}
       sc.close();
	}

}
