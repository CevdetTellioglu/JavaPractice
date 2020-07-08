package javapracticeday9Hamza;

import java.util.Scanner;

public class HomeWork03 {
	 /*
     * Kullanıcı tarafından girilen yazı ya da sayının polindrom olup olmadığını bulan bir program yazınız.
     * 
     * 1. Adım : Kullanıcıdan veri alalım.
     * 2. Adım : For döngüsü kullanarak aldığımız ifadenin tersini bulalım.
     * 3. Adım : Tersi ile normal ifadeyi karşılaştıralım.
     * 
     * 
     * */


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen metni giriniz : ");
        String str = scanner.nextLine();
        String ters ="";
        for (int i=str.length()-1;i>=0;i--){
            ters += str.charAt(i);
        }
        
        if (str.equals(ters)){
            System.out.println("Polindrom");
        }else {
            System.out.println("Polindrom degil");
        }
       
        // StringBuilder ile
        
        String cumle = "ada";
        StringBuilder sbl = new StringBuilder(cumle);
        String ters1 = sbl.reverse().toString();
        if(cumle.equals(ters1)) {
            System.out.println("Bu polindromdur.");
          }


	}

}
