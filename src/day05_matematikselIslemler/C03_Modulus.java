package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_Modulus {

	public static void main(String[] args) {
		
		// kullanicidan uc basamakli bir sayi alip rakamlar toplamini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen uc basamakli bir sayi girin");
		int sayi=scan.nextInt();
		
		int rakamlarToplami=0;
		
		int rakam=sayi%10;
		System.out.println(sayi);
		
		rakamlarToplami+=rakam;
		System.out.println(rakam);
		
		sayi/=10;
		System.out.println(sayi);
		
		rakam=sayi%10;
		System.out.println(rakam);
		
		rakamlarToplami+=rakam;
		System.out.println(rakamlarToplami);
		
		sayi/=10;
		System.out.println(sayi);
		
		rakamlarToplami+=sayi;
		System.out.println("girdiginiz sayinin rakamlar toplami = "+rakamlarToplami);
		
		scan.close();
	}

}
