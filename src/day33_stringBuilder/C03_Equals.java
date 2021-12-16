package day33_stringBuilder;

public class C03_Equals {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
	
		StringBuilder sb1=new StringBuilder("Java");
		StringBuilder sb2=new StringBuilder("Java");
		
		System.out.println(sb1==sb2); // false
		System.out.println(sb1.equals(sb2)); // false
		// sb'daa equals method'u String'deki mantikla calismaz, == mantigi ile calisir
		
		System.out.println(sb1.compareTo(sb2)); // 0 // ilk harflerden baslayarak sb'leri karsilastirir
		// eger tum karakterler ayni ise sonuc olarak 0 doner. eger farkli karakter bulursa ilk yazilan sb, ikinci yazilandan kac char ondeyse onu doner
		
		// eger iki sb'nin esit olup olmadigini anlamak istersek if (sb1.compareTo(sb2)==0) ile bakabiliriz
		if (sb1.compareTo(sb2)==0) System.out.println(true);
		
		String str="Java";
		// System.out.println(sb1==str); // == sb ile String'i kiyaslayamaz
		System.out.println(sb1.equals(str)); // false
		// System.out.println(sb1.compareTo(str)); // compare String icin kullanilamaz
		
		// System.out.println(sb1=="Java"); // "Java" string oldugu icin yine kullanilmaz
		// System.out.println(sb1.compareTo("Java")); // 
	}

}
