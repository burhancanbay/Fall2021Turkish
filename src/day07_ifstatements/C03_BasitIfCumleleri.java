package day07_ifstatements;

import java.util.Scanner;

public class C03_BasitIfCumleleri {

	public static void main(String[] args) {
		/*kullanicidan gun ismini aliniz ve haftaici veya hafta sonu oldugunu yazdiriniz
		*/

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen Gun Ismini Giriniz");
		String name=scan.next().toLowerCase();
		
		if (name.equals("pazar") || name.equals("cumartesi")) {
			System.out.println("hafta sonu");
		}

	if (name.equals("pazartesi") || name.equals("sali") || name.equals("carsamba") || name.equals("persembe") || name.equals("cuma"))  {
		System.out.println("hafta ici");
	}
	scan.close();
	}

}
