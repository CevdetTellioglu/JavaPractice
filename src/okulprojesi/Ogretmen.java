package okulprojesi;

public class Ogretmen {

//	 2. Adım : Ogretmen adlı bir class oluşturalım.
//	 Bu classta öğretmenin adı, branşı ve telefon numaralarını tutalım.
//	 String isim, brans, telefon 
//	 içerisine "public String toString()" methodu ekleyerek, istediğimiz 
//	 zaman öğretmenlerin bilgilerini yazdıralım
	
	private String adOgretmen;
	private String bransOgretmen;
	private String telefonOgretmen;
	
	public String getAdOgretmen() {
		return adOgretmen;
	}
	public void setAdOgretmen(String adOgretmen) {
		this.adOgretmen = adOgretmen;
	}
	public String getBransOgretmen() {
		return bransOgretmen;
	}
	public void setBransOgretmen(String bransOgretmen) {
		this.bransOgretmen = bransOgretmen;
	}
	public String getTelefonOgretmen() {
		return telefonOgretmen;
	}
	public void setTelefonOgretmen(String telefonOgretmen) {
		this.telefonOgretmen = telefonOgretmen;
	}

}
