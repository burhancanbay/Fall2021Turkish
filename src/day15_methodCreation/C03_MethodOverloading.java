package day15_methodCreation;

public class C03_MethodOverloading {

	public static void main(String[] args) {
		
		// java'da ayni isimde birden fazla method olur mu?
		// cevap EVET
		// ayni isimde birden fazla method olursa java hangisini calistiracagina nasil karar verir?
		// cevap : ismi ayni olan methodlarda oncelikle parametre sayisina bakar
		// sonra da parametre sayisi ile arguman sayisi esit olanlardan
		// arguman data turleri ile parametre data turleri arasinda uyuma bakar
		// tamemen uyusan varsa onu kullanir
		// tamamen uyusan yoksa kapsayan var mi bakar ve onu kullanir
		// birden fazla secenek varsa java optimum olani tercih eder
		
	topla(2,4,5,7);
	topla(2,4,8);
	topla(2,4);
	topla(2,4.5);
	topla(2.6,4);
	topla(2.1,4.7);
	
	
	}

	private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
		System.out.println("dort sayinin toplami : "+(sayi1+sayi2+sayi3+sayi4));
		
	}

	private static void topla(int sayi1, int sayi2, int sayi3) {
		System.out.println("uc sayinin toplami : "+(sayi1+sayi2+sayi3));
		
	}

	private static void topla(int sayi1, double sayi2) {
		System.out.println("iki sayinin toplami : "+(sayi1+sayi2));
		
	}
	private static void topla(int sayi1, int sayi2) {
		System.out.println("iki sayinin toplami : "+(sayi1+sayi2));
		
	}
	private static void topla(double sayi1, int sayi2) {
		System.out.println("iki sayinin toplami : "+(sayi1+sayi2));
		
	}
	private static void topla(double sayi1, double sayi2) {
		System.out.println("iki sayinin toplami : "+(sayi1+sayi2));
		
	}
	
}
