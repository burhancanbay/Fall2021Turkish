package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Add {

	public static void main(String[] args) {
		
		List<String>isimler=new ArrayList<>();
		System.out.println("Bos Liste : "+isimler);
		
		isimler.add("Ali");
		System.out.println("Bir eleman : "+isimler);
		
		isimler.add("Veli");
		System.out.println("Iki eleman : "+isimler); // Add method'u listenin sonuna ekleme yapar
		
		isimler.add("Can");
		System.out.println("uc eleman : "+isimler);
		
		isimler.add(1,"Ayse");
		System.out.println("dort eleman : "+isimler); // 1.index'e ekledik
		
		// isimler.add(5); // declare ederken belirttigimiz data turu disinda bir data turunde ekleme yapamayiz
		
		List<String>liste2=new ArrayList<>();
		liste2.add("Gunter");
		liste2.add("Emrah");
		System.out.println("liste 2 : "+liste2);
		
		isimler.addAll(1, liste2);
		System.out.println("Liste 2 yi ekledik : "+isimler);
		
		isimler.addAll(liste2);
		System.out.println("Index olmadan Liste 2 yi tekrar ekledik : "+isimler);
		
		
	}

}
