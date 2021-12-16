package day15_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		//Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun. Kullanici 2,3 veya 4 degerini girerse, 
		//kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdirin. 
		//Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse “Cok sayi girdiniz, ben toplayamam” yazdirin.

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen toplamak istediginiz sayi adedini 2,3 veya 4'den biri olarak seciniz ");
		int tercih=scan.nextInt();
		if (tercih>4) {
			tercih=5;
		}
		
		switch(tercih) {
		case 2:
			ikisayitopla();
			break;
		case 3:
			ucsayitopla();
			break;
		case 4:
			dortsayitopla();
			break;
		case 5:
			System.out.println("cok sayi girdiniz, ben toplayamam");
			break;
		default :
			System.out.println("gecersiz tercih");
		}
		
		scan.close();
	}

	private static void dortsayitopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen dort sayi giriniz \nHer sayidan sonra enter'a basiniz");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
		double sayi4=scan.nextDouble();
	
		System.out.println("Girdiginiz dort sayinin toplami : "+(sayi1+sayi2+sayi3+sayi4));
		scan.close();
		
	}

	private static void ucsayitopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen uc sayi giriniz \nHer sayidan sonra enter'a basiniz");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
	
		System.out.println("Girdiginiz uc sayinin toplami : "+(sayi1+sayi2+sayi3));
		scan.close();
		
	}

	private static void ikisayitopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen iki sayi giriniz \nHer sayidan sonra enter'a basiniz");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
	
		System.out.println("Girdiginiz iki sayinin toplami : "+(sayi1+sayi2));
		scan.close();
		
	}

}
