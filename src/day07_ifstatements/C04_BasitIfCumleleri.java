package day07_ifstatements;

import java.util.Scanner;

public class C04_BasitIfCumleleri {

	public static void main(String[] args) {
		
		// kullanicidan dikdortgenin kenar uzunluklarini isteyin ve kare olup olmadigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("dikdortgenin kisa kenarini girin");
		double kenar1=scan.nextDouble();
		System.out.println("dikdortgenin uzun kenarini girin");
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("girilen dikdortgen karedir");
		}
		if (kenar1!=kenar2) {
			System.out.println("girilen dikdortgen kare degildir");
		}
		scan.close();
	}

}
