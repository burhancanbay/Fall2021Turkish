package day33_stringBuilder;

public class C06_SubSquence {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Java ne kadar kolay");
		
		System.err.println(sb.substring(14)); // kolay
		System.err.println(sb.subSequence(14,19)); // kolay
		
		// ikisi de ayni sonucu dondurur ancak substring() String class'indan geldigi icin substring kullandigimda arkasindan String method'larini kullabilirim
		// ancak subSequence kullandigimda bu mumkun olmaz
		
		
	}

}
