package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C03_Ternary {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		System.out.println(sayi>=0 ? "mutlak degeri : "+sayi :  "mutlak degeri : "+-sayi);
		
		scan.close();
	}

}
