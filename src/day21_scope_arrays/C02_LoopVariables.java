package day21_scope_arrays;

public class C02_LoopVariables {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int sayi=10;
		
		for (int i = 0; i < 6; i++) {
			String isim="Ali";
			System.out.println(sayi+" "+isim);
		}

		for (int i = 0; i < 10; i++) {
			String isim="veli";
		}
	}

}
