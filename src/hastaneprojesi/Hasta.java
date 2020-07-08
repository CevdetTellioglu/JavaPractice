package hastaneprojesi;

public class Hasta {
	
	private String isim;
	private String soyIsim;
	private int hastaId;
	private Durum hastaDurumu;
	
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyIsim() {
		return soyIsim;
	}
	public void setSoyIsim(String soyIsim) {
		this.soyIsim = soyIsim;
	}
	public int getHastaId() {
		return hastaId;
	}
	public void setHastaId(int hastaId) {
		this.hastaId = hastaId;
	}
	public Durum getHastaDurumu() {
		return hastaDurumu;
	}
	public void setHastaDurumu(Durum hastaDurumu) {
		this.hastaDurumu = hastaDurumu;
	}
	
	
	
}
