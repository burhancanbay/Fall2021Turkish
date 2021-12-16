package day14_metodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		// Kullanicidan iki sayi isteyin
		// sayilarin karelerini ve kuplerini toplayip yazdiran iki ayri method yazin
		// kullaniciya us sorun
		// 2 yazarsa kareleri toplamini yapan method 3 yazarsa kupler toplamini yapan method calissin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen iki sayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		System.out.println("Girilen sayilarin kareleri toplamini istiyorsaniz 2 "+"\nkupler toplamini istiyorsaniz 3'e basiniz");
		int us=scan.nextInt();
		
		
		
		
		if (us==2) {
			kareToplam(sayi1,sayi2);
		} else if (us==3) {
			kupToplam(sayi1,sayi2);
		     } else {
               System.out.println("Lutfen us sayisi icin 2 veya 3'den birini giriniz");
	              }
		
		scan.close();
		
	}

	public static void kupToplam(int sayi1, int sayi2) {
		
		System.out.println("sayilarin kuplerinin toplami : "+(sayi1*sayi1*sayi1+sayi2*sayi2*sayi2));
		
	}

	public static void kareToplam(int sayi1, int sayi2) {

		System.out.println("sayilarin karelerinin toplami : "+(sayi1*sayi1+sayi2*sayi2));

		
	}

	}


