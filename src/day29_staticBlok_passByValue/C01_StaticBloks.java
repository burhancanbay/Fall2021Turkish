package day29_staticBlok_passByValue;

public class C01_StaticBloks {
	
	static {
		System.out.println("static blok main method'dan bile once calisir");
	}

	public static void main(String[] args) {
		System.out.println("Javada once main method calisir");

	}
	
	static {
		System.out.println("static blok nereye yazilirsa yazilsin  main method'dan bile once calisir");
	}

}
