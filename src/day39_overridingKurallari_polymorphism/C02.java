package day39_overridingKurallari_polymorphism;

public class C02 extends C01{

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		C02 obj1=new C02();
		obj1.privateMethod();
		obj1.staticMethod();
		
		C01 obj2=new C02();
		// obj2.privateMethod();// data turu C01 oldugundan C01 class'ina gideriz ama private oldugu icin C01 class'ina ulsamayiz
		// dolayisiyla override yapamayiz
		obj2.staticMethod();
		// static method'lar override edilemez
		
	}
	public static void staticMethod() {
		System.out.println("Child class static method calisti");
	}
	private void privateMethod() {
		System.out.println("Child class private method calisti");	
	}
	/*
	public final void finalMethod() {
		System.out.println("Parent class final method calisti");
}
*/
}
