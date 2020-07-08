package javapracticeday8_hamza;

import java.util.Scanner;

public class Question04 {
	/* 1. Kullanıcının girdiği sayının, 
	 * 		for döngüsü kullanarak rakamları toplamını bulan method yazınız.
	 * 
	 * 1. Adım : Kullanıcıdan sayı al.
	 * 2. Adım : Sayıyı String'e çevirin.
	 * 3. Adım : String'in her elemanını sayıya çevir ve toplama ekle
	 * 
	 * Bunu method kullanarak yapalım methodumuz toplamı return etsin.
	 * Method ismi : public static int getRakamlarToplami(int sayi)
	 * 
	*/
	/* 2. Kullanıcının girdiği sayının, while döngüsü kullanarak 
	 * 			 rakamları toplamını bulan method yazınız.
	 * 
	 * 1. Adım : Kullanıcıdan sayı al.
	 * 2. Adım : Sayının %10'unu alarak son hanesini al ve toplama ekle.
	 * 3. Adım : Daha sonra sayıyı son haneden kurtarmak için 10'a böl.
	 * 4. Adım : Sayı 0 olarak kadar bu işlemi while döngüsü ile tekrarla.
	 * 
	 * Bunu da method kullanarak yapalım, toplamı return etsin.
	 * Method ismi : public static int getRakamlarToplamiWhileDongusu(int sayi)
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen rakamlarını toplamak istediğiniz sayıyı yazınız : ");
		int sayi = scan.nextInt();
		System.out.println(getRakamlarToplami(sayi)); 
		System.out.println(getRakamlarToplamiWhileDongusu(sayi));
		scan.close();
	}
	public static int getRakamlarToplami(int sayi) {
		String sayininStringi = String.valueOf(sayi); /// "345"
		int toplam = 0;
		for(int i =  0 ; i < sayininStringi.length(); i++ ) {
			int sayiyaCevir = Integer.parseInt(sayininStringi.substring(i, i+1));
			toplam += sayiyaCevir; // 3 + 4 + 5
		}
		return toplam;
	}
	public static int getRakamlarToplamiWhileDongusu(int sayi) { /// 123
		int toplam = 0;
		while( sayi > 0 ) {
			int sonHane = sayi % 10 ; // 3  	 2     1
			toplam += sonHane;		  // 3+2	 5+1   6			
			sayi = sayi / 10;		  // 12		 1     0
		}
		return toplam;
	}

}
