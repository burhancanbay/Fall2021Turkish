package day07_ifstatements;

import java.util.Scanner;

public class C02_BasitIfCumleleri {

	public static void main(String[] args) {


		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir tam sayi giriniz");
		int sayi=scan.nextInt();
		
		if (sayi%2==0) {
			System.out.println("girdiginiz sayi cift bir sayidir ");
		}
        if (sayi%2==1) {
			System.out.println("girdiginiz sayi tek bir sayidir");
		}
        scan.close();
	}

}
