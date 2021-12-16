package day32_varargs_stringBuilder;

public class C04_Varargs {

	public static void main(String[] args) {
		
		KafanaGoreIslem(5,10,13,0);
		
		// varargs da hic eleman olmasa da java itiraz etmez once int olan sayilari eslestirir kalan sayilari da varargs'a doldurur
		
		}

		private static void KafanaGoreIslem(int sayi1,int sayi2,int sayi3,int sayi4,int... i) {
		
			int toplam=0;
			for (int each : i) {
				toplam+=each;
			} 
			System.out.println("ilk sayi ile digerlerinin toplaminin carpimi : "+sayi1*toplam);
		

		}

	}


