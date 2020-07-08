package ArabaProjesiday6;

public class Tesla extends Car {
	/* Bir class olusturunuz adi Honda olsun
	    icerisinde 3 instance variable olsun 
	    protected String make = "Toyota";
	    protected String model = "Corolla";
	    protected int year = 2009;
	    //Sonra 3 tane String return tipinden method olusturunuz
	    arabaMarkasi
	    arabaModeli
	    arabaYili
	    Son olarak bir oject olusturup method lari main method da print ediniz 
		 */
		protected String make = "Tesla";
	    protected String model = "Model 3";
	 	protected int year = 2009;
	 	
	 	public Tesla() {
	 		
	 	}
		
	 	public Tesla(String model, int year) {
	 		this.model=model;
	 		this.year=year;
	 	}
	 	
	 	public static void main(String[] args) {
			
	 		 Tesla newTesla = new Tesla();
	 		 System.out.println("Arabanin markasi : "+newTesla.arabaMarkasi());
	 		 System.out.println("Arabanin modeli : "+ newTesla.arabaModeli());
	 		 System.out.println("Arabanin yili : "+ newTesla.arabaYili());
	 		 
	 		 
	 		 Tesla Tesla1 = new Tesla("Model s",2020);
	 	
			 System.out.println("Arabanin modeli : "+ Tesla1.arabaModeli());
			 System.out.println("Arabanin yili : "+ Tesla1.arabaYili());
		}

		
		  public String arabaMarkasi() {
		        
		        return make;
		    }
		    
		  public String arabaModeli() {
		        
		        return model;
		    }
		    
		   public int arabaYili() {
		        
		        return year; 
		    }



}
