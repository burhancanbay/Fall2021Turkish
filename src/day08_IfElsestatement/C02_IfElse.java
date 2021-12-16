package day08_IfElsestatement;

import java.util.Scanner;

public class C02_IfElse {

	public static void main(String[] args) {
		// kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdirin
		Scanner scan=new Scanner(System.in);
		System.out.println("herhangi bir karakter girin");
		char karakter=scan.next().charAt(0);
		
		if ((karakter>='A' && karakter<='Z') || (karakter>='a' && karakter<='z')) {
			System.out.println("girdiginiz :"+karakter+" bir harftir");
		} else {
			System.out.println("girdiginiz :"+karakter+" bir harf degildir");
		}
scan.close();
	}

}
