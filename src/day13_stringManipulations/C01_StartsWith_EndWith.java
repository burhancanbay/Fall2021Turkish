package day13_stringManipulations;

import java.util.Scanner;

public class C01_StartsWith_EndWith {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve bir kelime alin
		// veerilen cumlenin verilen kelime ile baslayip baslamadigini ve bitip bitmedigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine();
		
		System.out.println("Lutfen bir kelime giriniz");
        String kelime=scan.next();
        
        if (cumle.startsWith(kelime)) {
			System.out.println("Girilen Cumle "+kelime+" ile basliyor");
		} else {
			System.out.println("Girilen Cumle "+kelime+" ile baslamiyor");
		}
        if (cumle.endsWith(kelime)) {
			System.out.println("Girilen Cumle "+kelime+" ile bitiyor");
		} else {
			System.out.println("Girilen Cumle "+kelime+" ile bitmiyor");
		}
        
        
      
        scan.close();
	}

}
