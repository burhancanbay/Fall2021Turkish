package day06_wrapper;

public class C01_WrapperClass {

	public static void main(String[] args) {
		
		// int sayi1=10;
		// Integer sayi2=20;
		
		// sayi1. yazdigimizda hic bir metod cikmaz, cunku sayi1 int'dir yani primitive dir
		// sayi2. yazdigimizda ise bircok metod geliyor,cunku sayi2 Integer'dir yani wrapper class'dir
		
		String tel1="3578987";
		String tel2="3245434";
		
		System.out.println(tel1+tel2);
		
		// bu sayilari toplamak istersek
		System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel2));
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		String caddeNo="203";
		String sokakNo="1564";
		System.out.println(Integer.valueOf(caddeNo)+Integer.valueOf(sokakNo));

	}

}
