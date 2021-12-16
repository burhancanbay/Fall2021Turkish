package day05_matematikselIslemler;

import java.util.Scanner;

public class C04_Modulus {

	public static void main(String[] args) {
		//kullanicidan dort basamakli bir sayi alip rakamlar toplamini yazdirin

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen dort basamakli bir sayi girin");
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
	    
	    
	    System.out.println(rakamlarToplami);
	    
	    scan.close();
	}

}
