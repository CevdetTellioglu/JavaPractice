package okulprojesi;

import java.util.ArrayList;
import java.util.List;

public class Ogretmenler {

//	Adım : Ogretmenler adlı class oluşturalım.
//	Bu classta tüm öğretmenleri tutualım.
//	İçerisine List<Ogretmen> ogrentmenListesi adlı bir ArrayList oluşturalım ve tüm öğretmenleri içine ekleyelim
//	Bu class'ın içine "ogretmenEkle(Ogretmen ogretmen)" diye bir method ekleyelim. Bunu kullanarak yeni öğretmen ekleyebilelim.
	private List<String> adOgretmenler = new ArrayList<String>();
	private List<String> bransOgretmenler = new ArrayList<String>();
	private List<String> telefonOgretmen = new ArrayList<String>();

	public List<String> getAdOgretmenler() {
		return adOgretmenler;
	}

	public List<String> getBransOgretmenler() {
		return bransOgretmenler;
	}

	public List<String> getTelefonOgretmen() {
		return telefonOgretmen;
	}

	public void setAdOgretmenler(String ad) {
		adOgretmenler.add(ad);
//		bransOgretmenler.add(brans);
//		telefonOgretmen.add(telefon);
	}

	public void setBransOgretmenler(String brans) {
		bransOgretmenler.add(brans);
//		adOgretmenler.add(ad);
//		telefonOgretmen.add(telefon);
	}

	public void setTelefonOgretmenler(String telefon) {
		telefonOgretmen.add(telefon);
//		adOgretmenler.add(ad);
//		bransOgretmenler.add(brans);

	}

}
