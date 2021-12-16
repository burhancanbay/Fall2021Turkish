package day32_varargs_stringBuilder;

public class C02_Varargs {

	public static void main(String[] args) {
		
		topla(5,8,10,13,15,0);
		// varargs list gibi davranir ama array metodlari ile calisir

	}

	private static void topla(int... i) {
	
		int toplam=0;
		for (int each : i) {
			toplam+=each;
		} 
		System.out.println("girilen sayilarin toplami : "+toplam);
	}

}
