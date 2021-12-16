package day12_indexOf;

import java.util.Scanner;

public class C04_LastIndexOf {

	public static void main(String[] args) {
		/*Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
		 - Girilen kelime cumlede kullanilmamis.
		 - Girilen kelime cumlede 1 kere kullanilmis.
		 - Girilen kelime cumlede 1’den fazla kullanilmis.*/
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Lutfen bir cumle giriniz");
			String cumle=scan.nextLine();
			
			System.out.println("Lutfen varligini kontrol etmek icin bir kelime giriniz");
			String kelime=scan.next();
			
			int index1=cumle.indexOf(kelime);
			int index2=cumle.lastIndexOf(kelime);
			
			if (index1<0) {
				System.out.println("Harf cumlede kullanilmamis");
			} else if (index1==index2) {
				System.out.println("Harf cumlede 1 defa kullanilmis");
			} else {
				System.out.println("Harf cumlede 1'den fazla kullanilmis");
			}
			scan.close();
	}

}
