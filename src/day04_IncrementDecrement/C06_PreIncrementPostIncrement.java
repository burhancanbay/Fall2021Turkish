package day04_IncrementDecrement;

public class C06_PreIncrementPostIncrement {

	public static void main(String[] args) {


		int sayi=10;
		sayi++;
		sayi++;
		sayi++;
		
		System.out.println(sayi); // 13 bu satirda sadece yazdirma var
		System.out.println(sayi++);// 13 bu satirda iki islem var bir yazdirma bir de artirma
		System.out.println(sayi);// 14
		
		System.out.println(++sayi); // eger once artirip sonra yazdirmak istiyorsak ++'i sayinin onune koymaliyiz 

		
	}

}
