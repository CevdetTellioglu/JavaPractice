package javapracticeday5;

public class AileStaticVariable {
	
	static int ailePizzasi = 8;
	int bireyselPizza = 8;
	
	
	
	public static void main(String[] args) {
		
		 AileStaticVariable cocuk = new  AileStaticVariable();
		 
		 cocuk.ailePizzasi -= 2;
		 cocuk.bireyselPizza -= 2;
		
		 System.out.println(cocuk.bireyselPizza);
		 System.out.println(cocuk.ailePizzasi);
		 
		 AileStaticVariable anne = new  AileStaticVariable();
		
		 anne.ailePizzasi -= 2 ;
		 anne.bireyselPizza -= 2;
		 
		 System.out.println(anne.ailePizzasi);
		 System.out.println(anne.bireyselPizza);
		 
		 AileStaticVariable baba = new  AileStaticVariable();
			
		 baba.ailePizzasi -= 2 ;
		 baba.bireyselPizza -= 2;
		 
		 System.out.println(baba.ailePizzasi);
		 System.out.println(baba.bireyselPizza);
	}

}
