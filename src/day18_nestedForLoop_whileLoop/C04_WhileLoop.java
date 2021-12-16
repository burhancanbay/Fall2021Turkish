package day18_nestedForLoop_whileLoop;

import java.util.Scanner;

public class C04_WhileLoop {

	public static void main(String[] args) {
		// // kullanicidan toplanmak uzere sayi isteyin
		// kullanici sifira basincaya kadar sayilari alip toplamaya devam edin
		// kullanici sifira bastiginda o ana kadar kc sayi girdigini ve girilen sayilarin toplamini yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		int sayi=100;
		int toplam=0;
		int sayac=0;
		
		while (sayi!=0) {
			System.out.println("Lutfen toplama eklemek icin bir tamsayi yazin \nbitirmek icin 0'a basin");
			sayi=scan.nextInt();
			toplam+=sayi;
			sayac++;
			
		}
		
		System.out.println("Girdiginiz sayilarin toplami : "+toplam);
		System.out.println("Girdiginiz sayilarin adedi : "+(sayac-1));
		
		scan.close();
	}

}
