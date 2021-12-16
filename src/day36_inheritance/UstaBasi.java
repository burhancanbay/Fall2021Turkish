package day36_inheritance;

import day35_encapsulation_inheritance.Isci;

public class UstaBasi extends Isci{
	UstaBasi(){
		System.out.println("Ustabasi parametresiz constructor calisti");
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		UstaBasi ust1=new UstaBasi();
		
		// javada her class olustruldugunda otomatik olarak default constructor olustugu gibi 
		// child class'da olusturulan herbir constructor'in ilk satirinda gizli super() olusturur
		

	}

}
