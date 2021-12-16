package day10_ternary_SwitchCase;


public class C06_NestedTernary {

	public static void main(String[] args) {
		// veilen karakteri inceleyin kucuk harf ise consola “Kucuk Harf” , buyuk harfse
		// consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil” yazdirin.

		
		char harf='2';
		System.out.println((harf>='a' && harf<='z') ? "Kucuk harf" : ((harf>='A' && harf<='Z') ? "Buyuk Harf" : " Girdiginiz karakter harf degil"));
		
	}

}
