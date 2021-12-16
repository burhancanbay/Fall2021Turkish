package day42_abstractClasses;

public class UstaBasi extends Isci {
	
	public void statu() {
		System.out.println("Bu class'daki tum personel ustabasidir.. imza:Ustabasi");
	}
	public void maas() {
		System.out.println("Ustabaslari aylik 10000 TL maas alir.. imza:Ustabasi");
	}
	public void mesai() {
		System.out.println("Ustabasi ariza durumunda ariza cozulunceye kadar calisir.. imza:Ustabasi");
	}

	
	// oje olustudugumuz en alttaki class parent class'daki method'lari override edince, 
	// class'dan olusturulan objeler en dogru ve spesipik ozelliklere kavustu
	
	// ama klasik parent-child iliskisinde tum methodlari override etme mecburoyeti yoktur
	// java parent class'lardaki tum method;lari override etmek mecburiyeti kazandirmak icin abstract class yapisini olusturmustur
	// yani bir class'i abstract olarak tanimlarsak child class'lar tum method'lari override etmek zorunda kalir
	
	// dolayisiyla abstract yaptigimiz parent class'lar sadece kalip gorevi yapacaklar
	public static void main(String[] args) {
		
		UstaBasi ust1=new UstaBasi();
		
		ust1.statu();
		ust1.maas();
		ust1.mesai();

	}

}
