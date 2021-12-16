package day04_IncrementDecrement;

public class C05_IncrementDecrement {

	public static void main(String[] args) {
		
		int sayi1=10;
		System.out.println(sayi1+=5);// bu islem sayi1'in degerini 5 arttirip sayi1'e assign ediyor 
		System.out.println(sayi1);   // dolayisiyla sayi1'in degeri kalici olarak degisir
		System.out.println(sayi1+12);// atama islemi olmadan yapilan toplama,cikarma vs islemler sadece o satirda yapilir 
		System.out.println(sayi1);// sayinin degerini kalici olarak degistirmez
	
		sayi1++;// her ne kadar esittir isareti olmasada sayi1++ isleminde assign vardir dolayisiyla sayi1 kalici olarak degisir
		System.out.println(sayi1);
	}

}
