package day11_stringManipulations;

public class C03_Lengh {

	public static void main(String[] args) {
		
		String str1="Ali Kahyaoglu";
		System.out.println(str1.length()); // 13
		// verilen str1'in son harfini yazdirin
		System.out.println(str1.charAt(str1.length()-1)); // u
		
		String str2="";
		System.out.println(str2.length()); // 0
		
		String str3=null;
		//System.out.println(str3.length()); // java.lang.NullPointerException
		
		//String str4;
		System.out.println(str3);
		//System.out.println(str4);//  Eger String'i olusturur ama deger atamazsak yazdirdigimizda hata aliriz
		
		// null pointer olusturduumuz fakat sonra kullanacagimiz bir String'i isaretlemek icin kullanilir 
		// Bir String'i yazdirdigimizda null cikiyorsa bunun turkcesi "ben bir degisken olusturdum ama henuz deger atamadim" dir

	}

}
