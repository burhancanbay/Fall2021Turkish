package day17_forLoops2;

public class C08_OdevNestedForLoop {

	public static void main(String[] args) {
		
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
