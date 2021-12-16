package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {

	public static void main(String[] args) {
		// kullanicidan isim ve soyismini ayri ayri isteyip girilen ismi asagidaki gibi yazdiriniz
		// Girilen Isim : Burhan Canbay

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen Isminizi Giriniz");
		String name=scan.next();
		
		System.out.println("Lutfen Soyisminizi Giriniz");
		String surname=scan.next();
		
		System.out.println("Girilen Isim : "+name+" "+surname);
	scan.close();
	}

}
