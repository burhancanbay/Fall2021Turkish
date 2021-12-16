package day29_staticBlok_passByValue;

import java.util.Arrays;

public class C05_PassByValueArray {

	public static void main(String[] args) {
		
		int sayilar[]= {3,4,5,6};
		
		elemanDegistir(sayilar);
		System.out.println("eleman degistir method'undan sonra : "+Arrays.toString(sayilar));

		arrayiDegistir(sayilar);
		System.out.println("array'i degistir method'undan sonra : "+Arrays.toString(sayilar));
	}

	private static void arrayiDegistir(int[] sayilar) {
		
		sayilar=new int[6];
		System.out.println("array'i degistir method'unda : "+Arrays.toString(sayilar));
		
	}

	private static void elemanDegistir(int[] sayilar) {
		
		sayilar[0]=10;
		System.out.println("eleman degistir method'unda : "+Arrays.toString(sayilar));
		
	}

}
