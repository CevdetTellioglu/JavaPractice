package javapracticeday4;

public class AsciiNumbers {

	public static void main(String[] args) {
		
		//Bir loop (dongu) olusturun ve orada sirasiyla alfabedeki 
		//harfleri kucuk harf olarak konsola yazdiriniz ve her harfin
		//karsisina ascii numaralarini yazdiriniz
		//a => 97
		
		char ch ;
		
		for(ch='A'; ch<='z';ch++) {
			int i=ch;
			System.out.println(ch+ " => " +i);
		}
		
	}

}
