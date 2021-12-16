package day05_matematikselIslemler;

public class C01_MatematikselIslemler {

	public static void main(String[] args) {
		
		System.out.println(4*(2+5)/2);
		System.out.println(4*(2+5)/3);
		
		double sonuc = (double)(4*(2+5)/3); // 9.0
        System.out.println(sonuc);
		
        double sonuc1 =4*(2+5)/(double)3; // 9.333333
        System.out.println(sonuc1);
        
        
		sonuc=(double)(4*(2+5)/3);
		System.out.println(sonuc); // 9.0
		
		sonuc=(double)4*(2+5)/3;
		System.out.println(sonuc); // 9.3333333
		
		int sayi1=5;
		int sayi2=2;
		double sayi3=2;
		System.out.println(sayi1/sayi2); // 5/2=2
		System.out.println(sayi1/sayi3); // 5/2=2.5
		System.out.println(sayi1+sayi3/sayi2); // 5+1=6
	}

}
