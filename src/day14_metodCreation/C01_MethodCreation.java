package day14_metodCreation;

public class C01_MethodCreation {

	public static void main(String[] args) {
		// verilen iki sayinin toplamini ve carpimini yapip yazdiran iki ayri method olusturun
		// method olusturmak icin 4 adim takip edelim
		// 1.adim method call yazalim
		// 2.adim method'a arguman yazacakmiyiz karar vermeliyiz
		
		int sayi1=4;
		int sayi2=5;
		
		toplama(sayi1,sayi2);
		// toplama(sayi1,sayi2); // method call	
		// 3.adim 1. ve 2.adimi yaptiktan sonra javadan yardim alip methodu olustururuz
		
		carpma(sayi1,sayi2);
	}

	public static void carpma(int sayi1, int sayi2) {
		System.out.println("sayilarin carpimi : "+sayi1*sayi2);
		
	}

	public static void toplama(int sayi3, int sayi4) { // sayi1 ve sayi2 de kalabilirdi degistirdigimizde de kod calisir java degerlere bakar
		// 4.adim erisim duzenleyici ve return type'a karar vermeliyiz
		// erisim duzenleyici access modofier : public yaptik
		// return type : bizden sadece yazdirma istedigi icin void kalabilir
		
		System.out.println("sayilarin toplami : "+(sayi3+sayi4));
		
	}

}
