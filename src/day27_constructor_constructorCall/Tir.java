package day27_constructor_constructorCall;

public class Tir {

	
		
	
	
		public int yil=2000;
		String renk;
		String model;
		int km;
		boolean satilikMi;

		public Tir(int i, String string, String string2, int j, boolean b) {
			// Tir Runner class'indan yolladigimiz degerlerin instance variable'lar ile eslesmesi icin atamalari yapmamiz lazim
			km=i;
			model=string;
			renk=string2;
			yil=j;
			satilikMi=b;

}

		public Tir(int km, String model, String renk) {
			// i,string ve string2 isim olarak anlamli degil
			// int km,String model,String renk
			
			this.km=km;
			this.model=model;
			this.renk=renk;
			// basina this. yazdigimizda Java bu variable'in class level'deki variable'lar oldugunu anlar
		}		
}