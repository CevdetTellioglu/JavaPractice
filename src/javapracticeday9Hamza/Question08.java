package javapracticeday9Hamza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question08 {

	/*
	 * Basit bir manav alışveriş programı yazınız.
	 *
	 * 1. Adým : Ürün listesinden ürün seçtir ve kaç kilo olduðunu sor. 2. Adým :
	 * Baþka bir ürün almak isteyip istemediğini sor. İstemiyorsa toplam miktarı
	 * göster, istiyorsa tekrar ürün seçtir. Bu iþlemi alıþveriþi bitirmek isteyene
	 * kadar tekrarla. 3. Adým : Müşteri her ürün seçtiğinde, aldığı ürünün fıyatını
	 * toplam fiyata ekle. 4. Adým : Alışveriş bitince toplam ödemesi gereken tutarı
	 * göster.
	 *
	 *
	 * urunListesi.add("Domates - Urun Kodu : 0");
	 * urunListesi.add("Biber - Urun Kodu : 1");
	 * urunListesi.add("Erik - Urun Kodu : 2");
	 * urunListesi.add("Karpuz - Urun Kodu : 3");
	 * urunListesi.add("Havuç - Urun Kodu : 4");
	 * 
	 * urunFiyatlari.add(2.0f); urunFiyatlari.add(3.0f); urunFiyatlari.add(10.0f);
	 * urunFiyatlari.add(5.0f); urunFiyatlari.add(3.0f);
	 *
	 */

	static float toplamOdenecekTutar = 0;
	static List<String> urunListesi = new ArrayList<>();
	static List<Float> urunFiyatlari = new ArrayList<>();

	public static void main(String[] args) {

		urunListesi.add("Domates - Urun Kodu : 0");
		urunListesi.add("Biber - Urun Kodu : 1");
		urunListesi.add("Erik - Urun Kodu : 2");
		urunListesi.add("Karpuz - Urun Kodu : 3");
		urunListesi.add("Havuç - Urun Kodu : 4");

		urunFiyatlari.add(2.0f);
		urunFiyatlari.add(3.0f);
		urunFiyatlari.add(10.0f);
		urunFiyatlari.add(5.0f);
		urunFiyatlari.add(3.0f);

		System.out.println(urunListesi.toString());
		musteriyeNeSecmekIstediginiSor();

	}

	public static void musteriyeNeSecmekIstediginiSor() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hangi urunu secmek istersiniz : ");
		int secim = scan.nextInt(); // 0 - Domates

		System.out.println("Kac kilogram almak istersniz : ");
		float kilo = scan.nextFloat();

		float toplamUrunFiyati = urunFiyatlari.get(secim) * kilo;
		toplamOdenecekTutar += toplamUrunFiyati;

		System.out.println("Alisverise devam etmek ister misiniz ? ( 0 = EVET  1 = HAYIR )");

		int devam = scan.nextInt();

		if (devam == 0) {
			musteriyeNeSecmekIstediginiSor();
		} else {
			kasayaGit();
		}
		scan.close();
	}

	private static void kasayaGit() {
		System.out.println("Toplam odenecek tutar : " + toplamOdenecekTutar);
	}

}
