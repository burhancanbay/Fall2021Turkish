package day07_ifstatements;

import java.util.Scanner;

public class C01_BasitIfCumleleri {

	public static void main(String[] args) {
		/*
		 * kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun isimlerini yazdirin
		 * 
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen gun isimlerinden birinin ilk harfini yaziniz");
		char ilkHarf=scan.next().toUpperCase().charAt(0);
		
		if (ilkHarf=='P') {
			System.out.println("Pazar,Pazartesi veya Persembe");
			}
		if (ilkHarf=='S') {
            System.out.println("Sali");			
		    }
		if (ilkHarf=='C') {
			System.out.println("Carsamba,Cuma veya Cumartesi");
			}
		if (ilkHarf!='C' && ilkHarf!='P' && ilkHarf!='S') {
			System.out.println("gecersiz bir karakter girdiniz.lutfen gun isimlerinden birinin bas harfini giriniz");
		}
	scan.close();
	}
	

}
