package day26_forEachLoop_Constractor;

public class Car_Runner {

	public static void main(String[] args) {
		// Car class'indan bir obje olusturalim
		
	    	Car           car1       =       new       Car();
		//class ismi   obje ismi   atama   keyword   Constructor call
		System.out.println(car1.km+" "+car1.model+" "+car1.renk+" "+car1.yil); // 0 null null 2000
		
		// bir obje olusturken eger obje icin kendi class'inda belirlenen degerleri kullanmak istiyorsam 
		// hicbir degeri kendim atamadan obje olusturabilirim
		// bu durumda hic bir parametre kullanilmadigi icin default constructor yeterli olacaktir
		
		// eger obje olusturdugum class'daki degerleri kullanmak yerine kendi degerlerimle bir obje 
		// olusturmak istersem o zaman parametreli constructor olusturmam gerekir
		
		// Car car2=new Car("Kirmizi","Corolla");
        // Car class'inda iki string parametresi olan bir contructor 
	}

}
