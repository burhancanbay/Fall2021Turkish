package day17_forLoops2;

import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {
		// Soru 10 ) Kullanicidan iki sayi isteyin. 
		//Girilen sayilar ve aralarindaki tum tamsayilari toplayip, sonucu yazdiran bir program yaziniz
		
		 Scanner scan = new Scanner(System.in);
		   System.out.println("lutfen iki sayi giriniz...");
		   int num1 = scan.nextInt();
		   int num2 = scan.nextInt();
		   int total=0;
		   
		   if (num1>num2) {
			   for (int i = num2; i <=num1; i++) {
				   total+=i;
			 }
			   System.out.println(total);
		} else {
			 for (int i = num1; i <=num2; i++) {
				   total+=i;
		}
		   
		  System.out.println(total);
			
		}
		   scan.close();
		
	}

}
