package day25_arrayList;

import java.util.Arrays;
import java.util.List;

public class C04_ArraysAsList {

	public static void main(String[] args) {
		// verilen array'i Arrays class'indan yardim alarak liste cevirelim
		
		String arr[]= {"A","b","c","d"};
		
		List<String>arraydenList=Arrays.asList(arr);
		System.out.println(arraydenList);
		
		//arraydenList.add("F"); // RTE : UnsupportedOperationException : Desteklenmeyen islem
		// bu sekilde Arrays class'indan yardim alarak array'i list'e cevirirsek olusturdugumuz list'in boyutu sabit olur
		// dolayisiyla add() veya clear() gibi method'lari calistirmak istersek RTE hatasi aliriz
		
		arr[1]="Z";
		System.out.println("Array'i deistirdikten sonra, array = "+Arrays.toString(arr));
		System.out.println("Array'i deistirdikten sonra, list = "+arraydenList);
		
		arraydenList.set(3,"D");
		System.out.println("List'i deistirdikten sonra, list = "+arraydenList);
		System.out.println("List'i deistirdikten sonra, array = "+Arrays.toString(arr));		
		                       
		

	}

}
