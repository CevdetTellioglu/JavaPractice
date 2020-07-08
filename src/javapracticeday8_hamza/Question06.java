package javapracticeday8_hamza;

import java.util.Scanner;

public class Question06 {
	/*
	 * While döngüsü kullanarak taş kağıt makas oyununu yazınız.
	 * 
	 * 1. Adım : TAŞ = 0, MAKAS = 1, KAĞIT = 2 2. Adım : 3 kere kazanan çıkana kadar
	 * while döngüsünü devam ettir. 3. Adım : While döngüsü içerisinde, bilgisayarın
	 * tahminini rastgele oluştur. 4. Adım : While döngüsü içerisinde, her seferinde
	 * kullanıcıdan sayı girmesini iste. 5. Adım : Her tahmin sonunda kazananı
	 * yazdır, ve kazananın kazanma sayısını 1 artır.
	 * 
	 */
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		int tahmin = 0;
		int makina = 0;
		int puanMakina = 0;
		int puanOyuncu = 0;
		boolean oyunDevam = true;
		sc.close();

		do {
			System.out.println("Tas==> 0  // Makas==> 1 // Kagit ==> 2");
			System.out.println("Yukarida verilen lerden birini seciniz.");
			tahmin = sc.nextInt();
			// Math Classi kullanilarak 0-1-2 sayilari rastgele uretiliyor.
			makina = (int) (Math.random() * 3);
			System.out.println("................................ ");
			System.out.print("Sizin tahmininiz: " + tahmin + "   //   ");
			System.out.println("Bilgisayarin tahmini: " + makina);

			// Oyunda ki eli kimin kazandigini bulmak icin
			// Kazanana puan vermek icin puanOyuncu veya puanMakina artiriliyor.
			if (tahmin == makina) {
				System.out.println("Beraberlik.");
			} else if (tahmin == 0 && makina == 1) {
				System.out.println("Tas makasi kirar. \nTebrikler kazandiniz ");
				puanOyuncu++;
			} else if (tahmin == 0 && makina == 2) {
				System.out.println("Kagit tasi sarar. \nKaybettiniz. ");
				puanMakina++;
			} else if (tahmin == 1 && makina == 0) {
				System.out.println("Tas makasi kirar. \nKaybettiniz. ");
				puanMakina++;
			} else if (tahmin == 1 && makina == 2) {
				System.out.println("Makas kagidi keser kazandiniz. \nTebrikler kazandiniz ");
				puanOyuncu++;
			} else if (tahmin == 2 && makina == 0) {
				System.out.println("Kagit tasi sarar kazandiniz. \nTebrikler kazandiniz ");
				puanOyuncu++;
			} else if (tahmin == 2 && makina == 1) {
				System.out.println("Makas kagidi keser. \nKaybettiniz. ");
				puanMakina++;
			} else {
				System.out.println("Yanlis sayi girdiniz.");
				System.out.println("Lutfen Tas icin: 0, Makas icin: 1 ve Kagit icin: 2 yi seciniz. ");
			}

			System.out.print("Sizin Puaniniz: " + puanOyuncu + "    //    ");
			System.out.println("Bilgisayarin Puani: " + puanMakina);
			System.out.println("................................");

			// Oyunu bitirmek ve kazanin kim oldugunu yazdirmak icin
			if (puanMakina == 3 || puanOyuncu == 3) {
				if (puanMakina == 3) {
					System.out.println("Malesef kaybettiniz.");
					System.out.println("Kazanan bilgisayar.");
				} else {
					System.out.println("Tebrikler kazandiniz.");
				}
				oyunDevam = false;
			}

		} while (oyunDevam);

	}

}
