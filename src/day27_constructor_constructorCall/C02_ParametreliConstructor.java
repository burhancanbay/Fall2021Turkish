package day27_constructor_constructorCall;

public class C02_ParametreliConstructor {

	
	public static void main(String[] args) {
		// Java'nin olusturdugu default contructor ile obje olusturamiyoruz
		// ancak her obje icin yeniden deger atamasi yapmak uzun oluyor
		// istersek parametreli constructorlar olusturup
		// daha obje olusturken istedigim ozellikleri atayabilirim
		
		Car1 car1=new Car1(50000,"Vectra","Beyaz",2015,true);
		
		Car1 car2=new Car1(35000);
		System.out.println(car2.km);
		
		Car1 car3=new Car1();
		System.out.println(car3.km);
		
		Car1 car4=new Car1(1000);
		System.out.println(car4.km);
		
		Car1 car5=new Car1(2020,5000);
		System.out.println(car5.yil+" "+car5.km+" "+car5.model);
		
		System.out.println(car1.yil);
		car1.yil=2023;
		System.out.println(car1.yil);
	}

}
