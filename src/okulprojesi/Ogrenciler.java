package okulprojesi;

import java.util.ArrayList;
import java.util.List;

public class Ogrenciler {

//	5. Adım : Ogrenciler adlı class oluşturalım.
//	Bu classta tüm öğrenciler tutalım.
//	İçerisine List<Ogrenci> ogrenciListesi adlı bir ArrayList oluşturalım ve tüm öğretmenleri içine ekleyelim
//	Bu class'ın içine "ogrenciEkle(Ogrenci ogrenci)" diye bir method ekleyelim. Bunu kullanarak yeni öğrenci ekleyebilelim.

	private List<String> adOgrenciler = new ArrayList<String>();
	private List<String> soyadOgrenciler = new ArrayList<String>();
	private List<Integer> okulNoOgrenciler = new ArrayList<>();

	public List<String> getAdOgrenciler() {
		return adOgrenciler;
	}

	public List<String> getSoyadOgrenciler() {
		return soyadOgrenciler;
	}

	public List<Integer> getOkulNoOgrenciler() {
		return okulNoOgrenciler;
	}
	
	public void setadOgrenciler(String ad) {
		adOgrenciler.add(ad);
	}
	public void setsoyadOgrenciler(String soyad) {
		soyadOgrenciler.add(soyad);
	}
	public void setokulNoOgrenciler(int okulNo) {
		okulNoOgrenciler.add(okulNo);
	}

}
