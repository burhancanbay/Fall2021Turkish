package day10_ternary_SwitchCase;

public class C12_StringManipulationCharAt {

	public static void main(String[] args) {
		// charAt(istenenIndex) method'u istedigimiz index'deki karakteri bize verir
		
		String kurs="Techproeducation";
		System.out.println(kurs.charAt(5)); // r
		System.out.println(kurs.charAt(0)); // ilk harfi verir
		System.out.println(kurs.charAt(16));// kelime 16 karakterden olusuyor ama index sifir ile basladigi icin hata verir
		System.out.println(kurs.charAt(15));// son harfi verir
	}

}
