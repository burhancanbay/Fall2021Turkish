package day10_ternary_SwitchCase;



public class C07_SwitchCase {

	public static void main(String[] args) {
		// gun numarasina gore gun isimlerini yazdirin
		
		
		int gunNo=3;
		
		switch(gunNo) {
		case 1 : System.out.println("Pazartesi" );
			break;
		case 2 : System.out.println("Sali");
		    break;
		case 3 : System.out.println("carsamba");
	    	break;
		case 4 : System.out.println("persembe");
	    	break;
		case 5 : System.out.println("cuma");
	    	break;
		case 6 : System.out.println("cumartesi");
	    	break;
		case 7 : System.out.println("pazar");
	    	break;
	    default :
	    	System.out.println("Lutfen gecerli bir gun numarasi giriniz");
		}
	}

}
