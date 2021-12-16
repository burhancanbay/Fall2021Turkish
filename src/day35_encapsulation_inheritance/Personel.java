package day35_encapsulation_inheritance;

public class Personel {
	
	protected String isim;
	protected String soyisim;
	protected boolean calisiyorMu;
	protected String telNo;
	protected int yas;
	Personel(){
		System.out.println("Personel parametresiz constructor calisti");
	}
	
	// eger variable'lara access modifier yazmazsak Java access modifier olarak default ac.mo. atar
	// boyle olursa sadece o package altindaki child class'lar personel class'ini inherit edebilir
	// baska package'lardaki child class'larin da personel'i inherit edebilmesi icin variable ve method'larin access modifier'larini protected yapariz
    //public yapsak da inherit edilebilir ama biz herkesin erismesini degil sadece child clas'larin erismesini istedigimizden protected tercih ederiz

	public static void main(String[] args) {
		
		

	}

}
