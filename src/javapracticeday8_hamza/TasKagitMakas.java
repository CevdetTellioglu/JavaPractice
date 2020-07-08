package javapracticeday8_hamza;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {

	public static void main(String[] args) {
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
		int kazanmaSayiKullanici = 0;
		int kazanmaSayiBilgisayar = 0;
		int bitis = 3;
		Scanner scan = new Scanner(System.in);
		List<String> liste = new ArrayList<>(); /// collections - list
		liste.add("TAŞ ");
		liste.add("MAKAS ");
		liste.add("KAĞIT ");
		System.out.println("TAŞ = 0 , MAKAS = 1, KAĞIT = 2");
		// 3 3 1 3
		while (kazanmaSayiBilgisayar < bitis && kazanmaSayiKullanici < bitis) {
			// false && true
			int bilgisayarinTahmini = new Random().nextInt(3); // 2
			System.out.println("Lütfen tahmininizi yazınız : ");
			int kullanicininTahmini = scan.nextInt(); // 0
			System.out.println("Bilgisayar : " + liste.get(bilgisayarinTahmini)); // KAĞIT
			System.out.println("Kullanıcı : " + liste.get(kullanicininTahmini)); // TAŞ
			if (bilgisayarinTahmini == kullanicininTahmini) {
				System.out.println("BERABERLİK !");
			} else if ((kullanicininTahmini == 0 && bilgisayarinTahmini == 1)
					|| (kullanicininTahmini == 1 && bilgisayarinTahmini == 2)
					|| (kullanicininTahmini == 2 && bilgisayarinTahmini == 0)) {
				System.out.println("KULLANICI KAZANDI");
				kazanmaSayiKullanici++;
			} else {
				System.out.println("BİLGİSAYAR KAZANDI");
				kazanmaSayiBilgisayar++;
			}
			System.out.println("BİLGİSAYAR : " + kazanmaSayiBilgisayar + "\nKULLANICI : " + kazanmaSayiKullanici);
		}
		scan.close();

	}
}
