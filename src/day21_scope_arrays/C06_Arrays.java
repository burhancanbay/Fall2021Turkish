package day21_scope_arrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {
		//Soru 2: Verilen bir array’in tum elemanlarini toplayan bir program yazalim.

		int arr[]= {3,5,8,65,32,34};
		int toplam=0;
		for (int i = 0; i < arr.length; i++) {
			toplam+=arr[i];
		}
		System.out.println("elemanlarin toplami : "+toplam);
		
		// array'in tum elemanlarini once kucukten buyuge sonra buyukten kucuge yazdirin
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		// buyukten kucuge yazdirmak icin
		// for loop ile elemanlari ters sirada yazdirabiliriz
		
		for (int i = arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		
		int tersArray[]=new int[arr.length];
		System.out.println(Arrays.toString(tersArray));
		System.out.println(" ");
		for (int i = 0; i < tersArray.length; i++) {
			tersArray[i]=arr[arr.length-1-i];
			}
		System.out.println(Arrays.toString(tersArray));
	}

}
