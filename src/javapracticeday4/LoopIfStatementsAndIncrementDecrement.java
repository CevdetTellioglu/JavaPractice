package javapracticeday4;

import java.util.Scanner;

public class LoopIfStatementsAndIncrementDecrement {

	public static void main(String[] args) {
		/*
		 * bir userName (kullanici adi)olusturunuz ve onun ozellikleri sirasi ile soyle olmalidir;
 		1_uzunlugu => en az 8 karakter (chars) olmalidir
 		2_icinde sadece alfabetik karakterler bulunmalidir
 		
 		bir sifre olusturunuz ozellikleri sirasi ile soyle olmalidir;
 		1_uzunlugu => en az 10 karakter(chars) olmalidir
 		2_en az 1 sembol bulundurmali
 		3_en az 1 numara bulundurmali
 		4_en az buyuk harf olmalidir
 		5_en az bir kucuk harf olmalidir
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen kullanici adini giriniz.");
		String id=scan.next().toLowerCase();
		System.out.println("Lutfen sifrenizi giriniz.");
		String pass=scan.next();
		int count=0;
		
		if(id.length()>=8 ) {
			for (int i = 0; i < id.length(); i++) {
				char temp=id.charAt(i);
				if(!(temp >= 'a' && temp<='z')) {
					count++;
				}
			}	
			if(count == 0) {
				System.out.println("Your id : "+ id + " / Accepted");
			}else {
				System.out.println("Can't Accepted id, Try again! ");
			}
		}else{
			System.out.println("Not enough lenght character id,  Try again!");
		}
	
			String sembol = "!@#$%%^&*()_.?+";
		    String rakam = "0123456789";
		    int numOfSembol = 0;
		    int numOfRakam = 0;
		    int numOfBuyukHarf =0;
		    int numOfKucukHarf =0;
		    
		//  System.out.println(pasword.substring(2,6));
		    
		    
		    
		    if(pass.length() >= 10) {
		        
		        
		        for (int i = 0; i < pass.length(); i++) {
		            if(sembol.contains(pass.substring(i,i+1))) {
		                numOfSembol++;
		            }
		            
		            if(rakam.contains(pass.substring(i,i+1))) {
		                numOfRakam++;
		            }
		            
		            if(pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z') {
		                numOfKucukHarf++;
		            }
		            
		            if(pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z') {
		                numOfBuyukHarf++;
		            }
		        }
		        
		        if(numOfSembol > 0 ) {
		            
		            if(numOfRakam > 0) {
		                
		                if(numOfBuyukHarf > 0) {
		                    if(numOfKucukHarf > 0){
		                        System.out.println("Tebrikler Passwordunuz basarili bir sekilde olusturulmustur");
		                    }else {
		                        System.out.println("Kucuk harf kullanmaniz gerekmektedir");
		                    }
		                }else {
		                    System.out.println("Buyuk harf kullanmaniz gerekmektedir");
		                }
		            }else {
		                System.out.println("Bir numara kullanmaniz gerekiyor!");
		            }
		        }else {
		            System.out.println("Maalesef sembol kullanmadiginiz icin password olusturulamadi");
		        }
		        
		        
		        
		        
		        
		        
		    }else {
		        System.out.println("pasword lengthiniz yetersizdir!");
		        System.out.println("Lutfen daha guclu hale getiriniz!");
		    }
		    scan.close();
	}

}
