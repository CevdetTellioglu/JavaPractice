package ArabaProjesiday6;

public class Car {
	
	/* Bir class olusturunuz adi Car olsun
    icerisinde 3 instance variable olsun 
    protected String make = ;
    protected String model = ;
    protected int year = ;
    //Sonra 3 tane String return tipinden method olusturunuz
    arabaMarkasi
    arabaModeli
    arabaYili
    Son olarak bir oject olusturup method lari main method da print ediniz 
	 */
	protected String make ;
    protected String model ;
 	protected int year ;
 	
 	
 	public Car() {
 		
 	}
	
 	public Car(String model, int year) {
 		this.model=model;
 		this.year=year;
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
