package day03_scanner;

public class C03_SwapVariables2 {

	public static void main(String[] args) {
		   // 2- Verilen sayi1 ve sayi2 variable’larinin degerlerini 
        //    3.bir variable olmadan degistiren (SWAP) bir program yapiniz
        
        int sayi1=15;
        int sayi2=20;
        
        // baslangicta sayi1=10 ve sayi2=20
        
        
        System.out.println("baslangicta sayi1=" + sayi1 + " ve sayi2=" + sayi2);

        // ucuncu bir variable olusturmayacaksak verilen sayilarin farkindan istifade diyoruz

        // ilk adim olarak sayilarin farkini ilk sayi1'e assign ediyorum
        sayi1=sayi1-sayi2;
        System.out.println(sayi1);
        
        // ikinci adim fark ile sayi2 yi toplayip sayi2'ye  assign ediyorum
        sayi2=sayi1+sayi2;
        System.out.println(sayi2);

        // ucuncu adim olarak sayi1'e sayi2-fark
        sayi1=sayi2-sayi1;
        System.out.println(sayi1);


        System.out.println("sonucta sayi1=" + sayi1 + " ve sayi2=" + sayi2);
	}

}
