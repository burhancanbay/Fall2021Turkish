package day08_IfElsestatement;

import java.util.Scanner;

public class C03_IfElse {

	public static void main(String[] args) {
		// kullaniciya yasini sorun eger 65 den kucukse "emekli olamazsin,calismalisin"
		// 65 den buyukse "emekli olabilirsin" yazdirin
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen yasinizi girin");
		int yas=scan.nextInt();
		
		if (yas<65) {
			System.out.println("emekli olamazsin,calismalisin");
		} else {
            System.out.println("emekli olabilirsin");
		}
scan.close();
	}

}
