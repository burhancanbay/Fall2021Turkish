package day20_scope;

public class InstanceVar {

	int notMat=50;
	int notFen;
	// instance variable'larin scope'unda main method yoktur
	
	public static void main(String[] args) {
		
 // System.out.println(notMat); // main method static oldugu icin static olmayan variable'lar direkt kullanilamaz veya goruntulenemez
		InstanceVar burhan=new InstanceVar();
		System.out.println(burhan.notMat);
		
		InstanceVar canbay=new InstanceVar();
		canbay.notMat=70;
		System.out.println(canbay.notMat);
		
		System.out.println(burhan.notMat);
		
		burhan.notMat=90;
		System.out.println(burhan.notMat);
		
		burhan.method2();// method2 static olmadigi icin main method'dan direct cagirilamaz
	}

	public static void staticMethod() {
		// System.out.println(notFen);// instance variable'lara static method'lardan direct ulasilamaz
		
	}
	
	public void method2() {
		System.out.println("method2'deki notfen : " +notFen); // bu method static olmadigi icin intance variable'lara ulasabilir
		// 
	}
}
