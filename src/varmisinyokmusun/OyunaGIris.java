package varmisinyokmusun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OyunaGIris {
	/*
	 * "Var Mısın Yok Musun ?" oyunu oluşturalım.
	 * 
	 * Oyunun mantığı : 10 tane kutu vardır, ve her kutunun içinde para miktarını gösteren bir sayı vardır.
	 * Oyunu oynayan kişinin sahip olduğu bir kutu vardır.
	 * Kalan 9 kutuyu sırasıyla açtırır ve her 3 kutu açtığında, yarışmanın sahibi tarafından teklifte bulunulur.
	 * Oyuncu isterse teklifi kabul eder, isterse de oyuna devam edip kendi kutusundaki miktarı kazanabilir.
	 * 
	 * Örnek : 10 kutunun içinde rastgele olarak dizilmiş şu şekilde miktarlar olsun.
	 * 
	 * 1. Kutu : 1 TL
	 * 2. Kutu : 10 TL
	 * 3. Kutu : 500 TL
	 * 4. Kutu : 1000 TL
	 * 5. Kutu : 5000 TL
	 * 6. Kutu : 10000 TL
	 * 7. Kutu : 50000 TL
	 * 8. Kutu : 100000 TL
	 * 9. Kutu : 250000 TL
	 * 10. Kutu : 500000 TL
	 * 
	 * 
	 * Bizim kutumuz 8. kutu olsun.
	 * 
	 * Biz her seferinde kalan 9 kutudan birisini seçip açtıracağız, her üç kutu açtıktan sonra 
	 * yapımcıdan teklif alacağız. Diyelim ki ilk 3 kutu açıldıktan sonra yapımcı bize 10.000 TL teklif etti,
	 * istersek bunu kabul edeceğiz, istemezsek devam edeceğiz.
	 * 
	 * Son kutu kalana kadar devam edebiliyoruz.
	 * 
	 * 
	 * 1. Adım : Önce 10 farklı para miktarını tutmak için List<Integer> paraListesi  
	 * 			adında ArrayList oluşturalım ve miktarları ekleyelim.
	 * 				
	 * 2. Adım : 10 Tane kutu oluşturalım ve her kutunun içine rastgele bir miktar atayalım.
	 * 			 Bu miktarları paraListesi adlı arrayList'imizden alalım.
	 * 			 Bunun için Kutu isimli bir class oluşturalım.
	 * 			 içerisine kutuNumarasi ve paraMiktari diye iki tane integer oluşturalım.
	 * 			 
	 *
	 * 			 ayrıca paraMiktarını ve kutuNumarasini almak için 
	 * 			 "getter" methodlarımızı oluşturalım.
	 * 
	 * 			 constructor ile de ayrıca bu iki değişkenin verilerini, obje oluştururken ekleyebilelim.
	 * 
	 * 3. Adım : Kutuları ekleyebilmek, ve kutular üzerinde işlemler yapabilmek için Kutular classı oluşturulım
	 * 			 Oluşturduğumuz tüm Kutu nesnelerini Kutular a ekleyelim.
	 * 			 Bunun için Kutular class'ı içerisinde çeşitli methodlar oluşturalım.
	 * 			 Ayrıca yapımcinin teklifini de bu class içerisinden alalım.
	 * 
	 * 			 public void kutuEkle(Kutu kutu)
	 * 			 kalanKutuSayisiniAl() 
	 * 			 kutulardakiToplamParaMiktari()
	 * 			 secilenKutuyuKutularListesindenKaldir(int kutuNumarasi)
	 * 			 public String acilmamisKutulariGoster()
	 * 			 public void kutuActir(int kutuNumarasi)
	 * 			 public int yapimcininTeklifAl(Kutular kutular , int kendiParaMiktarim)
	 * 	
	 * 5. Adım : Oyunu başlatalım, kullanıcıdan seçmek istediği kutu numarasını alalım.
	 * 
	 * 6. Adım : Yapimci adında bir tane class class oluşturalım.
	 * 			 Yapımcı classından bir tane nesne üretelim ve her 3 kutu açıldığnda
	 * 			 kendisinin içerisindeki teklifVer() methodu ile teklif alalım.
	 * 
	 */
	static List<Integer> paraListesi = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	static int kutuNumaram , kutumdakiParaMiktari;
	static Kutular kutular = new Kutular();
	public static void main(String[] args) {
		paraListesi.add(1);         
		paraListesi.add(10);        
		paraListesi.add(500);
		paraListesi.add(1000);
		paraListesi.add(5000);
		paraListesi.add(10000);   
		paraListesi.add(50000);
		paraListesi.add(100000);
		paraListesi.add(250000);
		paraListesi.add(500000);
		Collections.shuffle(paraListesi);
		kutulariOlustur();
		System.out.println("     OYUNUMUZA HOŞGELDİNİZ     ");
		System.out.println("Lütfen Kutunuzu Seçiniz : ");
		kutuNumaram = scan.nextInt();     // 2
		kutumdakiParaMiktari = paraListesi.get(kutuNumaram-1);
		System.out.println("Kutu Numaranız : " + kutuNumaram);
		//System.out.println("Kutunuzdaki Para : " + kutumdakiParaMiktari);
		kutular.kendiKutumuKaldir(kutuNumaram);
		kutuSecmeActirma();
	}
	private static void kutuSecmeActirma() {
		System.out.println("\nKalan Kutular : " + kutular.acilmamisKutulariGoster());
		System.out.println("\nHangi kutuyu açtırmak istiyorsunuz ? : ");
		int secim = scan.nextInt();
		kutular.kutuActir(secim);
		if(kutular.kalanKutuSayisiniAl() == 7 
				|| kutular.kalanKutuSayisiniAl() == 4 
				|| kutular.kalanKutuSayisiniAl() == 1) {
			System.out.println("Teklif :" + kutular.teklifAl());
			System.out.println("*****Kabul Ediyor musun******\n1-Evet\n2-Hayır");
			int kabul = scan.nextInt();
			if(kabul == 1) {
				System.out.println("Oyun Bitti. Kazandığın Para : " + kutular.teklifAl());
				System.out.println("Kutunda da " + kutumdakiParaMiktari + " TL vardı.");
			}else {
				kutuSecmeActirma();
			}
		}else {
			if(kutular.kalanKutuSayisiniAl() > 0 ) {
				kutuSecmeActirma();
			}else {
				System.out.println("Oyun Bitti !\nKutundaki Para : "+ kutumdakiParaMiktari);
			}
		}
	}
	private static void kutulariOlustur() {
		for(int i = 0 ; i < 10 ; i++) {
			Kutu kutu = new Kutu();
			kutu.setKutuNumarasi(i + 1); /// 1 2 3 4 5 6 7 8 9 10
			kutu.setKutudakiParaMiktari(paraListesi.get(i));
			// Oluşturduğumuz kutu nesnelerini kutular classın içindeki arrayliste ekledik.
			kutular.kutuEkle(kutu);
			//System.out.println("Kutu No : " + ( i + 1 ) + " Para Miktarı : " + paraListesi.get(i));
		}
	}
}
