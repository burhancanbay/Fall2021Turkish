package day12_indexOf;

import java.util.Scanner;

public class C07_Contans {

	public static void main(String[] args) {
		//Soru 2) Kullanicidan bir cumle isteyin. Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak, 
		//“kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin, iki kelimeyi de icermiyorsa 
		//“Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine();
		
		if (cumle.toLowerCase().contains("buyuk")) {
			if (cumle.toLowerCase().contains("kucuk")) {
				System.out.println("kucuk mu buyuk mu karar ver");
			} else {
				System.out.println(cumle.toUpperCase());
			}
		} else if (cumle.toLowerCase().contains("kucuk")) {
			System.out.println(cumle.toLowerCase());
		     } else {
System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
	

		}
		scan.close();
	}

}
