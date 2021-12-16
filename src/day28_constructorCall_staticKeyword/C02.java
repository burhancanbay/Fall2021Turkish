package day28_constructorCall_staticKeyword;

public class C02 {

	int x=5;
	static int y=10;
	
	public static void main(String[] args) {
		// 3 tane obje olusturalim ve degisimleri gozlemleyelim

		C02 obje1=new C02();
		System.out.println("obje1 icin x : "+obje1.x+" obje1 icin y : "+y);
		obje1.x++;
		y++;
		System.out.println("obje1 icin x : "+obje1.x+" obje1 icin y : "+y);
		
		C02 obje2=new C02();
		System.out.println("obje2 icin x : "+obje2.x+" obje2 icin y : "+y);
		obje2.x++;
		y++;
		System.out.println("islemden sonra obje2 icin x : "+obje2.x+" obje2 icin y : "+y);
		System.out.println("obje2'den ve islemden sonra obje1 icin x : "+obje1.x+" obje1 icin y : "+y);
		
		C02 obje3=new C02();
		obje3.x=20;
		y=40;
		System.out.println("obje3'den ve islemden sonra obje1 icin x : "+obje1.x+" obje1 icin y : "+y);
		System.out.println("obje3'den ve islemden sonra obje2 icin x : "+obje2.x+" obje2 icin y : "+y);
		System.out.println("obje3'den ve islemden sonra obje3 icin x : "+obje3.x+" obje3 icin y : "+y);
	}

}
