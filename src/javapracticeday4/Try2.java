package javapracticeday4;



public class Try2 {

	public static void main(String[] args) {
		
		
		String str="Fransa";
		String str1="ans";
		char ch1='a';
		
		int count=0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)== ch1) {
				count++;	
			}
				
			}
		System.out.println(count + " defa " + ch1+ " var ");
		int count1=0;
		for (int i = 0; i < str.length()-str1.length(); i++) {
			if(str.substring(i,i+str1.length()).equals(str1)) {
				count1++;
			}
			}
		System.out.println(count1);
		
		String name  ="Mehmet";
		
		
		System.out.println(len(name));
		
		}

	
	static public int len(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			count++;
		}
		
		
		return count;
	}
	
	
	}


