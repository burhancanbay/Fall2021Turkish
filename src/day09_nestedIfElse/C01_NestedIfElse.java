package day09_nestedIfElse;

import java.util.Scanner;

public class C01_NestedIfElse {

	public static void main(String[] args) {
		//  Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
	    //Kullanicidan bir sifre girmesini isteyin
	    //Eger ilk harf buyuk harf ise �A� olup olmadigini kontrol edin. Ilk harf A ise   �Gecerli Sifre�     degilse �Gecersiz Sifre� yazdirin.
	    //Eger ilk harf kucuk harf ise �z� olup olmadigini kontrol edin. Ilk harf z ise   �Gecerli Sifre�     degilse �Gecersiz Sifre� yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sifre giriniz");
		char ilkKarakter=scan.next().charAt(0);
		
		if (ilkKarakter>='A' && ilkKarakter<='Z') { // buyuk harfler
			if (ilkKarakter=='A') {
				System.out.println("Gecerli sifre");
			} else {
				System.out.println("Gecersiz sifre");
			}
			}
		else if (ilkKarakter>='a' && ilkKarakter<='z') { // kucuk harfler
			   if (ilkKarakter=='z') {
				   System.out.println("Gecerli sifre");
			 } else {
				   System.out.println("Gecersiz sifre");
			}
		}
		
		       else { // geriye kalan tum karakterler
		    	   System.out.println("Gecerli sifre olmasi icin harfle baslayiniz");

		}{

		}
		
		scan.close();
		
	}

}
