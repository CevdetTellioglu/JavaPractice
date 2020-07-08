package hastaneprojesi;

public class HastaneRunner {

	private static Hastane hastane = new Hastane();

	public static void main(String[] args) {

		String hastaDurumu = "Diabet";
		String unvan = doktorUnvan(hastaDurumu);

		hastane.setDoktor(doktorBul(unvan));
		System.out.println("Doktor ismi : " + hastane.getDoktor().getIsim());
		System.out.println("Doktor soy ismi : " + hastane.getDoktor().getSoyIsim());
		System.out.println("Doktor unvani : " + hastane.getDoktor().getUnvan());

		System.out.println("Hasta Durumu: " + hastaDurumuBul(hastaDurumu).getActuelDurum());
		System.out.println("Hasta Aciliyet Durumu: " + hastaDurumuBul(hastaDurumu).isAciliyet());

	}

	public static String doktorUnvan(String aktuelDurum) {
		if (aktuelDurum.equals("Allerji")) {
			return hastane.unvanlar[0];
		} else if (aktuelDurum.equals("Bas agrisi")) {
			return hastane.unvanlar[1];
		} else if (aktuelDurum.equals("Diabet")) {
			return hastane.unvanlar[2];
		} else if (aktuelDurum.equals("Soguk alginligi")) {
			return hastane.unvanlar[3];
		} else if (aktuelDurum.equals("Migren")) {
			return hastane.unvanlar[4];
		} else if (aktuelDurum.equals("Kalp hastaliklari")) {
			return hastane.unvanlar[5];
		}

		return "Yanlis Durum";
	}

	public static Doktor doktorBul(String unvan) {
		Doktor doktor = new Doktor();
		for (int i = 0; i < hastane.unvanlar.length; i++) {
			if (unvan.equals(hastane.unvanlar[i])) {
				doktor.setIsim(hastane.doctorIsimleri[i]);
				doktor.setSoyIsim(hastane.doctorSoyIsimleri[i]);
				doktor.setUnvan(hastane.unvanlar[i]);
			}
		}
		return doktor;
	}

	public static Durum hastaDurumuBul(String aktuelDurum) {
		Durum hastaDurumu = new Durum();
		for (int i = 0; i < hastane.durumlar.length; i++) {
			if (aktuelDurum.equals(hastane.durumlar[i])) {
				hastaDurumu.setActuelDurum(hastane.durumlar[i]);
				if (i < hastane.durumlar.length - 2) {
					hastaDurumu.setAciliyet(false);
				} else {
					hastaDurumu.setAciliyet(true);
				}
			}
		}
		return hastaDurumu;

	}

	public static Hasta HastaBul(String aktuelDurum) {
		Hasta hasta = new Hasta();
		for (int i = 0; i < hastane.durumlar.length; i++) {
			if (aktuelDurum.equals(hastane.durumlar[i])) {
				if (i < hastane.durumlar.length - 2) {
					hasta.getHastaDurumu();
					
				}

			}
		}return hasta;
	}
}

//HastaneRunner > Hastane Objesi var
// Hastane > VeriBankasi extends ( hastane child olarak tüm vreleri elde
// edbiliyor)
// Hastane > Doktor
// Hastane > Hasta
// Hasta > Durum
// HASTANE hasta =new HASTANE();
// hastane.hasta.durum
// hastane.sethasta();