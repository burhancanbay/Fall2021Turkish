package day34_accessDeneme;

import day34_accessModifier_encapsulation.C01;

public class C02_BaskaPackageChildClass extends C01{

	public static void main(String[] args) {
		
		C01 obj=new C01();
		//System.out.println(obj.sayiPrivate);
		//System.out.println(obj.sayiDefault);
		//System.out.println(sayiProtected); // main method'dan ulasmamizin nedeni variable'in static olmamasi 
	    System.out.println(obj.sayiPublic);
	  //  sayiProtected=60;
	    
	  
	    }
	  public void staticOlmayanMethod() {
	    	C01 obj=new C01();
			//System.out.println(obj.sayiPrivate);
		//	System.out.println(obj.sayiDefault);
			System.out.println(sayiProtected);// bu class'da sayiProtected diye bir variable olmadigi halde, parent class'da var oldugu icin java promlem etmedi
		    System.out.println(obj.sayiPublic);
		    sayiProtected=60;
	}

}
