package day04_IncrementDecrement;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen Dairenin Yaricapini Giriniz");
        double yaricap=scan.nextDouble();
        
        double cevre=2*3.14*yaricap;
        double alan=3.14*yaricap*yaricap;
        
        System.out.println("Dairenin cevresi : "+cevre);
        System.out.println("Dairenin alani : "+alan);
		
        scan.close();
	}

}
