package day08_IfElsestatement;

import java.util.Scanner;

public class C04_IfElse {

	public static void main(String[] args) {
		
		//Kullanicidan bir ucgenin uc kenar uzunlugunu alin
	//			eger uc kenar uzunlugu birbirine esit ise ekrana “Eskenar ucgen” yazdirin.
	//			Diger durumlarda ekrana  “Eskenar degil” yazdirin.
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen ucgenin kenar uzunluklarini girin");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		double kenar3=scan.nextDouble();
		
		if (kenar1==kenar2 && kenar1==kenar3) {
			System.out.println("eskenar ucgen");
		} else {
            System.out.println("eskenar ucgen degil");
		}
		scan.close();
	}

}
