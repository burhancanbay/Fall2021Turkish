package day18_nestedForLoop_whileLoop;

import java.util.Scanner;

public class C01_ForLoop {

	public static void main(String[] args) {
		// kullanicidan iki tam sayi isteyin 
		// ilk sayidan baslayarak ikinci sayiya kadar 3'er 3'er yazdirin
		//(ikinci sayi dahil olmak zorunda degil
		
		  Scanner scan = new Scanner(System.in);
	        System.out.println("Lutfen iki tam sayi girin...");
	        int sayi1 = scan.nextInt();
	        int sayi2 = scan.nextInt();
	        
	        if (sayi1>sayi2) {
				for (int i = sayi1; i >= sayi2; i-=3) {
					System.out.print(i+" ");
				}
			} else if (sayi1<sayi2) {
				for (int i = sayi1; i <= sayi2; i+=3) {
					System.out.print(i+" ");
				}
			
			     } else {
				System.out.println("Girilen sayilar esit");

			

			}
scan.close();
	}

}
