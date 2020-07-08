package javapracticeday9Hamza;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HomeWork02 {
	/*
	 * ATM uygulaması yapınız.
	 * 
	 * 1. Adım : Bankamızdaki müşterilerin musteriNumarasi ve 4 haneli şifresini
	 * tutan bir HashMap oluşturalım. Ve şu müşterileri biz ekleyelim. Integer,
	 * Integer
	 * 
	 * Müşteri No -- Şifre 12345678 1876 22222222 1234 98765432 1453 55554444 2020
	 * 
	 * 2. Adım : Bankamızdaki müşterilerin hesaplarındaki para miktarini tutan bir
	 * tane HashMap oluşturalım. Ve şu miktarları müşteri numarasıyla birlikte
	 * ekleyelim Integer,Float
	 * 
	 * Müşteri No -- Para 12345678 120.0 22222222 3000.0 98765432 7000.0 55554444
	 * 50.0
	 * 
	 * 3. Adım : Giriş ekranı oluşturalım. Müşteri buradan giriş yapsın. Kullanıcı
	 * adı ve şifre isteyelim, doğru ise giriş yapsın.
	 * 
	 * 4. Adım : Doğru müşteri numarası ve şifre kontrol eden methodlar yazalım.
	 * musteriNumarasiDogruMu(int no) Hashmap listemizde varsa, doğru müşteri
	 * numarasıdır.
	 * 
	 * sifreDogruMu (int no, int sifre) HashMap'teki şifre ile uyuşuyorsa doğru
	 * şifredir.
	 * 
	 * 5. Adım : Girş yaptıktan sonra karşısına 3 tane seçenek çıksın : Bunları da
	 * menuGoster() methodu ile yapalım. 1- Para Çek 2- Para Yükle 3- Toplam Paramı
	 * Gör 3- Çıkış Yap
	 * 
	 * 6. Adım : Çıkış methodu oluşturalım. Giriş yapan müşteri çıkış yapmak
	 * isterse, toplamPara ve girisYapanMusteriNo'yu sıfırlayalım. Tekrar giriş
	 * ekranına yöndendirelim.
	 * 
	 * 6. Adım : Toplam parami gor methodu oluşturalım. toplamParamiGor()
	 * 
	 * 7. Adım : 1- Para Çekme Methodu Oluşturalım Hesaba giriş yapan müşteriye
	 * hesabındaki toplam parayı gösterelim. Kullanıcıdan çekmek istediği tutarı
	 * öğrenelim. Hesabında yeterli para varsa, para çeksin yoksa uyarı verelim.
	 * Çektiği tutarı, toplam parasından düşelim ve kaydedelim. Başka işlem yapmak
	 * isteyip istemediğini soralım, isterse yaptıralım, yoksa çıkış işlemi
	 * gerçekleştirelim.
	 * 
	 * 8. Adım : 1- Para Yükleme Methodu Oluşturalım Hesaba giriş yapan müşteriye
	 * hesabındaki toplam parayı gösterelim. Kullanıcıdan yüklemek istediği tutarı
	 * öğrenelim. Yüklediği tutarı, toplam parasına ekleyelim ve gösterelim. Başka
	 * işlem yapmak isteyip istemediğini soralım, isterse yaptıralım, yoksa çıkış
	 * işlemi gerçekleştirelim.
	 * 
	 */

	static Map<Integer, Integer> musterNoSifre = new HashMap<>();
	static Map<Integer, Float> musteriNoPara = new HashMap<>();
	static Scanner sc = new Scanner(System.in);
	static int musteriNo;

	public static void main(String[] args) {
		musterNoSifre.put(12345678, 1876);
		musterNoSifre.put(22222222, 1234);
		musterNoSifre.put(98765432, 1453);
		musterNoSifre.put(55554444, 2020);

		musteriNoPara.put(12345678, 120.0f);
		musteriNoPara.put(22222222, 3000.0f);
		musteriNoPara.put(98765432, 7000.0f);
		musteriNoPara.put(55554444, 50.0f);
		girisEkrani();

	}

	private static void girisEkrani() {
		System.out.println("Hesabiniza erisim saglamak icin musteri numaranizi ve sifrenizi girmelisiniz.");
		System.out.println("Lutfen musteri numaranizi giriniz: ");
		musteriNo = sc.nextInt();
		System.out.println("Lutfen sifrenizi giriniz: ");
		int sifre = sc.nextInt();
		if (musterNoSifre.containsKey(musteriNo) && musterNoSifre.get(musteriNo) == sifre) {
			System.out.println("Musteri numaraniz ve sifreniz dogru islem yapmaya devam edebilirsiniz.");
			toplamParamiGor();
			System.out.println("=====================================");
			menuGoster();
		} else {
			System.out.println("Musteri numaraniz veya sifreniz yanlis.");
			System.out.println("Lutfen musteri numaranizi ve sifernizi kontrol ediniz.");
			girisEkrani();
		}

	}

	private static void menuGoster() {

		System.out.println("Asagidaki menuden yapmak istediginiz islemi seciniz.");
		System.out.println("1- Para Çek \n // 2- Para Yükle \n // 3- Toplam Paramı Gör \n // 4- Çıkış Yap");
		int menu = sc.nextInt();
		switch (menu) {
			case 1: paraCek(); break;
			case 2: paraYukle(); break;
			case 3: toplamParamiGor(); break;
			case 4: cikis(); break;
		default: System.out.println("Yanlis secim yaptiniz lutfen seciminizi kontrol ediniz. ");
			break;
		}
	}

	private static void cikis() {
		musteriNo = 0;
		System.out.println("Guvenli cikis yaptiniz tebrikler.");
		girisEkrani();
	}

	private static void toplamParamiGor() {
		System.out.print("Toplam bakiyeniz: ");
		System.out.println(musteriNoPara.get(musteriNo) + " Euro");
		menuGoster();

	}

	private static void paraYukle() {
		System.out.println("Lutfen yuklemek istediginiz tutari giriniz.");
		float para = sc.nextFloat();
		musteriNoPara.put(musteriNo, musteriNoPara.get(musteriNo) + para);

		System.out.println("Onceki bakiye: " + (musteriNoPara.get(musteriNo) - para) + " Euro");
		System.out.println("Yeni bakiye: " + musteriNoPara.get(musteriNo) + " Euro");
		menuGoster();

	}

	private static void paraCek() {
		System.out.println("Lutfen cekmek istediginiz tutari giriniz.");
		float para = sc.nextFloat();
		if (musteriNoPara.get(musteriNo) >= para) {
			musteriNoPara.put(musteriNo, musteriNoPara.get(musteriNo) - para);

			System.out.println("Cekilen tutar: " + para + " Euro");
			System.out.println("Kalan bakiye: " + musteriNoPara.get(musteriNo) + " Euro");

		} else {
			System.out.println("Cekmek istediginiz tutar icin bakiyeniz yeterli degil.");
			System.out.println("Lutfen baska bir tutar deneyiniz.");
			paraCek();
		}
		menuGoster();

	}

}
