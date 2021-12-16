package day10_ternary_SwitchCase;

public class C11_StringManipulationConcat {

	public static void main(String[] args) {
		// String olarak verilen bir degisken + ile baska bir degisken ile isleme sokulursa java bunlari yan yana ekler. buna concatenation denir
		
		String name="Ali";
		String surname="Can";
		
		System.out.println(name+" "+surname); // Ali Can
		
		// ayni islemi + sembolu yerine concat() ile de yapabiliriz
		System.out.println(name.concat(surname));
		System.out.println(name.concat(" ").concat(surname)); // Ali Can
		

	}

}
