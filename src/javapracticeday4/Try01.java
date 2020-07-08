package javapracticeday4;

public class Try01 {

	public static void main(String[] args) {
	String str="Cevdet";
	String  ch="e";
	char aranan ='e';
	int count=0;
		
	for (int i = 0; i < str.length(); i++) {
	
		if(str.charAt(i) == aranan) {
			count++;
		}
	}
	
	System.out.println(aranan + " "+count+" defa "+str+" de bulunmustur");

	int count1=0;
	for (int j = 0; j < str.length(); j++) {
		if (str.substring(j,j+1).equals(ch)) {
			count1++;		
		}
	}
		System.out.println(ch+ " "+ str +" de "+ count1 + " defa bulunmustur.");
	
	}

}
