package day04_IncrementDecrement;

public class C04_ExplicitNarrowing {

	public static void main(String[] args) {


		int sayi1=300;
		short sayi2=(short) sayi1;// hatayi gidermek icin buyuk data tipindeki degerin onune manuel onayimizi gosteren (short) yazilir
		System.out.println("sayi2 : "+sayi2);
		
		byte sayi3=(byte) sayi2;
		System.out.println("sayi3 : "+sayi3);// deger byte'in sinirlarindan buyuk oldugu icin java int 300'u kendi yonyemine gore 44'e donusturur
		
		double sayi4=87.3;
		int sayi5=(int) sayi4;
		System.out.println("sayi5 : "+sayi5);// deger virgullu oldugu icin int'da ondalikli kisim olmadigindan java ondalikli kismi atar
		
		int sayi6=27;
		int sayi7=4;
		System.out.println(sayi6/sayi7);// bolme islemi yapilan iki sayi da int oldugu icin java sonucu int yazzdirir
		
		double sayi8=4;
		System.out.println(sayi6/sayi8);// bolme islemi yapilan sayilardan biri double oldugu icin java virgulden sonraki kismi da yazdirir
		
		double sayi9=17;
		System.out.println(sayi9/sayi7);
	}

}
