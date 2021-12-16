package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C04_Ternary {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif” yazdirin, negatifse  sayinin karesini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		System.out.println(sayi>0 ? "Sayi pozitif" : "Sayinin Karesi : "+sayi*sayi);
		
		scan.close();

	}

}
