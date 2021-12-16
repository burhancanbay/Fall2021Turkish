package day19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {
		// Soru 7 ) Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini
		// yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen rakamlar toplamini bulmak icin pozitif bir tam sayi giriniz");
		int sayi = scan.nextInt();
		int rakamlarToplami = 0;
		int rakam = 0;

		String sayiStr = "" + sayi;
		// int olarak verilen bir sayinin basamak sayisini bulmak icin kisa yoldan o sayiyi String'e cevirip, str.length() method'unu kullanabiliriz

		for (int i = 1; i <= sayiStr.length(); i++) {
			rakam = sayi % 10;
			rakamlarToplami += rakam;
			sayi /= 10;

		}
		System.out.println("Girdiginiz sayinin rakamlar toplami : " + rakamlarToplami);
		scan.close();
	}

}
