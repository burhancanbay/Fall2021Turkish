package day32_varargs_stringBuilder;

public class C06_StringBuilder {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		String str="Ali Can";
		String str2=new String("Veli Cem");
		
		StringBuilder sb=new StringBuilder("Yasasin Java");

		sb.append("!!!");
		
		System.out.println(sb); // Yasasin Java!!!
		
		sb.toString().toUpperCase();
		
		System.out.println(sb); // Yasasin Java!!! // isin icine string girdigi icin buyuk harf ile yazmaz
		
		String sbBuyukHarf=sb.toString().toUpperCase();
		System.out.println(sbBuyukHarf); // YASASIN JAVA!!!

	}

}
