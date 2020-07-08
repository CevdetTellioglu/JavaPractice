package javapracticeday8_hamza;

import java.util.Random;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		/*
		 * Whilde döngüsü kullanarak "sayı tahmin oyunu" yazınız.
		 * 
		 * 1. Adım : Java ile rastgele bir sayı üretelim (new Random() kullanabilrsiniz)
		 * 2. Adım : Kullanıcıdan tahminini alalım. 3. Adım : Kullanıcının girdiği
		 * tahmini, bilgisayarın ürettiği rastgele sayı ile karşılaştıralım. 4. Adım :
		 * Cevap doğru olana kadar 2. ve 3. adımı tekrarlayalım, bunu da while döngüsü
		 * ile yapalım
		 */
		Scanner scan = new Scanner(System.in);

		int sayi = -1;
		int rastgeleSayi = new Random().nextInt(10); // 0 ile 10 arasinda

		System.out.println(rastgeleSayi); // random verilen sayiyi gorduk
		while (sayi != rastgeleSayi) {
			System.out.println("Lutfen sifir ile on arasinda bir tahmin sayisi girin");
			sayi = scan.nextInt();
			if (sayi == rastgeleSayi) {
				System.out.println("Tebrikler kazandiniz");
			} else {
				System.out.println("Yanlis cevap");
			}
		}
		scan.close();
	}

}
