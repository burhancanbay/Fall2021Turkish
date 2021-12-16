package day23_multiDimensionalArras;

import java.util.Arrays;
import java.util.Scanner;

public class C05_Array {

	public static void main(String[] args) {
		// Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin
		
		  Scanner scan = new Scanner(System.in);
    	  System.out.println("bir cumle giriniz");
    	  String cumle=scan.nextLine();
    	  
    	  String kelimeler[]=cumle.split(" ");
    	  System.out.println(Arrays.toString(kelimeler));
    	 
    	  System.out.println("Cumledeki kelime sayisi : "+kelimeler.length);
    	  
    	  scan.close();
		}
	}


