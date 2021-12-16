package day32_varargs_stringBuilder;

public class C03_Varargs {

	public static void main(String[] args) {
		
		KafanaGoretopla(5,8,10,13,15,0);
		
	}

	private static void KafanaGoretopla(int sayi1,int... i) {
	
		int toplam=0;
		for (int each : i) {
			toplam+=each;
		} 
		System.out.println("ilk sayi ile digerlerinin toplaminin carpimi : "+sayi1*toplam);
	

	}

}
