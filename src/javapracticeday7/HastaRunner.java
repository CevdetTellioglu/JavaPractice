package javapracticeday7;

public class HastaRunner {

	public static void main(String[] args) {

		Case durum = new Case();
		Hasta hasta1 = new Hasta();
		
		

		hasta1.setIsim("John");
		hasta1.setSoyIsim("Toprak");
		hasta1.setActuelDurum(durum);
		

		durum.setActualCase("Covid-19");
		durum.setEmergency("Vahim");
		System.out.println("Suan ki durumu: " + durum.getActualCase());
		System.out.println("Aciliyet durumu: " + durum.getEmergency());

		System.out.println("Hasta adi : "+ hasta1.getIsim());
		System.out.println("Hasta Soyisim : "+hasta1.getSoyIsim());
		System.out.println("Hasta1 durum: " + hasta1.getActuelDurum().getActualCase());
		System.out.println("Hastanin aciliyet durumu : "+hasta1.getActuelDurum().getEmergency());
	}

}
