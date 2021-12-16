package day30_immutableClasses;

public class C02_Immutable {
	
	public static void main(String[] args) {

		@SuppressWarnings("unused")
		String str="Ali";
		
		for (int i = 0; i < 100; i++) {
			
			str+=" ";
		}
		
		// bu kod calistiginda java kac obje olusturur?
		
		// bir obje basta olusturuldu
		// loop'da ise 100 obje daha olusturuldu
		// dolayisiyla bu kod calistiginda biz ekranda hicbir sey gormeyiz ama
		// java 101 obje olusturmus olur
		// str'nin son degeri ise "Ali      (100 tane bosluk)"
	}
}
