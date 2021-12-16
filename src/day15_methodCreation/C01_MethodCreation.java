package day15_methodCreation;

import java.util.Scanner;

public class C01_MethodCreation {

	public static void main(String[] args) {
		// kullanicidan ismini ve soyismini isteyin
		// iki farkli method olusturun methodlardan biri girilen kelimeleri 
		// ilk harf buyuk digerleri kucuk olacak sekilde birlestirsin
		// 2.method isim ve soyismin ilk harfleri buyuk harf digerleri * olacak sekilde birlestirsin
		// kullaniciya isminin acik yazilmasi  veya gizlenmesi tercihi sorun
		// ve programin kalan kisminda isim ve soyismi kullanicinin istedigi sekilde kullanin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen isim ve soyisminizi giriniz \nisimden sonra enter'a basiniz");
		String name=scan.next();
		String surname=scan.next();
		
		System.out.println("Isminiz ve Soyisminizin acik sekilde yazilmasini istiyorsaniz 1"+
		"\nIlk harf haric gizli kalmasini istiyorsaniz 2'e basin");
		int tercih=scan.nextInt();
		// bu satira kadar kullanicidan ismini soyismini ve tercihini aldik
		String unionName=null;

		if (tercih==1) {
			unionName=openName(name,surname);
		} else if (tercih==2) {
			unionName=closeName(name,surname);
		} else {
            System.out.println("Lutfen 1 veya 2'den birini seciniz");
		}

		System.out.println("Kullanicinin tercihi : "+unionName);
		// bu satirdan itibaren kullanicinin isim ve soyismi kullanici tercihine gore kaydedildi
		scan.close();
		
	}

	public static String closeName(String name, String surname) {
		name=name.substring(0,1).toUpperCase()+name.substring(1).replaceAll("\\w","*");
		surname=surname.substring(0,1).toUpperCase()+surname.substring(1).replaceAll("\\w","*");
		return name+" "+surname;
		
	
		
	}

	public static String openName(String name, String surname) {
		name=name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
		surname=surname.substring(0,1).toUpperCase()+surname.substring(1).toLowerCase();
		return name+" "+surname;
		
		
	}

}
