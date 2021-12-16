package day37_inheritance;

public class Corolla extends Toyota {

	String renk;
	int fiyat;
	boolean elektrikliMi;
	int tekerSayisi=4;
	String uretimYeri="Turkiye"; 
	
	public static void main(String[] args) {
		
		           Corolla                   arb1             =             new          Corolla();
		//Class ismi && Data turu          obje ismi      assignment      keyword       Constructor
		   
		           
		// javada obje olusturdugumuz her class ismi ayni zamanda bir data turu'dur
		// bu ornek icin Corolla hem class adi hem de olusturdugumuz arb1 objesinin data type'idir
		// javada obje uretilen herbir class ayni zamanda non-primitive data turu olur
		  
		  System.out.println(arb1.calisiyorMu); // true 
		  System.out.println(arb1.tekerSayisi); // 4
		  System.out.println(arb1.uretimYeri); // Turkiye
		           
		  Toyota   arb2=new Corolla();
		  
		  System.out.println(arb2.calisiyorMu); // true
		  System.out.println(arb2.tekerSayisi); // 0
		  
		  Araba arb3=new Corolla();
		  System.out.println(arb3.calisiyorMu); // true
		  
		  Araba arb4=new Araba();
		  System.out.println(arb4.tekerSayisi); // 0
		 
		  
		  
		
	}

}
