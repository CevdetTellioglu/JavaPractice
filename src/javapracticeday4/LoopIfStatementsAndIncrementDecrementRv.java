package javapracticeday4;

import java.util.Scanner;

public class LoopIfStatementsAndIncrementDecrementRv {

	public static void main(String[] args) {
		/*
		 * bir userName (kullanici adi)olusturunuz ve onun ozellikleri sirasi ile soyle
		 * olmalidir; 1_uzunlugu => en az 8 karakter (chars) olmalidir 2_icinde sadece
		 * alfabetik karakterler bulunmalidir
		 * 
		 * bir sifre olusturunuz ozellikleri sirasi ile soyle olmalidir; 1_uzunlugu =>
		 * en az 10 karakter(chars) olmalidir 2_en az 1 sembol bulundurmali 3_en az 1
		 * numara bulundurmali 4_en az buyuk harf olmalidir 5_en az bir kucuk harf
		 * olmalidir
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen kullanici adini giriniz");
		String id = scan.next().toLowerCase();
		System.out.println("Lutfen sifrenizi giriniz");
		String pass = scan.next();
		int count = 0;

		if (id.length() > 8) {
			for (int i = 0; i < id.length(); i++) {
				char temp = id.charAt(i);
				if (!(temp >= 'a' && temp <= 'z')) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println("your id :" + id + " Accepted.");
			} else {
				System.out.println("Can't Accepted id, Try again! ");
			}

		} else {
			System.out.println("Not enough lenght character id,  Try again!");
		}

		int numOfSymbol = 0;
		int numOfDigits = 0;
		int numOfCapital = 0;
		int numOfMiniscule = 0;

		if (pass.length() >= 10) {
			for (int i = 0; i < pass.length(); i++) {
				char temp = pass.charAt(i);
				if (!((temp <= 'z' && temp >= 'a') || 
						(temp <= 'Z' && temp >= 'A') || 
						(temp >= '0' && temp <= '9'))) {
					numOfCapital++;
				}
			}

		}

	}

}
