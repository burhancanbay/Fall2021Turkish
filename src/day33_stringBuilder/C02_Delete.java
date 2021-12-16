package day33_stringBuilder;

public class C02_Delete {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Java candir can");
		
		sb.deleteCharAt(11); // sadece 11.index'deki karakteri siler
		System.out.println(sb);

		sb.delete(11,13); // Java candirn // ilk index inclusive,ikinci index exclusive oldugundan
		System.out.println(sb);
		
		sb.delete(11,sb.length());
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		sb.delete(5,190);
		System.out.println(sb);
		System.out.println(sb.capacity());
	}

}
