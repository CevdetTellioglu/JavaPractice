package javapracticeday9Hamza;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question09 {
	/*
	 * Basit bir telefon rehberi uygulaması yazınız.
	 * 
	 * 1. Adım : İsim ve telefon numaralarını HashMap ile tutunuz. 2. Adım :
	 * Kullanıcıya 1-Kişi Ekle , 2-Kişi Çıkar, 3-Rehberi Gör, 4-Çıkış seçenekleri
	 * sunalım. 3. Adım : Bu işlem için while döngüsü kullanalım, kullanıcı 4-
	 * Çıkış'a tıklayana kadar sürekli gösterelim.
	 * 
	 * İpucu : Numarayı long veri tipinde tutunuz.
	 * 
	 * 
	 * static Map<Long,String> rehber = new HashMap<>();
	 * 
	 * 0530 000 00 00 , Ayşe
	 */
	static Map<Long, String> rehber = new HashMap<>(); /// 0599 999 99 99 = Ahmet
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean cikis = false;
		while (!cikis) { // cikis == false
			System.out.println("1-Kişi Ekle , 2-Kişi Çıkar, 3-Rehberi Gör, 4-Çıkış");
			System.out.println("Lütfen seçim yapınız : ");
			int secim = scan.nextInt();
			switch (secim) {
			case 1:
				kisiEkle();
				break;
			case 2:
				kisiCikar();
				break;
			case 3:
				rehberiGor();
				break;
			case 4:
				cikis = true;
				break;
			default:
				System.out.println("Yanlış Seçim Yaptınız");
				break;
			}
		}
		System.out.println("Çıkış yapıldı !");
	}

	private static void kisiCikar() {
		System.out.println("Lütfen silmek istediğiniz numarayı giriniz : ");
		long numara = scan.nextLong();
		if (rehber.get(numara) == null) {
			System.out.println("Böyle bir numara yok");
			if (rehber.size() > 0)
				kisiCikar();
		} else {
			rehber.remove(numara);
			System.out.println("Kullanıcı başarıyla silindi.");
		}
	}

	private static void kisiEkle() {
		System.out.println("Kişi ismini giriniz : ");
		String isim = scan.next();
		System.out.println("Telefon no giriniz : ");
		long numara = scan.nextLong();
		rehber.put(numara, isim);
	}

	private static void rehberiGor() {
		if (rehber.size() < 1) {
			System.out.println("Rehber Boş");
			return; /// method sona erer.
		}
		for (Long numara : rehber.keySet()) {
			System.out.println(rehber.get(numara) + " : " + numara);
		}
	}
}
