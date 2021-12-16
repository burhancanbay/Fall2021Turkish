package day04_IncrementDecrement;

import java.util.Scanner;

public class C01_Scanner {

	public static void main(String[] args) {
		// kullanicidn ismini alip isminin bas harfini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen Isminizi Yaziniz");
        char name=scan.next().charAt(0);
        System.out.println("Isminizin Ilk Harfi : "+name);
        
        scan.close();
	}

}
