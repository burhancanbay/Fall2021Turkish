package day05_matematikselIslemler;

import java.util.Scanner;

public class C05_Modulus {

	public static void main(String[] args) {
		// kullanicidan 6 basamakli bir sayi alin ve rakamlar toplamini yazdirin


		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen alti basamakli bir sayi girin");
		int sayi=scan.nextInt();
		
        int rakamlarToplami=0;
	    int rakam=sayi%10;
	    rakamlarToplami+=rakam;
	    sayi/=10;
	    
	    rakam=sayi%10;
	    rakamlarToplami+=rakam;
	    sayi/=10;
	    
	    rakam=sayi%10;
	    rakamlarToplami+=rakam;
	    sayi/=10;
	    
	    rakam=sayi%10;
	    rakamlarToplami+=rakam;
	    sayi/=10;
	    
	    rakam=sayi%10;
	    rakamlarToplami+=rakam;
	    sayi/=10;
	    
	    rakam=sayi%10;
	    rakamlarToplami+=rakam;
	    
	    
	    
	    System.out.println(rakamlarToplami);
	    
	    scan.close();
	}

}
