package varmisinyokmusun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bilgiler {
	static List<String> isimler = new ArrayList<>();
	public static void main(String[] args) {
		isimler.add("Ramazan");
		isimler.add("İbrahim");
		isimler.add("İskender");
		isimler.add("Ali");
		System.out.println(isimler.toString());
		// ArrayList'in içerisindeki verileri rastgele olarak sıraya koyar.
		Collections.shuffle(isimler);
		System.out.println(isimler.toString());
		
		// ArrayList ile obje tutma.
		
		List<Kutu> kutular = new ArrayList<>();
		Kutu kutu = new Kutu();
		kutular.add(kutu);
		// Override işlemi
		Child childNesnesi = new Child();
		System.out.println(childNesnesi.toString());
		childNesnesi.parentIsimYazdir();
	}
}