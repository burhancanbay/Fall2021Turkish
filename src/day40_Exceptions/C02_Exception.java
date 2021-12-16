package day40_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_Exception {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// kullanicidan istedigi kadar sayi alip bu sayilari toplayan bir program yapiniz
		// sayi girisini bitirmek icin q'ya basiniz
		
		int sayi=0;
		int toplam=0;
		int count=0;
		Scanner scan=new Scanner(System.in);
		// InputMismatchException
		
		try {
			while (count<10000) {
				
				System.out.println("Lutfen toplamak istediginiz sayilari giriniz \nBitirmek icin dijit olmayan bir karakter giriniz");
				sayi=scan.nextInt();
				toplam+=sayi;
				count++;
			}
		} catch (InputMismatchException e) {
			System.out.println("Girdiginiz "+count+" sayinin toplami : "+toplam);
		}
		
		
			
		

	}

}
