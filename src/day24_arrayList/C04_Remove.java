package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {

	public static void main(String[] args) {


		List<String>harfler=new ArrayList<>();
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");
		
		System.out.println(harfler); // [A, Z, F, D]
		System.out.println(harfler.remove(1)); // Z'yi listeden cikarir ve Z'yi yazdirir(syso dedigimiz icin)
		System.out.println(harfler); // [A, F, D] listenin kalanini yazdirir
		
		System.out.println(harfler.remove(2)); // D
		System.out.println(harfler); // [A, F]
		
		
		System.out.println(harfler.remove("F")); // true yazdirir
		System.out.println(harfler); // [A]

		System.out.println(harfler.remove("B")); // false yazdirir

		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		System.out.println(harfler);
		
		System.out.println(harfler.removeAll(harfler)); // verilen bir listeyi tamamen siler
		System.out.println(harfler);
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");
		
		List<String>silinecekHarfler=new ArrayList<>();
		silinecekHarfler.add("A");
		silinecekHarfler.add("C");
		silinecekHarfler.add("F");
		
		System.out.println(harfler); // [A, Z, F, D]
		System.out.println(silinecekHarfler); // [A, C, F]
		System.out.println(harfler.removeAll(silinecekHarfler)); // true
		
		System.out.println(harfler); // [Z, D]
		System.out.println(silinecekHarfler); // [A, C, F]
		
		// eger listemiz integer'lardan olusuyorsa 
		// Java remove(index) ve remove(object) method'lari karismasin diye girilen sayiyi index olarak kabul eder
		
	}

}
