package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C01_Ternary {

	public static void main(String[] args) {
		// Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi1=scan.nextInt();
		System.out.println("Lutfen ikinci bir sayi giriniz");
		int sayi2=scan.nextInt();
		
		System.out.println(sayi1>sayi2 ? sayi2 : sayi1);
		
		scan.close();
	}

}
