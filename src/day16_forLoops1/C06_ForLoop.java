package day16_forLoops1;

import java.util.Scanner;

public class C06_ForLoop {

	public static void main(String[] args) {
		// Soru 5) Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar 3’un veya 5�?in kati olan sayilari yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen 100'den kucuk bir sayi giriniz : ");
		double num=scan.nextDouble();
		int sayi=(int)num;
		
		if (num<0) {
			System.out.println("negatif sayi giremezsiniz");
		} else if (sayi!=num) {
			System.out.println("Lutfen tam sayi giriniz");
		} else if (num>100) {
			System.out.println("100 den buyuk sayi giremezsiniz");
		} else {
			    for (int i = 1; i <= num ; i++) {
				if (i%3==0 || i%5==0) {
					System.out.print(i+" ");
			    	} 
				}
		
	}
scan.close();
	}
	
}
