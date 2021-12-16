package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {

	public static void main(String[] args) {
		// Scanner isleminde String icin 2 method vardir
		// scan.next() dedigimizde sadece 1 kelime alir
		// eger kullanicinin daha fazla kelime girmesine izin vermek istiyorsak
		// scan.nextLine() ile birden fazla isim ve soyisim alabiliriz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen Isminizi Giriniz");
		String name=scan.nextLine();
		
		System.out.println("Lutfen Soyisminizi Giriniz");
		String surname=scan.nextLine();
		
		
		System.out.println("Girilen Isim : "+name+" "+surname);
	scan.close();

	}

}
