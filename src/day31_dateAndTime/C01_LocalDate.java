package day31_dateAndTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {

	public static void main(String[] args) {
		
		LocalDate tarih=LocalDate.now();
		System.out.println(tarih); // 2021-12-02
		
		System.out.println(tarih.getDayOfYear()); // 336
        System.out.println(tarih.getDayOfMonth()); // 2
		System.out.println(tarih.getMonthValue()); // 12
		System.out.println(tarih.getMonth()); // DECEMBER
		System.out.println(tarih.getDayOfWeek()); // THURSDAY

		System.out.println(tarih.plusDays(20));
		System.out.println(tarih.plusMonths(5));
		System.out.println(tarih.plusWeeks(15));
		System.out.println(tarih.plusYears(4));
		
		System.out.println(tarih.plusYears(10).plusMonths(10).plusDays(10));
		
		System.out.println(tarih.minusDays(20));
		System.out.println(tarih.minusWeeks(20));
		System.out.println(tarih.minusYears(5).minusMonths(5).minusDays(5));
		
		System.out.println(tarih.minusYears(21).isLeapYear()); // true
		
		LocalDate dogumTarihi1=LocalDate.of(1998,Month.JANUARY,12);
		LocalDate dogumTarihi2=LocalDate.ofYearDay(2000,136);
		LocalDate dogumTarihi3=LocalDate.of(1985,10,10);
		
		System.out.println(dogumTarihi1+","+dogumTarihi2);
		System.out.println(dogumTarihi1.isAfter(dogumTarihi2)); // false
		System.out.println(dogumTarihi3.isBefore(dogumTarihi1));// true
	}

}
