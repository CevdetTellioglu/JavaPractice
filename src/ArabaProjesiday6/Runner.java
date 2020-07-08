package ArabaProjesiday6;

public class Runner {

	public static void main(String[] args) {
		
		// 				 reference type	           object type
		//polymorphisme : Car    araba1   =   new   Toyota();
		
		
		Car araba1 = new Honda(); // Car class i reference oluyor
		System.out.println("Araba markasi : "+araba1.arabaMarkasi());
		System.out.println("Araba modeli : "+araba1.arabaModeli());
		System.out.println("Araba yili : "+ araba1.arabaYili());
		
		Car araba2 = new Honda("Jazz",2020);
		System.out.println("Araba markasi : "+araba2.arabaMarkasi());
		System.out.println("Araba modeli : "+araba2.arabaModeli());
		System.out.println("Araba yili : "+ araba2.arabaYili());
	
		
		Car araba3 = new Tesla();
		System.out.println(araba3.arabaMarkasi());
		
	   ;
	}

}
