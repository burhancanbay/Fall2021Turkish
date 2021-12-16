package day11_stringManipulations;

public class C04_IndexOf {

	public static void main(String[] args) {
		// parametre olarak girilen bir char veya string'in ilk index'ini verir
		
		String str="Calisirsaniz, java ogrenmek cok kolay";
		System.out.println(str.indexOf('s')); // 4
		System.out.println(str.indexOf("j")); // 14
		
		int index=str.indexOf("r"); // indexOf() method'u her zaman bize int bir deger doner
		System.out.println(index); // 6
		System.out.println(str.indexOf('q')); // -1 
		// Bir String in icinde olmayan bir karakter aradigimizda sonucu  -1 dondurur
		System.out.println(str.indexOf('A')); // -1 // kucuk a olsa bile buyuk A olsa bile case sensitive oldugundan -1 doner
		System.out.println(str.indexOf("java")); // 14 // j harfinin index'ini yazdirir
		System.out.println(str.indexOf('a',11)); // 15 // 11.index'ten sonraki ilk 'a'nin index'ini yazdirir
		System.out.println(str.indexOf("va og")); // 16
		// aradigimiz charSquence anlamli veya anlamsiz bir kelime olabilir
		//bu durumda java aradigimiz CS'i tek bir paket gibi dusunur ve o paketin baslangic index'ini yazdirir
		System.out.println(str.indexOf('e',15)); // 22
		
		
	}

}
