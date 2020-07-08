package varmisinyokmusun;

import java.util.ArrayList;
import java.util.List;


public class Kutular {
	private List<Kutu> kutuListesi = new ArrayList<>();  // 10 kutu vardı. 9 8 7 6 5 4 3 2 1
	//    10  9 8 7 6 5 4 3 2 1
    //	bizim
	//    9 8 7 6 5 4 3 2 1
	//    9   7 6 5 4 3 2 1
	//    9   7 6   4 3 2 1
	//        7 6   4 3 2 1
	// 1 2 3 4 5 6 7 8 9 10
	// remove(5-1);
	// 1 2 3 4 6 7 8 9 10
	// remove(7-1)
	public void kutuEkle(Kutu gelenKutu) {
		kutuListesi.add(gelenKutu);
	}
	public int kalanKutuSayisiniAl() {
		return kutuListesi.size();
	}
	public int kutulardakiToplamPara() {
		int toplamPara = 0;
		for(Kutu kutu : kutuListesi) {
			toplamPara +=  kutu.getKutudakiParaMiktari();
		}
		return toplamPara;
	}
	public String acilmamisKutulariGoster() {
		String acilmamislar = "";
		for(Kutu kutu : kutuListesi) {
			acilmamislar += " " + kutu.getKutuNumarasi();
		}
		return acilmamislar;
	}
	public void kendiKutumuKaldir(int kutuNumarasi) { 
		for(Kutu kutu : kutuListesi) {
			if(kutu.getKutuNumarasi() == kutuNumarasi) {
				kutuListesi.remove(kutu);
				break;
			}
		}
	}
	public void kutuActir(int kutuNumarasi) { 
		for(Kutu kutu : kutuListesi) {
			if(kutu.getKutuNumarasi() == kutuNumarasi) {
				System.out.println("Kutudaki Para Miktarı : " + kutu.getKutudakiParaMiktari());
				kutuListesi.remove(kutu);
				break;
			}
		}
	}
	public int teklifAl() {
		return kutulardakiToplamPara() / 7;
	}
}