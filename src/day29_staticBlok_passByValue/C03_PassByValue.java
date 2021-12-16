package day29_staticBlok_passByValue;

public class C03_PassByValue {

	public static void main(String[] args) {
		// Main method'dan diger method'lara veya diger method'lardan main method'a bir variable gonderirseniz,
		// Java orjinal variable'lari degil onlarin degerlerini(value) goturur, orjinal variable'in degeri degismez

				int fiyat = 100;

				System.out.println(indirimYap25(fiyat));
				System.out.println("method'dan sonra main method'daki fiyat : " + fiyat);
				
				System.out.println(indirimYap10(fiyat));
				System.out.println("method'dan sonra main method'daki fiyat : " + fiyat);
				
				fiyat=indirimYap10(fiyat);
				System.out.println("assignment'dan sonra main method'daki fiyat : " + fiyat);
			}

			private static int indirimYap10(int tutar) {

				tutar *= 0.90;
			
				return tutar;

			}

			private static int indirimYap25(int ucret) {

				ucret *= 0.75;
			
				return ucret;

			}

		}