package day17_forLoops2;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {
		// Soru 8 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersine ceviren bir method yazin.
		Scanner scan = new Scanner(System.in);
		   System.out.println("lutfen tersten yazdirmak icin bir yazi giriniz...");
		   String str=scan.nextLine();
		   
		   tersineCevir(str);

	       System.out.println(tersineCevir(str));

	
	scan.close();

	
	}

	private static String tersineCevir(String str) {
		String tersStr="";
		
		for (int i = str.length()-1; i >=0; i--) {
			tersStr+=str.substring(i,i+1);
			
		}
		
		return tersStr;
		
	
		
		
	}
}
