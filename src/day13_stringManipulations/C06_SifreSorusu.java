package day13_stringManipulations;

import java.util.Scanner;

public class C06_SifreSorusu {

	public static void main(String[] args) {
		//Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        //isim-soyisim : M***** B*******
       // kart no : **** **** **** 1234
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen isminizi giriniz");
		String name=scan.next();
		
		System.out.println("Lutfen soyisminizi giriniz");
		String surname=scan.next();
		
		System.out.println("Lutfen 16 karakterli KK numaranizi bosluk birakmadan yaziniz");
		String kkNo=scan.next();
		
		String nameFormat=name.substring(0,1).toUpperCase()+name.substring(1).replaceAll("\\w","*");
		String surnameFormat=surname.substring(0,1).toUpperCase()+surname.substring(1).replaceAll("\\w","*");
		String kkNoFormat="**** **** **** "+kkNo.substring(12);
		
		System.out.println("Isim-soyisim : "+nameFormat+" "+surnameFormat);
		System.out.println("kart no : "+kkNoFormat);
		
		scan.close();

	}

}
