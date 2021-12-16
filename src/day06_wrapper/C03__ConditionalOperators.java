package day06_wrapper;

public class C03__ConditionalOperators {

	public static void main(String[] args) {


		// System.out.println(5+3==8 || 6+5==10 || 7-2==3); // true
		// System.out.println(5+3==8 && 6+5==10 && 7-2==3); // false
		
		int a=10;
		int b=20;
		int c=30;
		boolean sonuc=a>b ||b>c || a+b>=c ;
		System.out.println(sonuc); // true
		
		// && isareti & de kullanilabilir ancak arada bir nuans var
		// && isareti ilk false islemi bulduktan sonra geri kalan islemleri kontrol etmez
		// & isareti  soldan baslayip islemlerden birini false bulsa bile butun islemleri kontrol eder  
	    // System.out.println(5+3==8 && 6+5==10 && 7-2==3);

	    // System.out.println(5+3==8 & 6+5==10 & 7-2==3);
	    
	    int yas=50;
	    int boy=180;
	    char cinsiyetiniz='M';
	    
	    System.out.println(yas<30 && boy>170 && cinsiyetiniz=='M');
	}

}
