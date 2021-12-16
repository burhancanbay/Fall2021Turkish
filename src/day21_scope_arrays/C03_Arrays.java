package day21_scope_arrays;

public class C03_Arrays {

	public static void main(String[] args) {
		
		//soru 1-Elemanlari â€œAliâ€? , Veliâ€?, Ayseâ€? ve Fatmaâ€? olan bir array olusturun bunu yapmiyor muyuz
		
		String arr[]=new String[4];
		arr[0]="Ali";
		arr[1]="Veli";
		arr[2]="Ayse";
		arr[3]="Fatma";
		
		String[] arr2= {"Ali","Veli","Ayse","Fatma"};
		
		//Soru 2: Soru 1â€™deki elemanlardan â€œAliâ€? yerine â€œCanâ€?, â€œAyseâ€? yerine â€œGulâ€? atayin
		
		arr2[0]="Can";
		arr2[2]="Gul";
		
		System.out.println(arr2[1]);
		System.out.println(arr[arr.length-1]);// son elementi yazdirir
		
	}

}
