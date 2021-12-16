package day32_varargs_stringBuilder;

public class C05_Varargs {

	public static void main(String[] args) {
		
		topla(5,10,13,0);
		// varargs list gibi davranir ama array metodlari ile calisir
		// varargs dan once fsrkli parametreler kullanilabilir ama varargs'dan sonra parametre yazilamaz
		

	}

	private static void topla(int... i) {
	
		int toplam=0;
		for (int each : i) {
			toplam+=each;
		} 
		System.out.println("girilen sayilarin toplami : "+toplam);
	}

	}


