package day26_forEachLoop_Constractor;

public class Car {
	// Java biz bir class olusturdugumuzda, o class'dan obje olusturacagimizi bilir
	// ve her class'a default bir constructor yerlestirir
	// Java'nin class'a koydugu bu default constructor gorulmez
	// ama obje uretmek uzere kod yazdigimizda otomatik olarak devreye girer
	
	// bir constructor olusturmak cok kolaydir
	// method'a benzer ama method'dan farklidir
	// 1-Constructor ismi class ismi ile ayni olmalidir
	// class isimleri buyuk harfle basladigi icin Constructor ismi de buyuk harfle baslar
	// (method'dan 1.farki budur, method'lar kucuk harfle baslar)
	// 2-Constructor'larin return type'i olmaz
	// (metod'dan 2.farki budur, method'larin mutlaka return type'i olmalidir
	public Car() {
       }
	public int yil=2000;
	String renk;
	String model;
	int km;
	boolean satilikMi;
   
	// bugun itibariyle cass'larda main method olma mecburiyeti kaldirilmistir :)
	// ancak bildigimiz gibi main method olmayan bir class direkt calistirilamaz
	// main method'i olmayan class'lar baska class'lardan obje olusturularak kullanilmak uzere
	// ihtiyac duyulan variable ve method'lari sakladigimiz bir depo gibidir
}  
