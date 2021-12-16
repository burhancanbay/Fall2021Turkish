package day21_scope_arrays;

public class C01_LocalVariables {

	public static void main(String[] args) {
		
		int sayi=0;// sayiya deger atamazsak java CTE hatasi verir/
		System.out.println(sayi);
		
		//int sayi;// bir local'de ayni isimde birden fazla variable olusturulamaz
		//String sayi;// data turu fakli olsa bile java buna izin vermez
		@SuppressWarnings("unused")
		String isim="Ali";
		
	}

	public static void staticMethod() {
		//sayi;// farkli lokalde olusturulan variable (method'larin static olup olmamasina bagli olmaksizin) farkli local'de kullanilamaz
	@SuppressWarnings("unused")
	String isim="Veli";
	@SuppressWarnings("unused")
	int sayi;
	}
}
