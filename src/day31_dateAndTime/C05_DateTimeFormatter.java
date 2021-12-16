package day31_dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormatter {

	public static void main(String[] args) {
		
		LocalDateTime tarihSaat=LocalDateTime.now();
		System.out.println(tarihSaat);
		
		// eger tarih ve saati kendi istedigimiz bicimde yazdirmak istersek
		// gun / ay / yil  saat:dakika
		
		DateTimeFormatter duzenle=DateTimeFormatter.ofPattern("dd / MMMM / YYYY EEEE HH : mm");
		System.out.println(duzenle.format(tarihSaat));
		
		/*
		 * format olustururken
		 * GUN
		  d : basta o varsa onu yazmadan gun numarasi
		  dd: tek haneli gunleri 02 gibi basina sifir yazarak gun numarasi
		 DDD: yilin kacinci gunu oldugunu yazar
		 E,EE,EEE : gun isminin ilk 3 harfi
		 EEEE : gun isminin tamamini
		 
		 AY(Ay icin M, dakika icin m kullanilir
		 M :basta 0 varsa onu yazmadan ay numarasi
		 MM:dd: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
		 MMM : Ay isminin ilk 3 harfi
		 MMMM : Ay isminin tamami
		 
		 YIL
		 YY : yilin son iki rakami
		 YYYY : yilin tamami
		 
		 SAAT
		 HH : saatin tamami
		 H  : tek rakamli saati olursa sadece saati
		 a yazarsak AM veya PM degerini yazar
		 */

	}

}
