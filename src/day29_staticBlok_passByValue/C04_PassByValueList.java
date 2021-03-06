package day29_staticBlok_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {

	public static void main(String[] args) {
		// bir list olusturalim
		// sonra list elemanlarini degistir method'u yazip orada list elemanlarindan bazilarini degistirelim
		// method void olsun
		// main method'a dondukten sonra yeniden list'i yazdiralim
		
		List<String>harfler=new ArrayList<>();
		harfler.add("A");
		harfler.add("B");
		harfler.add("C");
		
		// Javada list ve array gibi objeler icin de pass by value gecerlidir
		// yani farkli bir method'da array veya list'e yeni deger atamasi yaparsaniz orijinal array veya list degismez
		
		listElemanlarDegistir(harfler);
		System.out.println("main method'da donunce list : "+harfler); // [D, B, C]
		
		listDegistir(harfler);
		System.out.println("list'e yeni list atadiktan sonra main method'da donunce list : "+harfler);

	}

	private static void listDegistir(List<String> harfler) {
		
		harfler=new ArrayList<>();
		System.out.println("list'e yeni deger atayinca list : "+harfler);
		
	}

	private static void listElemanlarDegistir(List<String> harfler) {
		
		harfler.set(0,"D");
		System.out.println("method'da degistirdigimiz list : "+harfler); // [D, B, C]
		
	}

}
