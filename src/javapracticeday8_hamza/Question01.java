package javapracticeday8_hamza;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
		 * Santimetreyi, metreye ve kilometreye çeviren bir program yazınız. Çıktı :
		 * Lütfen santimetre değerini giriniz: 212 212 santimetre 2.12 metre ve 0.00212
		 * kilometreye eşittir. İpucu : 100 cm = 1 mt = 0.001 kilometre
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen santimetre değerini giriniz : ");
		int santimetre = scan.nextInt();
		float metre = santimetre / 100f;
		float kilometre = santimetre / 100000f;
		System.out.println("Metre " +metre);
		System.out.println("Kilometre " +kilometre);
		/////////////////////////////
		System.out.println("\ngetMetre " + getMetre(santimetre));
		System.out.println("getKilometre " + getKilometre(santimetre));
		scan.close();
	}
	private static float getMetre(int santimetre) {
		return santimetre / 100f;
	}
	private static float getKilometre(int santimetre) {
		return santimetre / 100000f;
	}
	
	

}
