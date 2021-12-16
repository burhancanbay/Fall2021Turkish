package day19_whileLoop_doWhileLoop;

public class C04_DoWhileLoop {

	public static void main(String[] args) {
		
		int i=0;
		
		while(i<5) {
			System.out.print(i+" ");
			i++;
		}
		// while loop once kontol eder sonra kodu calistirir
		// loop icinde artis yapilsa da bir sonraki kontrole kadar kod calismaya devam eder
		// bu da bazi durumlarda hatali sonuclara ulasmaniza sebep olabilir
		
		
		// do-while loop once islemi yapar sonra sarti kontrol eder
		// ozellikle kullanicidan deger almalarda do while loop tercih edilir
		
		System.out.println("");
        int a=0;
		do {
			System.out.print(a+" ");
			a++;
		
	} while(a<5);

}
}