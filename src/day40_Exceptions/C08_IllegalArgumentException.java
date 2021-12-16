package day40_Exceptions;

import java.util.Scanner;

public class C08_IllegalArgumentException {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Soru: kullanicidan yasini girmesini isteyin
		// kodunnuzu kullanici sifirdan kucuk bir sayi girerse Exception verecek sekilde yazin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen konsolda gormek icin yasinizi giriniz");
		int yas=scan.nextInt();
		try {
			if (yas<0) {
				throw new IllegalArgumentException();
			} else {
				System.out.println(yas);
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			System.out.println("Yas sifirdan kucuk olamaz");
		}
	}

}
