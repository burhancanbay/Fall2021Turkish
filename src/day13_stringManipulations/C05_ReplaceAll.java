package day13_stringManipulations;

public class C05_ReplaceAll {

	public static void main(String[] args) {
		
		String cumle="Java    cok          zevkli";
		
		cumle=cumle.replaceAll("\\s+"," "); //Java cok zevkli
		System.out.println(cumle);
		
	    System.out.println(cumle.replaceAll("[a-z]","")); // kucuk harfleri boslukla degistirir
		
		System.out.println(cumle.replaceAll("\\S","*")); // bosluk olmayan butun karakterleri *'a cevirir
		System.out.println(cumle.replaceAll("\\s","*")); // bosluklari *'a cevirir
		
	}

}
