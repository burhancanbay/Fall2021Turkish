package day28_constructorCall_staticKeyword;

public class C03 {

	// Java run time bir programdir
	// run tusuna basildiginda calismaya baslar ve islemeleri yapar
	// java'nin calismasi bittiginde hersey basa doner
	
	// static variable ve method'lar bulunduklari class'lar ile ilintilidir(obje degil class)
	// baska bir class'da iken C02'deki static variable veya method'a ulasmak istedigimizde 
	// C02.staticVariableIsmi ve C02.StaticMethodIsmi() yazmamiz yeterli olur
	
	public static void main(String[] args) {
		C02 obje1=new C02();
		System.out.println("obje1 icin x : "+obje1.x+" obje1 icin y : "+C02.y);
		obje1.x++;
		C02.y++;
		// static bir variable'a class ismi uzerinden ulasmak yerine instance variable'lar gibi obje ile ulasmaya calisirsaniz
		// Java CTE verrmez ama solda ! isareti ile bizi uyarir "static bir field olan C02.y'ye static yoldan ulas der
		System.out.println("obje1 icin x : "+obje1.x+" obje1 icin y : "+C02.y);
		
		C02 obje2=new C02();
		System.out.println("obje2 icin x : "+obje2.x+" obje2 icin y : "+C02.y);
		obje2.x++;
		C02.y++;
		System.out.println("islemden sonra obje2 icin x : "+obje2.x+" obje2 icin y : "+C02.y);
		System.out.println("obje2'den ve islemden sonra obje1 icin x : "+obje1.x+" obje1 icin y : "+C02.y);
		
		C02 obje3=new C02();
		obje3.x=20;
		C02.y=40;
		System.out.println("obje3'den ve islemden sonra obje1 icin x : "+obje1.x+" obje1 icin y : "+C02.y);
		System.out.println("obje3'den ve islemden sonra obje2 icin x : "+obje2.x+" obje2 icin y : "+C02.y);
		System.out.println("obje3'den ve islemden sonra obje3 icin x : "+obje3.x+" obje3 icin y : "+C02.y);

	}

}
