package day09_nestedIfElse;

public class C03_Ternary {

	public static void main(String[] args) {


		int x=10;
		
		String sonuc=x%2==0 ? "cift sayi" : "tek sayi"; // 1.yazim sekli
        System.out.println(sonuc);
        
        System.out.println(x%2==0 ? "cift sayi" : "tek sayi");// 2.yazim sekli
       
        System.out.println(x>5 ? "Aferin" : 4); // aferin ve 4 ortak bir data tipinde bulusturamadigimiz icin sadece syso ile yazdirabiliriz
	}

}
