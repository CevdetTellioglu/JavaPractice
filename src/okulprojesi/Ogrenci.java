package okulprojesi;

public class Ogrenci {

//	 3. Adım : Ogrenci adlı bir class oluşturalım.
//	 Bu classta ogrencinin adı, okulnumarası bulunsun.
//	 String isim;
//	 int ogrenciNo;
	
	private String adOgrenci;
	private String soyadOgrenci;
	private short okulNoOgrenci;

	public String getAdOgrenci() {
		return adOgrenci;
	}

	public void setAdOgrenci(String adOgrenci) {
		this.adOgrenci = adOgrenci;
	}

	public String getSoyadOgrenci() {
		return soyadOgrenci;
	}

	public void setSoyadOgrenci(String soyadOgrenci) {
		this.soyadOgrenci = soyadOgrenci;
	}

	public short getOkulNoOgrenci() {
		return okulNoOgrenci;
	}

	public void setOkulNoOgrenci(short okulNoOgrenci) {
		this.okulNoOgrenci = okulNoOgrenci;
	}

}
