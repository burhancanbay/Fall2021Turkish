package day12_indexOf;

import java.util.Scanner;

public class C06_Contains {

	public static void main(String[] args) {
		// Soru 1) Kullanicidan email adresini girmesini isteyin, mail @gmail.com icermiyorsa “lutfen gmail adresi giriniz”, 
		//@gmail.com ile bitiyorsa “Email adresiniz kaydedildi “ , @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen mail adresinizi giriniz");
		String mail=scan.nextLine();
		
		String kelime="@gmail.com";
		
		if (mail.contains(kelime)) {
			if (mail.indexOf(kelime)==mail.length()-10) {
				System.out.println("Email adresiniz kaydedildi");
			} else {
				System.out.println("lutfen yazimi kontol edin");
			}
		} else {
            System.out.println("lutfen gmail adresi giriniz");
		}
		scan.close();

	}

}
