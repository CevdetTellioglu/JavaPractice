package javapracticeday8_hamza;

public class Question03 {

	public static void main(String[] args) {
		/*
		 * İç içe for döngüleri kullanarak çarpım tablosunu ekrana yazdırınız. 1. Adım :
		 * 1'den 10'a kadar tüm sayıları gözden geçirmek için for döngüsü oluştur. 2.
		 * Adım : Her gözden geçirilen sayı için 1'den 10'a kadar tüm sayılarla çarp ve
		 * ekrana yazdır.
		 */

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "x" + j + "=" + (i * j));
			}
			System.out.println();

		}
	}
}
