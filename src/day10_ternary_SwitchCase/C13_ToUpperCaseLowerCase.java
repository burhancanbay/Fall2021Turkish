package day10_ternary_SwitchCase;

import java.util.Locale;

public class C13_ToUpperCaseLowerCase {

	public static void main(String[] args) {
		// verilen stringin tamamini buyuk veya kucuk harfe cevirir
		
		String name="aLI"; // bunu Ali olarak yazdiralim
		System.out.print(name.toUpperCase().charAt(0));
		System.out.print(name.toLowerCase().charAt(1));
		System.out.println(name.toLowerCase().charAt(2));
		
		// turkce lokal harfler kullanarak tamamini turkcedeki kucuk harflere cevirelim
		System.out.println(name.toLowerCase(Locale.forLanguageTag("tr")));
		System.out.println(name.toLowerCase(Locale.FRANCE));

	}

}
